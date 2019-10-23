
/**
 * Person class
 *
 * @author (tdickman)
 * @version (929)
 */
public class Person
{
    private String fName;
    private String mName;
    private String lName;
    public Person(String name){
        String fullName;
    }
    // format 1 = "Last,First Middle"
    // format 2 = "Last,First"
    // format 3 = "First Middle Last"
    // format 4 = "First Last"
    public void parseName(String fullName){
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
        fName = name_array[0];
        fName = name_array[0];
        fName = name_array[0];
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