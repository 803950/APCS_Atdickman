
/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person
{
    String fName;
    String mName;
    String lName;
    public Person(String fullName){
        fName = parseName(fullName)[0];
        mName = parseName(fullName)[1];
        lName = parseName(fullName)[2];
    }
    // format 1
    public String[] parseName(String fullName){
        String[] name_array = new String[3];
        int len_index = fullName.length();
        int comma_index = fullName.indexOf(",");
        name_array[2] = fullName.substring(0,comma_index);
        int space_index = fullName.indexOf(" ");
        name_array[0] = fullName.substring((comma_index),space_index);
        name_array[1] = fullName.substring((space_index),len_index);
        return name_array;
    }
    
}