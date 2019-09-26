
/**
 * Scanner tester
 *
 * @author (eettlin)
 * @version (924)
 */

import java.util.Scanner;
public class PersonRunner{
    Scanner scanner = new Scanner(System.in);
    public static void main(){
        Scanner kb = new Scanner(System.in);
        String inputStr = "";
        //  if(str1 == str2)
        while(!inputStr.equals("quit")){
            System.out.println("Enter a name or type \"quit\" to quit");
            inputStr = kb.nextLine();
            Person person = new Person(inputStr);
            System.out.println("Inputed name: " + inputStr);
            System.out.println();
            System.out.println("first name = " + person.getFirstName());
            System.out.println("middle name = " + person.getMiddleName());
            System.out.println("last name = " + person.getLastName());
        }
        
        
    }

}
