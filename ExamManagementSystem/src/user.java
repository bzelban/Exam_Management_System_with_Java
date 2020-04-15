import java.util.ArrayList;

class _user {

    String ID;
    String PASSWORD;
    String TYPE;
    String CODE;
    String PW_DATE;

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }

    public void setTYPE(String TYPE) {
        this.TYPE = TYPE;
    }

    public void setCODE(String CODE) {
        this.CODE = CODE;
    }

    public void setPW_DATE(String PW_DATE) {
        this.PW_DATE = PW_DATE;
    }


    public String getID() {
        return ID;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public String getTYPE() {
        return TYPE;
    }

    public String getCODE() {
        return CODE;
    }

    public String getPW_DATE() {
        return PW_DATE;
    }





    public _user(String ID, String PASSWORD, String TYPE, String CODE, String PW_DATE)
    {
        this.ID = ID;
        this.PASSWORD = PASSWORD;
        this.TYPE = TYPE;
        this.CODE = CODE;
        this.PW_DATE = PW_DATE;
    }

    public static ArrayList<_user> _createUserTable()
    {

        ArrayList<_user> userList = new ArrayList<>();
        userList.add(new _user("ID", "PASSWORD", "TYPE", "CODE", "PW_DATE"));

        userList.add(new _user("0000", "0000", "AAA", "XXX", "1970-1-1"));
        userList.add(new _user("1111", "1111", "DEV", "", "2020-1-1"));
        userList.add(new _user("2222", "2222", "LCT", "", "2020-1-1"));
        userList.add(new _user("3333", "3333", "STD", "CS50", "2020-1-1"));
        userList.add(new _user("4444", "4444", "STD", "SE318", "2020-5-5"));
        userList.add(new _user("5555", "5555", "LCT", "", "2020-5-6"));
        userList.add(new _user("6666", "6666", "DEV", "", "2020-5-5"));
        userList.add(new _user("7777", "7777", "STD", "SE311", "2020-6-10"));
        userList.add(new _user("8888", "8888", "LEC", "", "2020-6-14"));
        userList.add(new _user("9999", "9999", "STD", "SE360", "2020-5-20"));
        userList.add(new _user("1112", "1112", "LEC", "", "2020-5-15"));
        userList.add(new _user("1113", "1113", "STD", "SE116", "2020-6-20"));
        userList.add(new _user("1114", "1114", "STD", "FIZ1", "2020-5-1"));
        userList.add(new _user("1115", "1115", "STD", "MATH240", "2020-7-11"));
        userList.add(new _user("1116", "1116", "STD", "SE318", "2020-5-14"));
        userList.add(new _user("1117", "1117", "STD", "SE311", "2020-6-3"));
        userList.add(new _user("1118", "1118", "STD", "SE308", "2020-5-30"));



        return userList;
    }


    public static String toString(_user x) {
        String print=x.getID() +"  "+  x.getPASSWORD() +"  "+ x.getTYPE() +"  "+ x.getCODE() + "  "+ x.getPW_DATE();
        return print;
    }

    public  static void print(ArrayList<_user> userTable){

        for(int i =0; i<userTable.size(); i++){
            System.out.println(toString(userTable.get(i)));
        }
    }
}
