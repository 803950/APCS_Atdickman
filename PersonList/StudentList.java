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
        addStudentToList("");
    }

    private String[] parseUserInput(String name){
        String[] string = new String[3];
        int comma_index = name.indexOf(",");
        int space_index = name.lastIndexOf(" ");
        string[0] = name.substring(comma_index+2, space_index);
        string[1] = name.substring(space_index + 1,name.length());
        string[2] = name.substring(0,comma_index);
        return string;
    }

    public void addStudentToList(String fullName){
        System.out.print("Please input a GPA as a double:  ");
        double GPA = kb.nextDouble();
        System.out.print("Please input a student number as an 6 digit integer:  ");
        int stuNum = kb.nextInt();
        String[] namelist = parseUserInput(fullName);
        String fName = namelist[0];
        String mName = namelist[1];
        String lName = namelist[2];
        Student stud = new Student(fName,mName,lName,stuNum,GPA);
        studlist.add(stud);
    }

    public void deleteStudentFromList(){

    }

    public void editStudentList(){

    }

    public void printAll(){
        for(int i = 0; i < studlist.size(); i++){
            System.out.print(studlist.get(i));
        }
    }

    public void printStudent(){

    }

    public void clearList(){

    }

    public void sortStudents(){

    }
}