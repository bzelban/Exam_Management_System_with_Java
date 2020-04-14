import java.io.FileNotFoundException;
import java.util.ArrayList;

public class test {
    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("WELCOME TO EXAM MANAGEMENT SYSTEM\n");

        ArrayList<_user> denemeUser= _user._createUserTable();
        ArrayList<_lecture> denemeLecture= _lecture._createLectureTable();
        ArrayList<_result> denemeResult= _result._createResultTable();

    _user.print(denemeUser);
        System.out.println(" ");
    _lecture.print(denemeLecture);
        System.out.println(" ");
    _result.print(denemeResult);



    }}
