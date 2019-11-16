/**
 * StudentListRunner runs the menu and all user inputs, and runs studentlist methods
 *
 * Tal Dickman
 * 16 November 2019
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
            if (inputnum.equals("1")){ // Adds a student into studlist with user inputted full name, GPA, and Student Number.
                System.out.println("Input a full name");
                String str = kb.nextLine();
                System.out.println("Enter a student number:");
                int number = kb.nextInt();
                kb.nextLine();
                System.out.println("Enter a student GPA:");
                double gpa = kb.nextDouble();
                kb.nextLine();
                studlist.addStudentToList(str, number, gpa);
            }else if(inputnum.equals("2")){ // Deletes a student based on user inputted last name or student number.
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
            }else if(inputnum.equals("3")){ // Using one user inputted student data, updates other two data of the student with new user input.
                System.out.println("press 1 to input student last name, 2 to input student number");
                int inputn = kb.nextInt();
                kb.nextLine();
                if(inputn == 1){
                    System.out.print("Input a last name:  ");
                    String inputl = kb.nextLine();
                    System.out.println();
                    studlist.editStudentList(inputl);
                }
                if(inputn == 2){
                    System.out.print("Input a studentNumber:  ");
                    int inputnm = kb.nextInt();
                    System.out.println();
                    studlist.editStudentList(inputnm);
                }
                if(inputn == 1){ // temporary

                }
            }else if(inputnum.equals("4")){ // Displays all students entered into the database (studlist)
                System.out.println("_____________________________");
                System.out.println("All students: ");
                studlist.printAll();
                System.out.println("_____________________________");
            }else if(inputnum.equals("5")){ // Displays an individual student based on user inputted last name or student number
                System.out.println("press 1 to input student last name, 2 to input student number");
                int intpmn = kb.nextInt();
                kb.nextLine();
                if(intpmn == 1){
                    System.out.print("Student last name:  ");
                    String ln = kb.nextLine();
                    System.out.println();
                    studlist.printStudent(ln);
                }
                if(intpmn == 2){
                    System.out.print("Student number:  ");
                    int sn = kb.nextInt();
                    kb.nextLine();
                    System.out.println();
                    studlist.printStudent(sn);
                }if(intpmn != 1 && intpmn != 2){
                    System.out.println("Invalid input");
                }
            }else if(inputnum.equals("6")){ // Clears all entries in the list
                studlist.clearList();
            }else if(inputnum.equals("7")){ // Sorts the students by last name or by student number in descending order
                int inptn;
                String inpts;
                System.out.print("Press 1 to sort by student number, 2 by last name:  ");
                int inptc = kb.nextInt();
                kb.nextLine();
                System.out.println();
                if(inptc == 1){
                    studlist.sortStudents(1);
                }
                if(inptc == 2){
                    studlist.sortStudents(2);
                }

            }else if (inputnum.equals("8")){ // Searches students by GPA or student number keywords
                System.out.println("Options: ");
                System.out.println("1: Find all students with GPA greater than or equal to your inputted GPA key");
                System.out.println("2: Find all students with GPA less than or equal to your inputted GPA key");
                System.out.println("3: Find all students with student number greater than or equal to your inputted GPA key");
                System.out.println("4: Find all students with student number less than or equal to your inputted GPA key");
                int innt = kb.nextInt();
                kb.nextLine();
                double inpgpa;
                int stumn;
                if(innt == 1){
                    inpgpa = kb.nextDouble();
                    kb.nextLine();
                    studlist.filterSearchStudentListMore(inpgpa);
                }
                if(innt == 2){
                    inpgpa = kb.nextDouble();
                    kb.nextLine();
                    studlist.filterSearchStudentListLess(inpgpa);
                }
                if(innt == 3){
                    stumn = kb.nextInt();
                    kb.nextLine();
                    studlist.filterSearchStudentListMore(stumn);
                }
                if(innt == 4){
                    stumn = kb.nextInt();
                    kb.nextLine();
                    studlist.filterSearchStudentListLess(stumn);
                }

            }else if(inputnum.equals("quit")){ // breaks out of loop
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
        System.out.println("7: Sort students");
        System.out.println("8: Search students by keys");
        System.out.println("Type \"quit\" to quit");
        System.out.println();
    }
}
// for display/while loop
