
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
        StudentList studlist = new StudentList();
        Scanner scanner = new Scanner(System.in);
        String inputnum = "";
        while(!inputnum.equals("quit")){
            printMenu();
            inputnum = scanner.nextLine();
            Scanner kb = new Scanner(System.in);
            if (inputnum.equals("1")){
                System.out.println("Input a full name");
                String str = kb.nextLine();
                System.out.println("Enter a student GPA:");
                double gpa = kb.nextDouble();
                kb.nextLine();
                System.out.println("Enter a student number:");
                int number = kb.nextInt();
                kb.nextLine();
                studlist.addStudentToList(str, number, gpa);
            }else if(inputnum.equals("2")){
                System.out.print("Press 1 to input last name, 2 to input student number");
                int userinput = kb.nextInt();
                kb.nextLine();
                if(userinput == 1){
                    System.out.println("Input a last name: ");
                    String username = kb.nextLine();
                    studlist.deleteStudentFromList(username);
                }
                if(userinput == 2){
                    System.out.println("Input a student number: ");
                    int usernum = kb.nextInt();
                    studlist.deleteStudentFromList(usernum);
                    kb.nextLine();
                }                
            }else if(inputnum.equals("3")){
                studlist.editStudentList();
            }else if(inputnum.equals("4")){
                System.out.println("_____________________________");
                System.out.println("All students: ");
                studlist.printAll();
                System.out.println("_____________________________");
            }else if(inputnum.equals("5")){
                studlist.printStudent("");
            }else if(inputnum.equals("6")){
                studlist.clearList();
            }else if(inputnum.equals("7")){
                studlist.sortStudents();
            }else if(inputnum.equals("quit")){
                break;
            }else{
                System.out.println("Invalid input");
            }
            System.out.println("press Enter to continue");
            kb.nextLine();
            clr();  
        }  
    }

    public static void clr(){
        System.out.print('\u000c');
    }

    public static void printMenu(){
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
    }
}
// for display/while loop
