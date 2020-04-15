
public class test
{




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





}
