
 /**
 * Write a description of class Array here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.lang.Math;
public class MMMRunner
{
     
    public static void main(){
       MMM mmm = new MMM();
       mmm.loadArray();
       System.out.println("The array:");
       mmm.printArray();
       System.out.println();    // separator
       System.out.println("The sum of the array values is " + mmm.getSum());
       System.out.println();
       System.out.println("The mean of the array values is "  + mmm.getMean());
       System.out.println();
       System.out.println("The median of the array values is " + mmm.getMedian());
    }
        
}