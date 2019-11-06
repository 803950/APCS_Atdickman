/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.lang.*;
public class Student implements Comparable<Student>
{
    private String fName;
    private String mName;
    private String lName;
    private int stuNumber;
    private double gpa;

    public Student(String fullName, int stum, double GPA)
    {
        gpa = GPA;
        stuNumber = stum;
        parseUserInput(fullName);
    }

    public void parseUserInput(String userName){
        String[] arr = userName.split(" ");
        int commaIndex = arr[0].indexOf(',');
        if(arr.length > 4 || arr.length < 2){
            System.out.println("Name was entered in the wrong format.");
        }else if(arr.length == 3){
            if(commaIndex == -1){ //
                setFirst(arr[0]);
                setMiddle(arr[1]);
                setLast(arr[2]);
            }
            else{
                arr[0] = arr[0].substring(0, commaIndex);
                setFirst(arr[2]);
                setMiddle(arr[1]);
                setLast(arr[0]);
            }
        }else{
            if(commaIndex == -1){
                setFirst(arr[0]);
                setMiddle(arr[1]);
                setLast("");
            }
            else{
                arr[0] = arr[0].substring(0, commaIndex);
                setFirst(arr[1]);
                setMiddle(arr[0]);
                setLast("");
            }
        }
    }

    // Setters
    public void setFirst(String first){
        fName = first;
    }

    public void setMiddle(String middle){
        mName = middle;
    }

    public void setLast(String last){
        lName = last;
    }

    public void setNum(int number){
        stuNumber = number;
    }

    public void setGpa(double gPA){
        gpa = gPA;
    }

    // Getters
    public String getFullName(){
        return(lName + ", " + fName + " " + mName);
    }

    public double getGpa(){
        return(gpa); // rounds to 2 decimal places
    }

    public int getStuNumber(){
        return stuNumber;
    }

    public String getFirst(){
        return fName;
    }

    public String getMiddle(){
        return mName;
    }

    public String getLast(){
        return lName;
    }

    public int compareTo(Student s){ // only one parameter because it is comparing to "this" student that we are in right now
        return this.getLast().compareTo(s.getLast());
    }
}