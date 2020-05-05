import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;


/*
1.	The entered user id can be more than 11 characters
2.	The entered user id can be less than 11 characters
3.	The entered password can be less than 6 characters
4.	The entered password can be more than 12 characters
5.	The entered id may not be identified
6.	The entered password may not be valid
7.	Lecture code can be more than 4 characters
8.	Lecture code can be less than 4 characters
9.	Lecture code can be incorrect format
10.	Exam dates can be overlapped
11.	Exam dates can be incorrect format
12.	Exam hours can be incorrect format
13.	Password changing need may not be announced in the necessary time
14.	Response time can be more than 10 sec. when user requests to log in are overridden
15.	The system may not keep record the exam results with time
16.	Changes of exam dates may not be announced to students at the same time with their shipping
17.	Lecture name can be more than 25 characters
18.	Lecture name can be more than 25 characters
19.	The system may not crosscheck the exam dates/hours
*/


class juniterJunitorium {

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
    void _START_user() {
        ArrayList<_user> denemeUser = _user._createUserTable();
        String str = denemeUser.get(2).getID();
        assertEquals("1111", str);

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