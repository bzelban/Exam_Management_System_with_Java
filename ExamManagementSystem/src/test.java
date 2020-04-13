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

            STUDENT ID   /  Midterm 1  /  Midterm 2  /  Final
            .               .             .             .
            .               .             .             .
            .               .             .             .
            .               .             .             .

          */



import java.util.*;
import java.io.*;
import java.sql.*;
import java.util.Date;

public class test
{

    public static void _topSector() {




    }

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




    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("WELCOME TO EXAM MANAGEMENT SYSTEM");






    }
}
