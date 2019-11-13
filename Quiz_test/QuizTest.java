
/**
 * Write a description of class QuizTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class QuizTest
{
    public QuizTest(){
        int[] x = {1, 2, 3, 4, 5};
        ArrayList<Integer> n1 = makeList(x);
        int[] y = reverseList(n1);
        printList(n1);
        System.out.println();
        printArray(y);
    }

    public ArrayList<Integer> makeList(int[] nums){ 
        ArrayList<Integer> newlist = new ArrayList<Integer>();
        for(int i = 0; i<nums.length; i++){
            newlist.add(nums[i]);
        }
        return newlist;
    }  

    public int[] reverseList(ArrayList<Integer> nums){ 
        int[] newnums = new int[nums.size()];
        for(int i = 0; i<nums.size(); i++){
            newnums[i] = nums.get(nums.size()-i-1);
        }
        return newnums;
    }

    public void printList(ArrayList<Integer> a){
        for(int i = 0; i < a.size(); i++){
            System.out.print(a.get(i) + ", ");
        }
    }

    public void printArray(int[] a){
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + ", ");
        }
    }

    public static void main(){
        QuizTest q = new QuizTest();
    }
}
