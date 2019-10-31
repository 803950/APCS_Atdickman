
/**
 * Write a description of class PersonList here.
 *
 * @author tdickman
 * @version 1025
 */
import java.util.Scanner; 
public class StudentListRunner
{ 
    public static void main() 
    {
        System.out.println("Select an option by entering an integer 1-7:");
        System.out.println();
        System.out.println("1: Add student");
        System.out.println("2: Delete student");
        System.out.println("3: Update student");
        System.out.println("4: Display all students");
        System.out.println("5: Distplay student");
        System.out.println("6: Clear all students");
        System.out.println("7: Sort students by last name");
        System.out.println("Type \"quit\" to quit");
        System.out.println();
        StudentList studlist = new StudentList();
        Scanner scanner = new Scanner(System.in);
        String inputnum = "";
        String num = "";
        while(!inputnum.equals("quit")){
            num = inputnum;
            inputnum = scanner.nextLine();
            if(num.equals("1")){
                System.out.println("Input a full name in the format Last, First Middle");
                Scanner kb = new Scanner(System.in);
                String str = kb.nextLine();
                studlist.addStudentToList(str);
            }
            if(num.equals("2")){
                studlist.deleteStudentFromList();
            }
            if(num.equals("3")){
                studlist.editStudentList();
            }
            if(num.equals("4")){
                studlist.printAll();
            }
            if(num.equals("5")){
                studlist.printStudent();
            }
            if(num.equals("6")){
                studlist.clearList();
            }
            if(num.equals("7")){
                studlist.sortStudents();
            if(num.equals("quit")){
            }
            }else{
                System.out.println("Invalid input");
            }
                
        }
    }
}
// for display/while loop
