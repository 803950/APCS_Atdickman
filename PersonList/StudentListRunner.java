
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
        System.out.println("5: Display student");
        System.out.println("6: Clear all students");
        System.out.println("7: Sort students by last name");
        System.out.println("Type \"quit\" to quit");
        System.out.println();
        StudentList studlist = new StudentList();
        Scanner scanner = new Scanner(System.in);
        String inputnum = "";
        String num = "";
        do{
            num = inputnum;
            inputnum = scanner.nextLine();
            Scanner kb = new Scanner(System.in);
            switch(inputnum){
                case "1":
                System.out.println("Input a full name");
                String str = kb.nextLine();
                System.out.println("Enter a student GPA:");
                double gpa = kb.nextDouble();
                kb.nextLine();
                System.out.println("Enter a student number:");
                int number = kb.nextInt();
                kb.nextLine();
                studlist.addStudentToList(str, number, gpa);

                case "2":
                studlist.deleteStudentFromList();

                case "3":
                studlist.editStudentList();

                case "4":
                studlist.printAll();

                case "5":
                studlist.printStudent("Joe Mama");

                case "6":
                studlist.clearList();

                case "7":
                studlist.sortStudents();
                default:
                System.out.println("Invalid input");
            }
        }  
        while(!inputnum.equals("quit"));
    }

    public static void clr(){
    }
}
// for display/while loop
