import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;



class juniterJunitorium {
    ArrayList<_user> denemeUser = _user._createUserTable();
    ArrayList<_lecture> denemeLecture = _lecture._createLectureTable();
    ArrayList<_result> denemeResult = _result._createResultTable();

    @org.junit.jupiter.api.Test
    void _getUserTable() {


    }

    @org.junit.jupiter.api.Test
    void _getLectureTable() {
    }

    @org.junit.jupiter.api.Test
    void _getResultTable() {
    }

    @org.junit.jupiter.api.Test
    void _examOverlap() {
    }

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
    void _START_user_pozitive() {

        String str = denemeUser.get(2).getID();
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
    @Test
    void _START_user_negative(){

        String str = denemeUser.get(11).getPASSWORD();
         assertEquals("1111", str);
         // Base User List is not Null and String. Also Password checks are ok

        str = denemeUser.get(11).getID();
        assertEquals("aaa", str);
        // ID checks are ok

        str = denemeUser.get(11).getTYPE();
        assertEquals("bbb", str);
        // TYPE checks are ok
    }

    @Test
    void _START_lecture_pozitive(){

        String str = denemeLecture.get(2).getCODE();
        assertEquals("SE60", str);
        // Base Lecture List is not Null and String. Also CODE checks are ok
    }

    @Test
    void _START_lecture_negative(){
        String str = denemeLecture.get(5).getCODE();
        assertEquals("SE221", str);
        // Base Lecture List is not Null and String. Also Code checks are ok
    }

    @Test
    void _START_result_pozitive(){
        String str = denemeResult.get(2).getFINAL();
        assertEquals("40", str);
        // Base Result List is not Null and String. Also FINAL checks are ok
    }

    @Test
    void _START_result_negative(){
        String str = denemeResult.get(2).getMT1();
        assertEquals("50", str);
        // Base Result List is not Null and String. Also MT1 checks are ok

        str = denemeResult.get(2).getMT2();
        assertEquals("45", str);
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