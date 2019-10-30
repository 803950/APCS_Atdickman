/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
  String fName;
  String mName;
  String lName;
  int stuNumber;
  double gpa;

  public Student(String first, String middle, String last, int stum, double GPA)
  {
      fName = first;
      mName = middle;
      lName = last;
      stuNumber = stum;
      gpa = GPA;
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
}