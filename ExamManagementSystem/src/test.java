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
            LECTURE CODE(s): CharList(10)


            USER ID  /  PASSWORD  /  ACCOUNT TYPE  /  LECTURE CODE(s)  / *PASSWORD DATE
            .           .            .                .                   .
            .           .            .                .                   .
            .           .            .                .                   .
            .           .            .                .                   .

         */

         /*
            Design: LECTURE TABLE

            LECTURE CODE: Char(10)
            LECTURE NAME: Char(25)
            EXAM DATE: Date(DD.MM.YYYY)
            EXAM HOUR: Hour(HH:MM)

            Accesibility:
                STD: r- -- --
                LCT: r- w- --
                DEV: r- w- rw

            LECTURE CODE  /  LECTURE NAME  /  EXAM DATE  / EXAM HOUR  /  SUBJ
            .                .                .            .             .
            .                .                .            .             .
            .                .                .            .             .
            .                .                .            .             .

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


/*
OBSERVER NOTES V1

Comments and JUnit tests are needed
Check: String Compare ArrayList / == may not works in the main

 */

import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;


public class test {
    //xd


    //////////////////////DEV PART/////////////////////////////////////////
    //This part is used by DEV users menu
    public static void _getUserTable(ArrayList<_user> obj) {

        /*
        _getUserTable: This function gets _user ArrayList as obj parameter,
        prints the _user table if it is not null, returns void
        _user: Table includes USER ID, PASSWORD, ACCOUNT TYPE, LECTURE CODE, PASSWORD DATE
        */
        if (obj != null) {
            _user.print((ArrayList<_user>) obj);
        }
    }


    public static void _getLectureTable(ArrayList<_lecture> obj) {

        /*
        _getLectureTable: This function gets _lecture ArrayList as obj parameter,
        prints the _lecture table if it is not null, returns void
        _lecture: Table includes LECTURE CODE, LECTURE NAME, EXAM DATE, EXAM HOUR
        */
        if (obj != null) {
            _lecture.print((ArrayList<_lecture>) obj);
        }

    }


    public static void _getResultTable(ArrayList<_result> obj) {

        /*
        _getResultTable: This function gets _result ArrayList as obj parameter,
        prints the _result table if it is not null, returns void
        _result: Table includes STUDENT ID, LECTURE CODE, Midterm 1, Midterm 2, Final
        */
        if (obj != null) {
            _result.print((ArrayList<_result>) obj);
        }
    }


    public static void _examOverlap(ArrayList<_lecture> x) {

        /*
         _examOverlap: This functions gets _lecture ArrayList as x parameter, checks all the
         with the nested for loops EXAM DATE with getDATE() function from _lecture object,
         if finds any equalities gets the code of one overlapping exam date, then runs
         setDATE() function from _result object, gets new date from DEV. Returns void.
        */
        Scanner sc = new Scanner(System.in);

        String x1;
        String x2;
        for (int i = 0; i < x.size(); i++) {
            x1 = x.get(i).getDATE();
            for (int j = 0; j < x.size(); j++) {
                x2 = x.get(j).getDATE();
                if (x1.equalsIgnoreCase(x2)) {
                    System.out.println("OVERLAP FOUND!\nChange " + x.get(j).getCODE() + " Date");
                    System.out.println("FORMAT IS: YYYY-MM-DD");
                    x.get(j).setDATE(sc.next());
                    sc.close();

                }
            }
        }
    }
    ///////////////////////////////////////////////////////////////////////////////////

    ////////////////////////////////////////STD PART////////////////////////////////
    //This part is used by STD users menu
    public static void _getResults(ArrayList<_result> x, ArrayList<_user> y, String ID) {

        /*
        _getResults: This function gets _result ArrayList as x parameter, gets _user Arraylist
        as y and STD user String as ID, if ID is found in _user USER ID table, then checks _result
        table to find the same ID to print results with toString() function from _result object.
        Returns void.
        */

        String tempCODE;

        for (int i = 0; i < y.size(); i++) {
            if (ID == y.get(i).getID()) {
                tempCODE = y.get(i).getCODE();

                for (int j = 0; j < x.size(); j++) {
                    if (tempCODE.equalsIgnoreCase(x.get(j).getCODE())&& ID.equalsIgnoreCase(y.get(j).getID())) {
                        System.out.println(_result.toString(x.get(j)));
                    }
                }
            }
        }
    }

