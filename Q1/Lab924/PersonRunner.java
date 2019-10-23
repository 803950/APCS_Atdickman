
/**
 * Person runner class
 *
 * @author (tdickman)
 * @version (929)
 */

import java.util.Scanner;
public class PersonRunner{
    Scanner scanner = new Scanner(System.in);
    private static int max_count = 1;
    public static void main(){
        Scanner kb = new Scanner(System.in);
        String inputStr = "";
        Person[] Person_array = new Person[max_count];
        int count = 0;
        boolean end_run = false;
        //  if(str1 == str2)
            while(!end_run){
                inputStr = kb.nextLine();
                if(inputStr.equals("quit")){
                    System.out.println("exited.");
                    end_run = true;
                }
                else{
                    Person person = new Person(inputStr);
                        if(count<max_count){
                        Person_array = extendArray(Person_array,1);
                    }
                    Person_array[count++] = person;
                    }
            }
        printNames(Person_array);
        }
        
    public static Person[] extendArray (Person[] p,int n){
        Person[] newarray = new Person[p.length + n];
        for(int i = 0; i<p.length; i++){
            newarray[i] = p[i];
        }
        String inputStr = "";
        Scanner kb = new Scanner(System.in);
        while(!inputStr.equals("quit")){
            Person[] Person_array = new Person[0];
            System.out.println("Enter a name or type \"quit\" to quit");
            inputStr = kb.nextLine();
            Person person = new Person(inputStr);
        }
        return newarray;
    }
    // lab926 runner methods
    public static void printNames(Person[] array){
            int i = 0;
            if(array.length>0){
                while(i<array.length){
                    System.out.println("First Name: " + array[i].getFirstName());
                    System.out.println("Middle Name: " + array[i].getMiddleName());
                    System.out.println("Last Name: " + array[i].getLastName());
                    System.out.println();
                    i++;
                }
        }
        }
}
