import java.util.ArrayList;

class _result {
    String ID;
    String CODE;
    String MT1;
    String MT2;
    String FINAL;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getCODE() {
        return CODE;
    }

    public void setCODE(String CODE) {
        this.CODE = CODE;
    }

    public String getMT1() {
        return MT1;
    }

    public void setMT1(String MT1) {
        this.MT1 = MT1;
    }

    public String getMT2() {
        return MT2;
    }

    public void setMT2(String MT2) {
        this.MT2 = MT2;
    }

    public String getFINAL() {
        return FINAL;
    }

    public void setFINAL(String FINAL) {
        this.FINAL = FINAL;
    }



    public _result(String ID, String CODE, String MT1, String MT2, String FINAL)
    {
        this.ID = ID;
        this.CODE = CODE;
        this.MT1 = MT1;
        this.MT2 = MT2;
        this.FINAL = FINAL;
    }

    public static ArrayList<_result> _createResultTable()
    {
        ArrayList<_result> resultList = new ArrayList<>();
        resultList.add(new _result("ID", "CODE", "MT1", "MT2", "FINAL"));
        resultList.add(new _result("3333", "CS50", "80", "", "" ));
        resultList.add(new _result("333", "SE60", "50", "45", "40"));

        return resultList;
    }

    public static String toString(_result x) {
        String print =x.getID() +"  "+  x.getCODE() +"   "+ x.getMT1() +"   "+ x.getMT2() + "  "+ x.getFINAL();
        return  print;
    }

    public  static void print(ArrayList<_result> resultTable){

        for(int i =0; i<resultTable.size(); i++){
            System.out.println(toString(resultTable.get(i)));
        }
    }
}
