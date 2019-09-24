
/**
 * Scanner tester
 *
 * @author (eettlin)
 * @version (924)
 */

import java.util.Scanner;
public class ScannerTest{
    Scanner scanner = new Scanner(System.in);
    public static void main(){
        Scanner kb = new Scanner(System.in);
        String inputStr = "";
        //  if(str1 == str2)
        while(!inputStr.equals("quit")){
            System.out.println("Enter a name or type \"quit\" to quit");
            inputStr = kb.nextLine();
            Person person = new Person(inputStr);
            System.out.println(inputStr);
        }
        
        
    }
}
