
/**
 * Write a description of class MMM here.
 *
 * @author tdickman
 * @version 1018
 */
import java.util.*;
import java.lang.Math;
public class MMM
{
    static ArrayList<Integer> numlist = new ArrayList<Integer>();
    public MMM()
    {
        loadArrList(numlist);
        double median = getMedian();
        double mean = getMean();
        int mode = getMode();
    }
    public static void loadArrList(ArrayList<Integer> list){
        for(int i = 0;i<10;i++){
            int rnd = (int)(Math.random()*100+1);
            list.add(0,rnd);
        }
    }
    public double getMedian(){
        return 0;
    }
    public double getMean(){
        return 0;
    }
    public int getMode(){
        return 0;
    }
    
    public static void main(){
        System.out.print("ArrayList of random numbers:  ");
        for(int i = 0;i<numlist.size();i++){
            System.out.print(numlist.get(i) + ", ");
        }
        System.out.println();
        System.out.print(numlist.size());
    }
}
