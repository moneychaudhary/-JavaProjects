import java.sql.Time;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by money on 23/6/16.
 */
public class Demo
{
    public static void main(String[] args) {

        List students = Student.allStudents();
        System.out.println(students.get(5));
        students.remove(2);
        System.out.println(students.get(4));



    }
}
