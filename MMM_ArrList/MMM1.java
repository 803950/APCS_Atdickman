
/**
 * Write a description of class MMM1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class MMM1
{
    public MMM1(){

    }
    static ArrayList<Integer> arrlist = new ArrayList<>();
    public static int len = 100;

    public static ArrayList<Integer> loadArrl(ArrayList<Integer> alist){
        int[] list = new int[len];
        for(int i = 0;i<len;i++){
            int rnd = (int)(Math.random()*100+1);
            list[i] = rnd;
        }
        for (int j = 0;j<len;j++) {
            alist.add(list[j]);
        }
        return alist;
    }

    public static void main(){
        ArrayList<Integer> alist = loadArrl(arrlist);
        System.out.println("ArrayList: ");
        for(int i=0; i<len;i++){
            System.out.print(alist.get(i) + ", ");
        }
        //Mean
        double sum = 0;
        for(int i = 0;i<alist.size();i++){
            sum += alist.get(i);
        }
        System.out.println();
        System.out.println("Mean: " + sum/alist.size());
        //Median
        int median = 0;
        for(int i = 0;i<len;i++){
            for(int j = 1;j<len;j++){
                if(arrlist.get(j) < arrlist.get(j-1)){
                    int hole = arrlist.get(j);
                    arrlist.set(j,arrlist.get(j-1));
                    arrlist.set(j-1,hole);
                }
            }
        }
        System.out.println();
        System.out.print("Sorted list: "); //bubble sort
        for(int i=0; i<len;i++){
            System.out.print(arrlist.get(i) + ", ");
        }
        if(len%2 == 0){
            median = (arrlist.get((len/2)) + arrlist.get((len/2)-1))/2;
        }else{
            median = arrlist.get(len/2);
        }
        System.out.println("Median: " + median);
        int[] counterlist = new int[arrlist.get(len-1)];
        for(int i = 0; i<arrlist.get(len-1); i++){ // list with length of largest number in arrlist
            counterlist[i] = 0;
        }
        for(int j = 0; j<len; j++){
            if(arrlist.contains(j)){
                counterlist[j] += 1; // increases counter of each number for each instance of it in arrlist
            }
        }
    }
}
