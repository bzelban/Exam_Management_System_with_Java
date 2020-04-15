// SE311, Software Verification and Validation Project
// Exam Management System

/*
~~~~~~~~~~~~~~~~~~~~~~ Observer ~~~~~~~~~~~~~~~~~~~~~~~~
         Lancelot, Highlander, Lord, His Holiness, Sir S. UZUNBAYIR
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
*/


/*
    THE COMMENT BLOCK OF THE PARTICIPANTS NAMES
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


import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;


public class test {


    //////////////////////DEV PART/////////////////////////////////////////
    public static void _getUserTable(ArrayList<_user> obj) {

        if (obj != null) {
            _user.print((ArrayList<_user>) obj);
        }
    }

    public static void _getLectureTable(ArrayList<_lecture> obj) {
        if (obj != null) {
            _lecture.print((ArrayList<_lecture>) obj);
        }

    }

    public static void _getResultTable(ArrayList<_result> obj) {
        if (obj != null) {
            _result.print((ArrayList<_result>) obj);
        }
    }

    public static void _examOverlap(ArrayList<_lecture> x) {
        Scanner sc = new Scanner(System.in);

        String x1;
        String x2;
        for (int i = 0; i < x.size(); i++) {
            x1 = x.get(i).getDATE();
            for (int j = 0; j < x.size(); j++) {
                x2 = x.get(j).getDATE();
                if (x1 == x2) {
                    System.out.println("OVERLAP FOUND!\nChange " + x.get(j).getCODE() + " Date");
                    System.out.println("FORMAT IS: YYYY-MM-DD");
                    x.get(j).setDATE(sc.nextLine());
                    sc.close();

                }
            }
        }
    }
    ///////////////////////////////////////////////////////////////////////////////////

    ////////////////////////////////////////STD PART////////////////////////////////
    public static void _getResults(ArrayList<_result> x, ArrayList<_user> y, String ID) {

        String tempCODE;

        for (int i = 0; i < y.size(); i++) {
            if (ID == y.get(i).getID()) {
                tempCODE = y.get(i).getCODE();

                for (int j = 0; j < x.size(); j++) {
                    if (tempCODE == x.get(j).getCODE() && ID == y.get(j).getID()) {
                        System.out.println(_result.toString(x.get(j)));
                    }
                }
            }
        }
    }

    public static void _getDate(ArrayList<_user> x, ArrayList<_lecture> y, String ID) {

        String tempCODE;

        for (int i = 0; i < x.size(); i++) {
            if (ID == x.get(i).getID()) {
                tempCODE = x.get(i).getCODE();

                for (int j = 0; j < y.size(); j++) {
                    if (tempCODE == y.get(j).getCODE()) {
                        System.out.println(y.get(j).getDATE() + " and " + y.get(j).getHOUR());

                    }
                }
            }
        }
    }
    ///////////////////////////////////////////////////////////////////////////////////

    ///////////////////////////////////LCT////////////////////////////////////////////
    public static void _setExamResults(ArrayList<_result> x, String CODE, String ID) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Changing Exam results of " + CODE);

        for (int i = 0; i < x.size(); i++) {
            if (CODE == x.get(i).getCODE() && ID == x.get(i).getID()) {
                if (x.get(i).getMT1() == " ") {
                    System.out.println("Changing Midterm 1 Result of " + CODE + " for Student " + ID);
                    x.get(i).setMT1(sc.nextLine());
                    sc.close();
                } else if (x.get(i).getMT2() == " ") {
                    System.out.println("Changing Midterm 2 Resulf of " + CODE + " for Student " + ID);
                    x.get(i).setMT2(sc.nextLine());
                    sc.close();
                } else if (x.get(i).getFINAL() == " ") {
                    System.out.println("Changing Final Resulf of " + CODE + " for Student " + ID);
                    x.get(i).setFINAL(sc.next());
                    sc.close();
                } else {
                    System.out.println("No Lectures Found");
                }
            }

        }


    }

    public static void _setExamDate(ArrayList<_lecture> x, String CODE) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < x.size(); i++) {
            if (CODE == x.get(i).getCODE()) {
                System.out.println("Setting Exam Date\nGive exam date as YYYY-MM-DD");
                x.get(i).setDATE(sc.nextLine());
                System.out.println("Give exam hour as HH-MM");
                x.get(i).setHOUR(sc.nextLine());
                System.out.println("Give Subjects");
                x.get(i).setSUBJ(sc.nextLine());
                sc.close();

                System.out.println(x.get(0).toString());
                System.out.println(x.get(i).toString());

            } else {
                System.out.println(CODE + " NOT FOUND!");
            }
        }
    }
    ////////////////////////////////////////////////////////////////////////////////

    ////////////////////////////////MENU PART///////////////////////////////////////
    public static void _START(ArrayList<_user> userTest, ArrayList<_lecture> lectureTest, ArrayList<_result> resultTest)
    {
        System.out.println("WELCOME TO EXAM MANAGEMENT SYSTEM\n");

        _login(userTest);

    }

    public static void _login(ArrayList<_user> userTEST, ArrayList<_lecture> lectureTest, ArrayList<_result> resultTEST)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ID?: ");
        String tempID = sc.nextLine();
        String tempPASS;
        String tempTYPE;
        for(int i = 0; i < userTEST.size(); i++)
        {
            if(userTEST.get(i).getID() == tempID)
            {
                System.out.println("PASSWD?: ");
                tempPASS = sc.nextLine();
                if(userTEST.get(i).getPASSWORD() == tempPASS)
                {
                    System.out.println("Login Success");
                    tempTYPE = userTEST.get(i).getTYPE();
                    _userTYPE(tempID, tempTYPE, userTEST, lectureTest, resultTEST);
                }
            }
        }
    }


    public static void _userTYPE(String ID, String TYPE, ArrayList<_user> userTest, ArrayList<_lecture> lectureTEST, ArrayList<_result> resultTEST )
    {
        if(TYPE == "DEV")
        {
            System.out.println("Welcome EXAM MANAGER");
            _DEVMENU(userTest, lectureTEST, resultTEST);
        }
        else if(TYPE == "STD")
        {
            System.out.println("Welcome STUDENT");
            _STDMENU(userTest, lectureTEST, resultTEST, ID);
        }
        else if(TYPE == "LCT")
        {
            System.out.println("Welcome LECTURER");
            _LCTMENU(lectureTEST, resultTEST);
        }
        else
        {
            System.out.println("WARNING WRONG USER TYPE, Please contact to the MANAGEMENT DEPARTMENT");
            System.exit(31);
        }
    }

    public static void _DEVMENU(ArrayList<_user> x, ArrayList<_lecture> y, ArrayList<_result> z)
    {
        boolean boolTEMP = true;
        int intTEMP = 0;

        while(boolTEMP)
        {
            System.out.println("Choose one:\tUser Table(1)\tLecture Table(2)\tResult Table(3)\tCheck Overlap(4)\tExit(5)");
            switch (intTEMP)
            {
                case 1:
                    _getUserTable(x);
                    break;

                case 2:
                    _getLectureTable(y);
                    break;

                case 3:
                    _getResultTable(z);
                    break;

                case 4:
                    _examOverlap(y);
                    break;

                case 5:
                    System.out.println("Terminating");
                    boolTEMP = false;

                case default:
                    System.out.println("Wrong Choice, try Again");
                    break;
            }

        }
        System.out.println("BYE MANAGER");
    }

    public static void _STDMENU(ArrayList<_user> x, ArrayList<_lecture> y, ArrayList<_result> z, String ID)
    {

    }

    public static void _LCTMENU(ArrayList<_lecture> x, ArrayList<_result> y,)
    {

    }
    ///////////////////////////////////////////////////////////////////////////////

    public static void main(String[] args) {



        ArrayList<_user> denemeUser = _user._createUserTable();
        ArrayList<_lecture> denemeLecture = _lecture._createLectureTable();
        ArrayList<_result> denemeResult = _result._createResultTable();


        _user.print(denemeUser);
        System.out.println(" ");
        _lecture.print(denemeLecture);
        System.out.println(" ");
        _result.print(denemeResult);


    }


}