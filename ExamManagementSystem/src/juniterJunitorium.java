import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;


class juniterJunitorium {
    ArrayList<_user> denemeUser = _user._createUserTable();
    ArrayList<_lecture> denemeLecture = _lecture._createLectureTable();
    ArrayList<_result> denemeResult = _result._createResultTable();

    String str = "";

    //User object (ArrayList Database) POZITIVE is checks as ok
    @org.junit.jupiter.api.Test
    void _START() { // 1 - 5

        str = denemeUser.get(2).getID();
        assertEquals("1111", str);
        // Base User List is not Null and String ID checks ok

        str = denemeUser.get(2).getPASSWORD();
        assertEquals("1111", str);
        // PASSWORD checks ok

        str = denemeUser.get(2).getTYPE();
        assertEquals("DEV", str);
        // TYPE checks ok

        str = denemeUser.get(4).getCODE();
        assertEquals("CS50", str);
        // CODE checks are ok from different USR

        str = denemeUser.get(8).getPW_DATE();
        assertEquals("2020-6-10", str);
        // PW_DATE checks from different USR

    }

    /*
    //User object NEGATIVE is checks as OK
    void _START() { // 2 - 5

        str = denemeUser.get(11).getPASSWORD();
        assertEquals("1111", str);
        // Base User List is not Null and String. Also Password checks are ok

        str = denemeUser.get(11).getID();
        assertEquals("aaa", str);
        // ID checks are ok

        str = denemeUser.get(11).getTYPE();
        assertEquals("bbb", str);
        // TYPE checks are ok

        str = denemeUser.get(11).getCODE();
        assertEquals("lılıl", str);
        // CODE checks are ok

        str = denemeUser.get(11).getPW_DATE();
        assertEquals("bbbb", str);
        // PW_DATE checks are ok
    }

    //Lecture Object checks ok as pozitive
    @Test
    void _START() { // 3 - 1

        str = denemeLecture.get(2).getCODE();
        assertEquals("SE60", str);
        // Base Lecture List is not Null and String. Also CODE checks are ok
    }

    //Lecture object checks ok as negative
    @Test
    void _START() { // 4 - 1
        str = denemeLecture.get(5).getCODE();
        assertEquals("SE221", str);
        // Base Lecture List is not Null and String. Also Code checks are ok
    }

    //Result object checks ok as pozitive
    @Test
    void _START() { // 5 - 1
        str = denemeResult.get(2).getFINAL();
        assertEquals("40", str);
        // Base Result List is not Null and String. Also FINAL checks are ok
    }

    //Result object checks ok as negative
    @Test
    void _START() { // 6 - 2
        str = denemeResult.get(2).getMT1();
        assertEquals("50", str);
        // Base Result List is not Null and String. Also MT1 checks are ok

        str = denemeResult.get(2).getMT2();
        assertEquals("45", str);

    }
    */

    @org.junit.jupiter.api.Test
    void _getUserTable() { // 7 - 1

        str = denemeUser.get(5).getID();
        assertEquals("4444", str);
        // UserTable checks in _getUserTable as pozitive

    }

    /*
    @org.junit.jupiter.api.Test
    void _getUserTable() { // 8 - 1
        str = denemeUser.get(5).getID();
        assertEquals("3131", str);
        //UserTable checks in _getUserTable as negative
    }
    */

    @org.junit.jupiter.api.Test
    void _getLectureTable() { // 8 - 1
        str = denemeLecture.get(7).getCODE();
        assertEquals("SE221", str);
        //LectureTable checks in _getLectureTable() as Pozitive


    }

    /*
    @org.junit.jupiter.api.Test
    void _getLectureTable() // 9 - 1
    {
        str = denemeLecture.get(7).getCODE();
        assertEquals("MATH153", str);
        //LectureTable checks in_getLectureTable() as Negative
    }
    */

    @org.junit.jupiter.api.Test
    void _getResultTable() { // 10 - 1

        str = denemeResult.get(2).getFINAL();
        assertEquals("40", str);
        //ResulTable checks in _getResultTable() as Pozitive
    }

    /*
    @Test
    void _getResultTable() { // 11 - 1

        str = denemeResult.get(2).getFINAL();
        assertEquals("31", str);
        //ResultTable checks in _getResulTable() as Negative

    }
    */

    @org.junit.jupiter.api.Test
    void _examOverlap() { // 12 - 2

        str = denemeLecture.get(3).getDATE();
        assertEquals("2020-6-1", str);

        str = denemeLecture.get(3).getHOUR();
        assertEquals("16.00", str);
    }

    /*
    @Test
    void _examOverlap(){ // 13 - 2

        str = denemeLecture.get(3).getDATE();
        assertEquals("",str);

        str = denemeLecture.get(3).getDATE();
        assertEquals("",str);

    }
    */

    @org.junit.jupiter.api.Test
    void _getResults() {
    }

    @org.junit.jupiter.api.Test
    void _getDate() {
    }

    @org.junit.jupiter.api.Test
    void _setExamResults() {
    }

    @org.junit.jupiter.api.Test
    void _setExamDate() {
    }


    @org.junit.jupiter.api.Test
    void _login() {

    }

    @org.junit.jupiter.api.Test
    void _userTYPE() {
    }

    @org.junit.jupiter.api.Test
    void _DEVMENU() {
    }

    @org.junit.jupiter.api.Test
    void _STDMENU() {
    }

    @org.junit.jupiter.api.Test
    void _LCTMENU() {
    }

    @org.junit.jupiter.api.Test
    void main() {
    }
}