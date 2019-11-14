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

  
    public void addStudentToList(String fullName, int stuNum, double GPA){
        Student stud = new Student(fullName, stuNum, GPA);
        studlist.add(stud);
    }

    public void deleteStudentFromList(String lname){
        boolean temp = false;
        int num = 0;
        for(int i = 0; i < studlist.size() && (temp == false); i++){
            if(studlist.get(i).getLast().equals(lname.trim())){
                temp = true;
                num = i;
            }
        }
        if(temp == true){
            studlist.remove(num);
        }
    }
    
    public void deleteStudentFromList(int x){
        boolean temp = false;
        int num = 0;
        for(int i = 0; i < studlist.size() && (temp == false); i++){
            if(studlist.get(i).getStuNumber() == x){
                temp = true;
                num = i;
            }
        }
        if(temp == true){
            studlist.remove(num);
        }
    }

    public void editStudentList(int stuNum){
        boolean temp = false;
        int num = 0;
        for(int i = 0; i < studlist.size() && (temp == false); i++){
            if(studlist.get(i).getStuNumber() == stuNum){
                temp = true;
                num = i;
            }
        }
        System.out.println("Selected student:  ");
        printStudent(studlist.get(num));
        if(temp == true){
            System.out.print("New full name:  ");
            String newname = kb.nextLine();
            System.out.println(); //
            System.out.print("New GPA:  ");
            double newGPA = kb.nextDouble();
            System.out.println();
            kb.nextLine();
            Student newstudent = new Student(newname, stuNum, newGPA);
            newstudent.parseUserInput(newstudent.getFullName());
            studlist.remove(num);
            studlist.add(newstudent);
        }
        
    }
    
    public void editStudentList(String lName){
        boolean temp = false;
        int num = 0;
        for(int i = 0; i < studlist.size() && (temp == false); i++){
            if(studlist.get(i).getLast().equals(lName)){
                temp = true;
                num = i;
            }
        }
        System.out.println("Selected student:  ");
        printStudent(studlist.get(num));
        if(temp == true){
            System.out.print("New student number:  ");
            int newNum = kb.nextInt();
            System.out.println(); //
            System.out.print("New GPA:  ");
            double newGPA = kb.nextDouble();
            System.out.println();
            kb.nextLine();
            String name = studlist.get(num).getFullName();
            Student newstudent = new Student(name, newNum, newGPA);
            newstudent.parseUserInput(newstudent.getFullName());
            studlist.remove(num);
            studlist.add(newstudent);
        }
        
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
        System.out.println(" Student Name: " + stud.getFullName());
        System.out.printf(" GPA: %.2f  \n",stud.getGpa()); // rounds a string version of gpa to 2 characters after "."
        System.out.printf(" Student Number: %06d\n", stud.getStuNumber());
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
        studlist.clear();
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