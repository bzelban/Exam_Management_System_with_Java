// SE311, Software Verification and Validation Project
// Exam Management System

/*
~~~~~~~~~~~~~~~~~~~~~~ Observer ~~~~~~~~~~~~~~~~~~~~~~~~
         Lancelot, Highlander, Lord, His Holiness, Sir S. UZUNBAYIR
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
*/


/*
    THE COMMENT BLOCK OF THE PARTICIPANTS
    - Bedirhan Z. ELBAN
    - Mert DOYURGAN
    - Berk YILMAZ
    -

 */



        /*
            Design: USER TABLE

            Accesibility:
                STD: -- -- --
                LCT: -- -- --
                DEV: r- w- rw

            User ID: Char(11)
            PASSWORD: Char(6-12)
            ACCOUNT TYPE: STD, LCT, DEV
            LECTURE CODE(s): CharList(4)


            USER ID  /  PASSWORD  /  ACCOUNT TYPE  /  LECTURE CODE(s)  / *PASSWORD DATE
            .           .            .                .                   .
            .           .            .                .                   .
            .           .            .                .                   .
            .           .            .                .                   .

         */

         /*
            Design: LECTURE TABLE

            LECTURE CODE: Char(4)
            LECTURE NAME: Char(25)
            EXAM DATE: Date(DD.MM.YYYY)
            EXAM HOUR: Hour(HH:MM)

            Accesibility:
                STD: r- -- --
                LCT: r- w- --
                DEV: r- w- rw

            LECTURE CODE  /  LECTURE NAME  /  EXAM DATE  / EXAM HOUR
            .                .                .            .
            .                .                .            .
            .                .                .            .
            .                .                .            .

         */

         /*
            Design: RESULT TABLE of SPECIFIC LECTURE

            Description:
                Exams must have standarts, like: x Midterms, y Final
                Multiple Table's need to be created by ADMIN

            Accesibility:
                STD: r- -- --
                LCT: r- w- rw
                DEV: r- w- rw

            STUDENT ID   /  LECTURE CODE  /  Midterm 1  /  Midterm 2  /  Final
            .               .                .             .             .
            .               .                .             .             .
            .               .                .             .             .
            .               .                .             .             .

          */



import java.util.*;
import java.io.*;
import java.util.Date;
import java.lang.*;


class _user{
    String ID; String PASSWORD; String TYPE; String CODE; String PWDATE;
    public _user(String ID, String PASSWORD, String TYPE, String CODE, String PWDATE)
    {
        this.ID = ID; this.PASSWORD = PASSWORD; this.TYPE = TYPE; this.CODE = CODE; this.PWDATE = PWDATE;
    }
}

class _lecture{
    String CODE; String NAME; String DATE; String HOUR;
    public _lecture(String CODE, String NAME, String DATE, String HOUR)
    {
        this.CODE = CODE; this.NAME = NAME; this.DATE = DATE; this.HOUR = HOUR;
    }
}
class _result{
    String ID; String CODE; String MT1; String MT2; String FINAL;
    public _result(String ID, String CODE, String MT1, String MT2, String FINAL)
    {
        this.ID = ID; this.CODE = CODE; this.MT1 = MT1; this.MT2 = MT2; this.FINAL = FINAL;
    }
}


public class test
{

    public static ArrayList<_result> _createResultTable()
    {
        ArrayList<_result> resultList = new ArrayList<>();
        resultList.add(new _result("ID", "CODE", "MT1", "MT2", "FINAL"));
        resultList.add(new _result("3333", "CS50", "80", "", "" ));
        resultList.add(new _result("333", "SE60", "50", "45", "40"));

        return resultList;
    }

    public static ArrayList<_lecture> _createLectureTable()
    {
        ArrayList<_lecture> lectureList = new ArrayList<>();
        lectureList.add(new _lecture("CODE", "NAME", "DATE", "HOUR"));
        lectureList.add(new _lecture("CS50", "COMP SCI", "2020-5-5", "15-00"));
        lectureList.add(new _lecture("SE60", "NEURO", " ", " "));

        return lectureList;
        //functor
    }

