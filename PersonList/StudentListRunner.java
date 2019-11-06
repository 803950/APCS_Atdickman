
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
            clr();
            if (inputnum.equals("1")){
                clr(); 
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
                System.out.println("Enter 1 to delete by last name");
                System.out.println("Enter 2 to delete by student number");
                int inpt = kb.nextInt();
                kb.nextLine();
                if(inpt == 1){
                    studlist.deleteStudentFromList(kb.nextLine());
                }
                if(inpt == 2){
                    studlist.deleteStudentFromList(kb.nextLine());
                }else{
                    System.out.println("Invalid input");
                }
                
                clr();
            }else if(inputnum.equals("3")){ 
                studlist.editStudentList();
                clr();
            }else if(inputnum.equals("4")){
                studlist.printAll();
            }else if(inputnum.equals("5")){
                System.out.print("Enter 1 to sort by last name \nEnter 2 to sort by student number ");
                int input = kb.nextInt();
                kb.nextLine();
                if(input == 1){
                    System.out.print("Enter last name: ");
                    studlist.printStudent(kb.nextLine().trim());
                    System.out.println();
                }else if(input == 2){
                    System.out.print("Enter student number: ");
                    studlist.printStudent(kb.nextInt());
                    System.out.println();
                }
                studlist.printStudent(kb.nextLine());
                
            }else if(inputnum.equals("6")){
                studlist.clearList();
                clr();
            }else if(inputnum.equals("7")){
                studlist.sortStudents();
                clr();
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
