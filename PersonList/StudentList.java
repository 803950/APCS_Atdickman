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
    ArrayList<Student> studlist = new ArrayList<Student>();
    Scanner kb = new Scanner(System.in);
    /**
     * Constructor for objects of class StudentList
     */

    public void addStudentToList(String fullName, int stuNum, double GPA){
        studlist.add(new Student(fullName, stuNum, GPA));
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
        ArrayList<Integer> lnums = new ArrayList<Integer>();
        for(int i = 0; i < studlist.size(); i++){
            if(studlist.get(i).getLast().indexOf(lName.trim()) != -1){
                lnums.add(i);
            }
        }
        if(lnums.size() == 0){
            System.out.println("There are no students with this last name.");
        }
        if(lnums.size() == 1){
            System.out.println("Selected student:  ");
            printStudent(studlist.get(lnums.get(0)));
            System.out.print("New student number:  ");
            int newNum = kb.nextInt();
            System.out.println(); //
            System.out.print("New GPA:  ");
            double newGPA = kb.nextDouble();
            System.out.println();
            kb.nextLine();
            String name = studlist.get(lnums.get(0)).getFullName();
            Student newstudent = new Student(name, newNum, newGPA);
            newstudent.parseUserInput(newstudent.getFullName());
            studlist.remove(lnums.get(0));
            studlist.add(newstudent);
        }
        if(lnums.size() > 1){
            System.out.println("There are " + lnums.size() + " students with that last name.");
        }
    }

    public void printList(ArrayList<Student> studlist){
        for(int i = 0;i <studlist.size(); i++){
            System.out.println("Student name: " + studlist.get(i).getFullName());
            System.out.println("Student number: " + studlist.get(i).getStuNumber());
            System.out.println("Student gpa: " + studlist.get(i).getGpa());
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
            printStudent(studlist.get(num));
        }
    }

    public void filterSearchStudentListLess(int num){
        ArrayList<Student> studs = new ArrayList<Student>();
        for(int i = 0; i <studlist.size(); i++){
            if(studlist.get(i).getStuNumber() >= num){
                studs.add(studlist.get(i));
            }
        }
        printList(studs);
        
    }
    
    public void filterSearchStudentListMore(int num){
        ArrayList<Student> studs = new ArrayList<Student>();
        for(int i = 0; i <studlist.size(); i++){
            if(studlist.get(i).getStuNumber() <= num){
                studs.add(studlist.get(i));
            }
        }
        printList(studs);
        
    }
    
    public void filterSearchStudentListLess(double gpa){
        ArrayList<Student> studs = new ArrayList<Student>();
        for(int i = 0; i <studlist.size(); i++){
            if(studlist.get(i).getGpa() >= gpa){
                studs.add(studlist.get(i));
            }
        }
        printList(studs);
        
    }
    
    public void filterSearchStudentListMore(double gpa){
        ArrayList<Student> studs = new ArrayList<Student>();
        for(int i = 0; i <studlist.size(); i++){
            if(studlist.get(i).getGpa() <= gpa){
                studs.add(studlist.get(i));
            }
        }
        printList(studs);
        
    }

    public void printStudent(String lname){
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for(int i = 0; i < studlist.size(); i++){
            if(studlist.get(i).getLast().indexOf(lname.trim()) != -1){
                nums.add(i);
            }
        }
        if(nums.size() > 1)
            System.out.println("There are " + nums.size() + " students with that last name");
        else if(nums.size() == 1)
            printStudent(studlist.get(nums.get(0)));
        else if(nums.size() == 0)
            System.out.println("There are no students with that last name.");
    }

    public void clearList(){
        System.out.println("Clearing list...");
        studlist.clear();
    }

    public void sortStudents(int stuNum){
        ArrayList<Integer> nums = new ArrayList<Integer>();
        
    }

    public void sortStudents(String lName){

    }
    
    public static int[] bubblesort(int[] list){
        for(int i = 0; i<list.length;i++){
            for(int j = 1; j<list.length; j++){
                if(list[j]<list[j-1]){
                    int hole = list[j];
                    list[j] = list[j-1];
                    list[j-1] = hole;
                }
            }
        }
        return list;
    }
    public void printList(String[] list){
        for(int i = 0;i<list.length;i++){
            System.out.print(list[i]);
            System.out.print(" ");
        }
        System.out.println();
    }
}