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
