/**
 * Write a description of class StudentList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class StudentList
{
    // instance variables - replace the example below with your own
    ArrayList <Student> studlist = new ArrayList <Student>();
    Scanner kb = new Scanner(System.in);
    /**
     * Constructor for objects of class StudentList
     */
    public StudentList()
    {
        addStudent("");
    }

    private String[] parseUserInput(String name){
        String[] string = new String[3];
        string[0] = "";
        string[1] = "";
        string[2] = "";
        return string;
    }

    public void addStudent(String fullName){
        System.out.print("Please input a GPA as a double:  ");
        double GPA = kb.nextDouble();
        System.out.print("Please input a GPA as an integer:  ");
        int stuNum = kb.nextInt();
        String[] namelist = parseUserInput(fullName);
        fName = namelist[0];
        mName = namelist[1];
        lName = namelist[2];
        Student stud = new Student(fName,mName,lName,stuNum,GPA);
        studlist.add(stud);
    }
}