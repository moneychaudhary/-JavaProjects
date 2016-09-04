/**
 * Created by ###money on 6/14/2016.
 */
public class Details {
    public String firstName;
    public String lastName;
    public int age;
    public char Gender;
    public static int avgAge ;

    public Details()
    {
        System.out.println("Student constructor called!!");
    }

    public  Details(String name)
    {
        this.firstName=name;
    }

    public void printIntroduction()
    {
        System.out.println("hi there, this is   "+this.firstName);
    }

    public void printIntroduction(String otherPerson){
        System.out.println("hi "+ otherPerson);
    }


}
