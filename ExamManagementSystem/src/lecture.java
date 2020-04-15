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
        lectureList.add(new _lecture("CS50", "COMP SCI", "2020-5-5", "15-00", "All Documents"));
        lectureList.add(new _lecture("SE60", "NEURO", " ", " ", " "));
        lectureList.add(new _lecture("SE318","SVAS","2020-6-1","16.00","All Documents"));
        lectureList.add(new _lecture("SE311","Soft.Arch.","2020-5-10","18.00","Week 4-14"));
        lectureList.add(new _lecture("CE223","Database","2020-6-5","12.00","Week 6-14"));
        lectureList.add(new _lecture("SE116","Programming","2020-5-9","09.00","All Documents"));
        lectureList.add(new _lecture("SE221","Algorithms","2020-5-4","16.00",""));
        lectureList.add(new _lecture("MATH240","Prob.","2020-6-8","14.00","All Documents"));
        lectureList.add(new _lecture("CE306","NETWORK","2020-6-2","16.00","All documents-LABS"));
        lectureList.add(new _lecture("SE476","COMP&MUSIC","2020-5-20","16.00","WEEK 4-14"));
        lectureList.add(new _lecture("FIZ1","Physics","2020-6-3","11.00","WEEK 4-14"));
        lectureList.add(new _lecture("MATH153","MATH.","2020-5-29","12.00",""));
        lectureList.add(new _lecture("CS303","COMP.SCIENCE","2020-6-6","16.00","All Documents"));
        lectureList.add(new _lecture("ARCH400","ARCH.D.","2020-5-28","10.00","WEEK 5-13"));
        lectureList.add(new _lecture("ARCH200","ARCH.M.","2020-5-27","11.00","All Documents"));
        lectureList.add(new _lecture("SE360","NUM.ANAL.","2020-5-25","9.00",""));
        lectureList.add(new _lecture("SE308","O.S.","2020-6-12","10.00","All Documents"));



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
