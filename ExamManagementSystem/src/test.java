// SE311, Software Verification and Validation Project
// Exam Management System

/*
~~~~~~~~~~~~~~~~~~~~~~ Observer ~~~~~~~~~~~~~~~~~~~~~~~~
         Sir, Lancelot, Highlander, Lord, His Holiness Serhat UZUNBAYIR
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



import java.util.Scanner;

public class test
{

    public void _login(String ID, String passwd)
    {
        //To-Do Need a database module to connect (Better JDBS)
        //To-Do Need a Return Type as BOOLEAN

        //Annotated Design: USER TABLE

    }

    public void _getExamDate(String ID)
    {
        //To-Do Need a database module to connect for EXAM DATES THAT RESPONSIBLE TO A SINGLE LECTURE CODE
        //To-Do Need a Return Type as DATE

        //Annotated Design: LECTURE TABLE

    }

    public void _setExamDate(String ID)
    {
        //To-Do Need a database module to connect for SET DATES THAT RESPONSIBLE TO A SINGLE LECTURE CODE

        //Annotated Design: LECTURE TABLE

        //This block Controls the Overlap
        if()
        {

        }
        else
        {

        }

    }




    public static void _consoleMenu()
    {
        //To-Do: This part is to show and control
        String tempID = "";
        String tempPASS= "";
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

                    break;

                case 2:

                    break;

                case 3:

                    break;
            }


        }

        //LCT While Loop
        while ( menuCycle == true )
        {
            System.out.println("Select One:\n\t(1) to Show Exam Dates\n\t(2) to See Exam Scores\n\t(3) to Terminate");

        }


        //ADMIN While Loop
        while ( menuCycle == true )
        {

        }


        System.out.println("STAY SAFE GÜLÜM...");
    }




    public static void main(String[] args)
    {
        System.out.println("1 2 3 mic check");

        System.out.println("WELCOME TO EXAM MANAGEMENT SYSTEM");

        _consoleMenu();



    }
}
