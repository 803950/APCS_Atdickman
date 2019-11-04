/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
  private String fName;
  private String mName;
  private String lName;
  private int stuNumber;
  private double gpa;

  public Student(String fullname, int stum, double GPA)
  {
      gpa = GPA;
      stuNumber = stum;
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
    return(gpa-gpa%0.01); // rounds to 2 decimal places
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
}