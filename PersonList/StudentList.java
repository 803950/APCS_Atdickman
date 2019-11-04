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

    public void parseUserInput(String userName, Student s){
        String[] arr = userName.split(" ");
        int commaIndex = arr[0].indexOf(',');
        if(arr.length > 4 || arr.length < 2){
            System.out.println("Name was entered in the wrong format.");
        }else if(arr.length == 3){
            if(commaIndex == -1){ //
                s.setFirst(arr[0]);
                s.setMiddle(arr[1]);
                s.setLast(arr[2]);
            }
            else{
                arr[0] = arr[0].substring(0, commaIndex);
                s.setFirst(arr[2]);
                s.setMiddle(arr[1]);
                s.setLast(arr[0]);
            }
        }else{
            if(commaIndex == -1){
                s.setFirst(arr[0]);
                s.setMiddle(arr[1]);
                s.setLast("");
            }
            else{
                arr[0] = arr[0].substring(0, commaIndex);
                s.setFirst(arr[1]);
                s.setMiddle(arr[0]);
                s.setLast("");
            }
        }
    }
  
    public void addStudentToList(String fullName, int stuNum, double GPA){
        Student stud = new Student(fullName, stuNum, GPA);
        parseUserInput(fullName, stud);
        studlist.add(stud);
    }

    public void deleteStudentFromList(){

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
    public void printAll(){
        for(int i = 0; i < studlist.size(); i++){
            printStudent(studlist.get(i));
        }
    }

    public void printStudent(Student stud){
        System.out.print(stud.getFullName());
        System.out.print(stud.getGpa());
        System.out.print(stud.getStuNumber());
    }
    public void printStudent(int x){
        boolean temp = false;
        int num = 0;
        for(int i = 0; i < studlist.size() && (temp = false); i++){
            if(studlist.get(i).getStuNumber() == x){
                temp = true;
                num = i;
            }
        }
        if(temp == true){
            ArrayList<Student> student = new ArrayList<Student>();
            student.add(studlist.get(num));
        }
    }
    public void printStudent(String lname){
        boolean temp = false;
        int num = 0;
        for(int i = 0; i < studlist.size() && (temp = false); i++){
            if(studlist.get(i).getLast().equals(lname.trim())){
                temp = true;
                num = i;
            }
        }
        if(temp == true){
            ArrayList<Student> student = new ArrayList<Student>();
            student.add(studlist.get(num));
        }
    }
    public void clearList(){

    }

    public void sortStudents(){

    }

    public void printList(String[] list){
        for(int i = 0;i<list.length;i++){
            System.out.print(list[i]);
            System.out.print(" ");
        }
        System.out.println();
    }
}