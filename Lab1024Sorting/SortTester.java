
/**
 * Write a description of class SortTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
import java.util.concurrent.TimeUnit;
public class SortTester
{
    static ArrayList<Integer> arrlist = new ArrayList<>();
    private static int len = 10000;
    private static int swapcounter = 0;
    private static int compcounter = 0;
    private static long timeElapsed;
    public static void loadArrl(int len){
        for (int j = 0;j < len;j++) {
            arrlist.add((int)(Math.random() * 100) + 1);
        }
    }

    public static void main(){
        // bubble sort
        loadArrl(len);
        bubbleSort();
        System.out.print(arrlist);
        arrlist.clear();
        System.out.println();
        System.out.println("Number of comparisons: " + compcounter);
        System.out.println("Number of swaps: " + swapcounter);
        System.out.println("Duration in nanoseconds :" + timeElapsed);

        // insert sort
        loadArrl(len);
        insertionSort();
        System.out.print(arrlist);
        arrlist.clear();
        System.out.println();
        System.out.println("Number of comparisons: " + compcounter);
        System.out.println("Number of swaps: " + swapcounter);
        System.out.println("Duration in nanoseconds :" + timeElapsed);
    }

    public static void bubbleSort(){
        timeElapsed = 0;
        swapcounter = 0;
        compcounter = 0;
        long startTime = System.nanoTime();
        for (int i = len-1;i > 0; i--){
            for (int j = 0; j < i; j++){
                if (arrlist.get(j) > arrlist.get(j+1)) {
                    swap(arrlist, j, j+1);
                    swapcounter++;
                    compcounter++;
                }else{
                    compcounter++;
                }
            }
        }
        long endTime = System.nanoTime();
        timeElapsed = endTime - startTime;
    }

    public static void insertionSort(){
        timeElapsed = 0;
        swapcounter = 0;
        compcounter = 0;
        long startTime = System.nanoTime();
        int temp = 0;
        for (int  i = 1; i < arrlist.size(); i++) 
        {
            for(int  j = i ; j > 0 ; j--)
            {
                if(arrlist.get(j) < arrlist.get(j-1)){
                    temp = arrlist.get(j);
                    arrlist.set(j, arrlist.get(j - 1));
                    arrlist.set(j-1, temp);
                    compcounter++;
                    swapcounter++;
                }
                else{
                    compcounter++;
                }
            }
        }
        long endTime = System.nanoTime();
        timeElapsed = endTime - startTime;
    }
    public static void swap(ArrayList<Integer> list, int i, int j){
        int hole = list.get(i);
        list.set(i,list.get(j));
        list.set(j,hole);
    }
}
