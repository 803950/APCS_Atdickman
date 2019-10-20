
/**
 * Write a description of class BubbleSort here.
 *
 * @author tdickman
 * @version 1017
 */
import java.util.*;
import java.lang.Math;
public class BubbleSort
{

    private static int[] arr = new int[10];
    public static void loadArray(int[] arr){
        for(int i = 0; i < arr.length ;i++){
            int rnd = (int)(Math.random()*100 + 1);
            arr[i] = rnd;
        }
    }
    
    public static void sort(int[] list){
        boolean check = true;
        while(check == true){
            for(int i = 0;i<list.length;i++){
                if(list[i]>list[i+1]){
                    swap(list,list[i],list[i+1]);
                }
            }
            check = swapchecker(list);
            printList(list);
        }
    }
    
    public static void swap(int[] list,int a,int b){
        int hole = list[a];
        list[a] = list[b];
        list[b] = hole;
    }
    
    public static boolean swapchecker(int[] list){
        boolean bool = true;
        for(int i = 1;i<list.length;i++){
            if(list[i] < list[i-1]){
                bool = false;
            }
        }
        return bool;
    }
    
    public static void printList(int[] list){
        for(int i = 0;i<list.length;i++){
            System.out.print(list[i]);
        }
        System.out.println();
    }
    
    public static void main(){
        loadArray(arr);
        sort(arr);
    }
}