    public static void _getDate(ArrayList<_user> x, ArrayList<_lecture> y, String ID) {

        /*
        _getDate: This function gets _user ArrayList as x parameter, gets _lecture ArrayList as y
        parameter and STD user String as ID, if ID is found in _user USER ID table then gets
        the LECTURE CODE. After getting LECTURE CODE, checks _lecture table to print related
        date with getDATE() and hour with getHOUR() in the table. Returns void.
        */
        String tempCODE;

        for (int i = 0; i < x.size(); i++) {
            if (ID.equalsIgnoreCase(x.get(i).getID())) {
                tempCODE = x.get(i).getCODE();

                for (int j = 0; j < y.size(); j++) {
                    if (tempCODE.equalsIgnoreCase(y.get(j).getCODE())) {
                        System.out.println(y.get(j).getDATE() + " and " + y.get(j).getHOUR());

                    }
                }
            }
        }
    }
    ///////////////////////////////////////////////////////////////////////////////////

    ///////////////////////////////////LCT////////////////////////////////////////////
    //This part is used by LCT users menu
    public static void _setExamResults(ArrayList<_result> x, String CODE, String ID) {

        /*
        _setExamResults: This function gets _result ArrayList as x parameter, gets LCT input String
        as CODE and gets LCT input String as ID. If ID is found in _results table then gets inpurts
        from LCT to change _results table tuples that Midterm 1 with setMT1(), Midterm 2 with setMT2()
        and final with setFINAL() functions. If ID is not found, prints "No Lectures Found". Return void.
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("Changing Exam results of " + CODE);

        for (int i = 0; i < x.size(); i++) {
            if (CODE.equalsIgnoreCase(x.get(i).getCODE()) && ID.equalsIgnoreCase(x.get(i).getID())) {
                if (x.get(i).getMT1().equalsIgnoreCase("")) {
                    System.out.println("Changing Midterm 1 Result of " + CODE + " for Student " + ID);
                    x.get(i).setMT1(sc.nextLine());
                    sc.close();
                } else if (x.get(i).getMT2().equalsIgnoreCase("")) {
                    System.out.println("Changing Midterm 2 Resulf of " + CODE + " for Student " + ID);
                    x.get(i).setMT2(sc.nextLine());
                    sc.close();
                } else if (x.get(i).getFINAL().equalsIgnoreCase("")) {
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

        /*
        _setExamDate: This function gets _lecture ArrayList as x parameter, gets LCT input String
        as CODE. If CODE is found in _lecture table then gets inpurts from LCT to change _lecture table
        tuples that EXAM DATE with setDATE(), EXAM HOUR with setHOUR() and SUBJ with setSUBJ() functions.
        IF CODE is not found, prints  "$CODE NOT FOUND!". Returns void
        */
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < x.size(); i++) {
            if (CODE.equalsIgnoreCase(x.get(i).getCODE())) {
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
    //This part includes Global and Partial menu functions
    public static void _START(ArrayList<_user> userTest, ArrayList<_lecture> lectureTest, ArrayList<_result> resultTest)
    {
        /*
        _START(): This functions gets _users, _lecture, _result tables as parameters and runs _login() function with
        parameters. Returns void.
        */

        System.out.println("WELCOME TO EXAM MANAGEMENT SYSTEM\n");

        _login(userTest, lectureTest, resultTest);

    }

    public static void _login(ArrayList<_user> userTEST, ArrayList<_lecture> lectureTest, ArrayList<_result> resultTEST)
    {
        /*
            _login: This function gets _users, _lecture, _results tables as parameters, gets input ID from user,
            checks if ID found. then gets PASSWORD from user and checks if ID and PASSWORD are in the same row.
            If PASSWORD and ID are at the same row, runs _userTYPE() function with paramteres additionally ID as tempID
            and TYPE as tempTYPE. Also gets TYPE from _user table. Returns void.
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("ID?: ");
        String tempID = sc.nextLine();
        String tempPASS;
        String tempTYPE;
        for(int i = 0; i < userTEST.size(); i++)
        {
            //System.out.println(userTEST.get(1).getPASSWORD());
            if(userTEST.get(i).getID().equalsIgnoreCase(tempID)) //PASSED
            {
                System.out.println("PASSWD?: ");
                tempPASS = sc.next();
                //System.out.println("pass recorded");
                if(userTEST.get(i).getPASSWORD().equalsIgnoreCase(tempPASS)) //PASSED
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

        /*
        _userTYPE: This function gets user input parameters as ID and TYPE, also _user, _lecture, _result tables.
        Checks TYPE is valid. If TYPE valid, runs _DEVMENU(), _STDMENU(), _LCTMENU() functions to related types.
        */
        if(TYPE.equalsIgnoreCase("DEV") )//"DEV")
        {
            System.out.println("Welcome EXAM MANAGER");
            _DEVMENU(userTest, lectureTEST, resultTEST);
        }
        else if(TYPE.equalsIgnoreCase("STD")) // "STD")
        {
            System.out.println("Welcome STUDENT");
            _STDMENU(userTest, lectureTEST, resultTEST, ID);
        }
        else if(TYPE .equalsIgnoreCase("LCT")) //"LCT")
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
        /*
        _DEVMENU: This function shows and runs DEV related functions in as switch-case within a loop
         */
        boolean boolTEMP = true;
        int intTEMP = 0;
        Scanner sc = new Scanner(System.in);

        while(boolTEMP)
        {
            System.out.println("Choose one:\tUser Table(1)\tLecture Table(2)\tResult Table(3)\tCheck Overlap(4)\tExit(5)");
            intTEMP = sc.nextInt();
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
                    break;

                default:
                    System.out.println("Wrong Choice, try Again");
                    break;
            }

        }
        System.out.println("BYE MANAGER");
    }

    public static void _STDMENU(ArrayList<_user> x, ArrayList<_lecture> y, ArrayList<_result> z, String ID)
    {

        /*
        _STDMENU: This function shows and runs STD related functions in as switch-case within a loop
        */
        boolean boolTEMP = true;
        int intTEMP;
        Scanner sc = new Scanner(System.in);

        while(boolTEMP) {
            System.out.println("Choose one:\tGet Result(1)\tGet Exam Date(2)\t Exit(3)");
            intTEMP = sc.nextInt();
            switch (intTEMP)
            {
                case 1:
                    _getResults(z, x, ID);
                    break;

                case 2:
                    _getDate(x, y, ID);
                    break;

                case 3:
                    System.out.println("Terminating");
                    boolTEMP = false;
                    break;

                default:
                    System.out.println("Wrong Choice, try Again");
                    break;

            }

        }
        System.out.println("BYE STUDENT");
    }

    public static void _LCTMENU(ArrayList<_lecture> x, ArrayList<_result> y)
    {
          /*
        _LCTMENU: This function shows and runs LCT related functions in as switch-case within a loop
        */
        boolean boolTEMP = true;
        int intTEMP;
        Scanner sc = new Scanner(System.in);
        String tempID;
        String tempCODE;

        String TempDATE;
        String tempHOUR;

        while (boolTEMP)
        {
            System.out.println("Choose one:\tSet Exam Results(1)\tSet Exam Date(2)\tCheck Overlap(3)\tExit(4)");
            intTEMP = sc.nextInt();
            switch (intTEMP)
            {
                case 1:
                    System.out.println("Which Student?");
                    tempID = sc.nextLine();
                    System.out.println("Which LECTURE?");
                    tempCODE = sc.nextLine();
                    _setExamResults(y, tempCODE, tempID);
                    break;

                case 2:
                    System.out.println("Which Lecture?");
                    tempCODE = sc.nextLine();
                    _setExamDate(x, tempCODE);
                    _examOverlap(x);
                    break;

                case 3:
                    System.out.println("Terminating");
                    boolTEMP = false;
                    break;

                case 4:
                    _examOverlap(x);

                default:
                    System.out.println("Wrong Choice");
                    break;

            }
        }
    }

    ///////////////////////////////////////////////////////////////////////////////

    public static void main(String[] args) {

        ArrayList<_user> denemeUser = _user._createUserTable();
        ArrayList<_lecture> denemeLecture = _lecture._createLectureTable();
        ArrayList<_result> denemeResult = _result._createResultTable();

        /*
         _user.print(denemeUser);
        System.out.println(" ");
        _lecture.print(denemeLecture);
        System.out.println(" ");
        _result.print(denemeResult);
        */
        _START(denemeUser, denemeLecture, denemeResult);
    }



}