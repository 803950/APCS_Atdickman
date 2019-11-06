/**
 * All methods that can be used from the menu
 *
 * @author tdickman
 * @version 11/6
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

    public void addStudentToList(String fullName, int stuNum, double GPA){
        Student stud = new Student(fullName, stuNum, GPA);
        studlist.add(stud);
    }

    public void deleteStudentFromList(int x){
        boolean temp = false;
        int num = 0;
        ArrayList<Student> student = new ArrayList<Student>();
        for(int i = 0; i < studlist.size() && (temp = false); i++){
            if(studlist.get(i).getStuNumber() == x){
                temp = true;
                num = i;
            }
        }
        if(temp == true){
            studlist.remove(num);
        }
        else{
            System.out.println("Student does not exist");
        }
    }
    
    public void deleteStudentFromList(String lname){
        boolean temp = false;
        int num = 0;
        ArrayList<Student> student = new ArrayList<Student>();
        for(int i = 0; i < studlist.size(); i++){
            if(studlist.get(i).getLast().equals(lname.trim())){
                temp = true;
                num = i;
            }
        }
        if(temp == true){
            studlist.remove(num);
        }
        else{
            System.out.println("Student does not exist");
        }
    }
    
    public void editStudentList(){

    }

    public void printList(){
        for(int i = 0;i <studlist.size(); i++){
            System.out.println("Student name: " + studlist.get(i).getFullName());
            System.out.println("Student number: " + studlist.get(i).getStuNumber());
            System.out.println("Student gpa: " + studlist.get(i).getGpa());
        }

    }

    public void printList(ArrayList<Student> plist){
        for(int i = 0; i < plist.size(); i++){
            System.out.println("Student name: " + plist.get(i).getFullName());
            System.out.println("Student number: " + plist.get(i).getStuNumber());
            System.out.println("Student gpa: " + plist.get(i).getGpa());
        }

    }

    public void printAll(){
        for(int i = 0; i < studlist.size(); i++){
            printStudent(studlist.get(i));
        }
    }

    public void printStudent(Student stud){
        System.out.println(" Student Name: " + stud.getFullName());
        System.out.printf(" GPA: %.2f  \n",stud.getGpa()); // rounds a string version of gpa to 2 characters after "."
        System.out.printf(" Student Number: %06d\n", stud.getStuNumber());
    }

    public void printStudent(int x){
        boolean temp = false;
        int num = 0;
        ArrayList<Student> student = new ArrayList<Student>();
        for(int i = 0; i < studlist.size() && (temp = false); i++){
            if(studlist.get(i).getStuNumber() == x){
                temp = true;
                num = i;
            }
        }
        if(temp == true){
            student.add(studlist.get(num));
            printList(student);
        }
        else{
            System.out.println("Student does not exist");
        }
    }

    public void printStudent(String lname){
        boolean temp = false;
        int num = 0;
        ArrayList<Student> student = new ArrayList<Student>();
        for(int i = 0; i < studlist.size(); i++){
            if(studlist.get(i).getLast().equals(lname.trim())){
                temp = true;
                num = i;
            }
        }
        if(temp == true){
            student.add(studlist.get(num));
            printList(student);
        }
        else{
            System.out.println("Student does not exist");
        }
    }

    public void clearList(){
        studlist.clear();
    }

    public void sortStudents(){
        Collections.sort(studlist);
    }

    public void printList(String[] list){
        for(int i = 0;i<list.length;i++){
            System.out.print(list[i]);
            System.out.print(" ");
        }
        System.out.println();
    }
}