    public static ArrayList<_user> _createUserTable()
    {

        ArrayList<_user> userList = new ArrayList<>();
        userList.add(new _user("0000", "0000", "AAA", "XXX", "1970-1-1"));
        userList.add(new _user("ID", "PASSWORD", "TYPE", "CODE", "PWDATE"));
        userList.add(new _user("1111", "1111", "DEV", "", "2020-1-1"));
        userList.add(new _user("2222", "2222", "LCT", "", "2020-1-1"));
        userList.add(new _user("3333", "3333", "STD", "CS50", "2020-1-1"));

        return userList;
    }

    /*
    public void _login(String ID, String passwd)
    {
        boolean temp = true;
        boolean tempPass = true;
        int tempInt = 3;

       while (temp)
       {
           if ( ID == db.ID)
           {
               while(tempPass)
               {
                   if(passwd == db.PASSWORD)
                   {
                       _consoleMenu();
                   }
                   else
                   {
                       System.out.println("Wrong Pass");

                   }
                   tempInt --;
                   System.out.println(tempInt + " try left ");
               }
           }
           else
           {
               System.out.println("Wrong ID");
           }
            tempInt --;
           System.out.println(tempInt + " try left");

           if(tempInt == 0)
           {
               temp = false;
           }

           System.out.println("Worng Credential Combination, Terminating");
       }


    }

    public void _getExamDate(String ID)
    {

        if (db.ID == ID)
        {
            String tempLec = db.LECTURE;

            if(tempLec == db.EXAMDATE )
            {
               if(db.EXAMDATE.notNull())
               {
                   System.out.println(db.EXAMDATE);
               }
               else
               {
                   System.out.println("no exam date found");
               }
            }


        }
        else
        {
            System.out.println("Current Lecture not Found!");
        }

    }

    public void _getExamScore(String ID)
    {
        if(db.ID == ID)
        {
            String tempLec = db.LECTURE;

            if(tempLec == db.EXAMSCORE)
            {
                if(db.EXAMSCORE.notNull())
                {
                    System.out.println(db.EXAMSCORE);
                }
                else
                {
                    System.out.println("no exam score found");
                }
            }
        }
    }

    public void _setExamDate()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("input a lecture");
        String tempLec = sc.nextLine();

        System.out.println("input an exam date");
        Date tempDate = sc.nextDate();

        if(db.EXAMDATE =! tempDate)
        {

        }
        else
        {

        }

    }




    public static void _consoleMenu(String ID)
    {
        int freshPass = current.DATE - db.PASSDATE;
        Scanner sc = new Scanner(System.in);

        if( freshPass > 180 )
        {
            System.out.println("Your pass isnt fresh, Change it.\n New Pass:");
            db.PASSWORD = sc.nextLine();
            System.out.println("Changed");
        }

        boolean menuCycle = true;
        int tempSwitch = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Login to the system\nID:  "); tempID = sc.nextLine();
        System.out.println("PASSWORD: ");  tempPASS = sc.nextLine();

        //_login(tempID, tempPASS);

        //STD While Loop
        while( menuCycle == true )
        {
            System.out.println("Select One:\n\t(1) to Get Exam Dates\n\t(2) to Get Exam Scores\n\t(3) to Terminate");

            switch (tempSwitch)
            {
                case 1:

                    _getExamDate(ID);
                    break;

                case 2:

                    _getExamScore(ID);
                    break;

                case 3:
                    System.out.println("Bye");
                    System.exit(31);
                    break;
            }


        }

        //LCT While Loop
        while ( menuCycle == true )
        {
            System.out.println("Select One:\n\t(1) to Show Exam Dates\n\t(2) add Exam Scores\n\t(3) to Terminate");


        }


        //ADMIN While Loop
        while ( menuCycle == true )
        {
            System.out.println("Automated");
        }


        System.out.println("STAY SAFE GÜLÜM...");
    }




    */
    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("WELCOME TO EXAM MANAGEMENT SYSTEM");


        ArrayList<_user> testList = _createUserTable();

        System.out.println(testList.toString());









    }
}
