
/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person
{
    private String fName;
    private String mName;
    private String lName;
    public Person(String fullName){
        fName = parseName(fullName)[0];
        mName = parseName(fullName)[1];
        lName = parseName(fullName)[2];
    }
    // format 1 = "Last,First Middle"
    // format 2 = "Last,First"
    // format 3 = "First Middle Last"
    // format 4 = "First Last"
    public String[] parseName(String fullName){
        String[] name_array = new String[3];
        if(fullName.indexOf(",") != -1 & fullName.indexOf(" ") != -1){ // format1
            int len_index = fullName.length();
            int comma_index = fullName.indexOf(",");
            name_array[2] = fullName.substring(0,comma_index);
            int space_index = fullName.indexOf(" ");
            name_array[0] = fullName.substring((comma_index) + 1,space_index);
            name_array[1] = fullName.substring((space_index) + 1);
        }
        if(fullName.indexOf(" ") == -1 & fullName.indexOf(",") != -1){ // format2
            int len_index = fullName.length();
            int comma_index = fullName.indexOf(",");
            name_array[2] = fullName.substring(0,comma_index);
            name_array[1] = ""; // none given
            name_array[0] = fullName.substring(comma_index + 1);
        }
        if(fullName.indexOf(" ") != -1 & fullName.indexOf(" ") != fullName.lastIndexOf(" ")){ // format3
            int space_index1 = fullName.indexOf(" ");
            int space_index2 = fullName.lastIndexOf(" ");
            name_array[0] = fullName.substring(0,space_index1);
            name_array[1] = fullName.substring(space_index1 + 1, space_index2);
            name_array[2] = fullName.substring(space_index2 + 1);
        }
        if(fullName.indexOf(" ") != -1 & fullName.indexOf(" ") == fullName.lastIndexOf(" ") & fullName.indexOf(",") == -1){ //             int len_index = fullName.length();
            
            int space_index1 = fullName.indexOf(" ");
            name_array[0] = fullName.substring(0,space_index1);
            name_array[1] = "";
            name_array[2] = fullName.substring(space_index1 + 1);
        }
        return name_array;
    }
    
    public String getFirstName(){
        return fName;
    }   
    public String getMiddleName(){
        return mName;
    }
    public String getLastName(){
        return lName;
    }
}