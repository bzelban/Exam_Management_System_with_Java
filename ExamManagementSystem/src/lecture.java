import java.util.ArrayList;

class _lecture {
    String CODE;
    String NAME;
    String DATE;
    String HOUR;
    String SUBJ;

    public String getCODE() {
        return CODE;
    }

    public void setCODE(String CODE) {
        this.CODE = CODE;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getDATE() {
        return DATE;
    }

    public void setDATE(String DATE) {
        this.DATE = DATE;
    }

    public String getHOUR() {
        return HOUR;
    }

    public void setHOUR(String HOUR) {
        this.HOUR = HOUR;
    }

    public String getSUBJ() { return SUBJ; }

    public void setSUBJ(String SUBJ) { this.SUBJ = SUBJ; }



    public _lecture(String CODE, String NAME, String DATE, String HOUR, String SUBJ)
    {
        this.CODE = CODE;
        this.NAME = NAME;
        this.DATE = DATE;
        this.HOUR = HOUR;
        this.SUBJ = SUBJ;
    }

    public static ArrayList<_lecture> _createLectureTable()
    {
        ArrayList<_lecture> lectureList = new ArrayList<>();
        lectureList.add(new _lecture("CODE", "NAME", "DATE", "HOUR", " "));
        lectureList.add(new _lecture("CS50", "COMP SCI", "2020-5-5", "15-00", "Section 1-2"));
        lectureList.add(new _lecture("SE60", "NEURO", " ", " ", " "));

        return lectureList;

    }

    public static String toString(_lecture x) {
        String print= x.getCODE() +"  "+  x.getNAME() +"  "+ x.getDATE() + "  " + x.getHOUR() + " " + x.getSUBJ();
        return print  ;
    }

    public  static void print(ArrayList<_lecture> lectureTable){

        for(int i =0; i<lectureTable.size(); i++){
            System.out.println(toString(lectureTable.get(i)));
        }
    }
}
