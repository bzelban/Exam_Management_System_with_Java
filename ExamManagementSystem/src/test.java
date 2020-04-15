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


import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;


public class test {


    //////////////////////DEV PART/////////////////////////////////////////
    public static void _getUserTable(Object obj) {

        if (obj != null) {
            _user.print((ArrayList<_user>) obj);
        }
    }

    public static void _getLectureTable(Object obj) {
        if (obj != null) {
            _lecture.print((ArrayList<_lecture>) obj);
        }

    }

    public static void _getResultTable(Object obj) {
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


    ////////////////////////////////////////////////////////////////////////////////



    public static void main (String[]args ){

        System.out.println("WELCOME TO EXAM MANAGEMENT SYSTEM\n");

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