
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
    private static int len = 10; // defines length of random array
    private static int swapcounter = 0;
    private static int compcounter = 0;
    private static long timeElapsed;
    public static void loadArrl(int len){
        for (int j = 0;j < len;j++) {
            arrlist.add((int)(Math.random() * 1000) + 1);
        }
    }

    public static void main(){
        System.out.println("Merge Sort");
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = ((int)(Math.random()*len) + 1);
        }
        
        System.out.print("[");
        for(int i = 0; i<len-1; i++){
            System.out.print(arr[i]);
            System.out.print(", ");
        }
        System.out.print(arr[len-1]);
        System.out.print("]");
        
        mergeSort(arr);
        
        System.out.print("[");
        for(int i = 0; i<len-1; i++){
            System.out.print(arr[i]);
            System.out.print(", ");
        }
        System.out.print(arr[len-1]);
        System.out.print("]");
        
        /*
        // bubble sort
        loadArrl(len);
        bubbleSort();
        System.out.print("(Bubble Sort) ");
        printList();
        arrlist.clear();
        System.out.println();
        System.out.println("Number of comparisons: " + compcounter);
        System.out.println("Number of swaps: " + swapcounter);
        System.out.println("Duration :" + (double)timeElapsed/1000000 + " milliseconds");

        // insert sort
        System.out.println();
        loadArrl(len);
        insertionSort();
        System.out.print("(Insertion Sort) ");
        printList();
        arrlist.clear();
        System.out.println();
        System.out.println("Number of comparisons: " + compcounter);
        System.out.println("Number of swaps: " + swapcounter);
        System.out.println("Duration :" + (double)timeElapsed/1000000 + " milliseconds");

        // selection sort
        System.out.println();
        loadArrl(len);
        selectSort();
        System.out.print("(Selection Sort) ");
        printList();
        arrlist.clear();
        System.out.println();
        System.out.println("Number of comparisons: " + compcounter);
        System.out.println("Number of swaps: " + swapcounter);
        System.out.println("Duration :" + (double)timeElapsed/1000000 + " milliseconds");
        */
    }

    public static int[] mergeSort(int[] a){
        if(a.length == 0){
            return null;
        }
        if(a.length == 1){
            return a;
        }
        int mid = a.length/2;
        int n = a.length;
        int[] l = load(a,0,mid);
        int[] r = load(a,mid,n);
        mergeSort(l);
        mergeSort(r);
        merge(a,l,r,mid,n);
        return a;
    }

    public static void merge(int[] a, int[] l, int[] r, int left, int right){
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            }else {
                a[k++] = r[j++];
            }
        }
        while (i < left) { a[k++] = l[i++];}
        while (j < right) {a[k++] = r[j++];}

    } 

    public static int[] load(int[] arr, int ii, int fi){
        int[] newarr = new int[fi-ii];
        for(int i = ii; i<fi; i++){
            newarr[i] = arr[i];
        }
        return newarr;
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

    public static void selectSort(){
        timeElapsed = 0;
        swapcounter = 0;
        compcounter = 0;
        long startTime = System.nanoTime();
        int temp = 0;
        for (int i = 0; i < arrlist.size() - 1; i++)
        {
            int index = i;
            for(int j = i+1; j<arrlist.size(); j++){
                if (arrlist.get(j) < arrlist.get(index)){
                    swap(arrlist,index,j);
                    compcounter++;
                    swapcounter++;
                }else{
                    compcounter++;
                }
            }
        }

        long endTime = System.nanoTime();
        timeElapsed = endTime - startTime;
    }

    public static void printList(){
        System.out.print("[");
        for(int i = 0; i<len-1; i++){
            System.out.print(arrlist.get(i));
            System.out.print(", ");
        }
        System.out.print(arrlist.get(len-1));
        System.out.print("]");
    }

    public static void swap(ArrayList<Integer> list, int i, int j){
        int hole = list.get(i);
        list.set(i,list.get(j));
        list.set(j,hole);
    }
}
