
/**
 * Bubble sorts a list of random numbers
 *
 * @author tdickman
 * @version 1021
 */
public class Bubble{
    static int len = 30;
    public static int[] bubblesort(int[] list){
        for(int i = 0; i<list.length;i++){
            for(int j = 1; j<list.length; j++){
                if(list[j]<list[j-1]){
                    int hole = list[j];
                    list[j] = list[j-1];
                    list[j-1] = hole;
                }
            }
        }
        return list;
    }
    
    public static void loadArray(int[] list){
        for(int i = 0; i<list.length; i++){
            int rnd = (int)(Math.random()*100 + 1);
            list[i] = rnd;
        }
    }
    
    public static void main(){
        int[] numlist = new int[len];
        loadArray(numlist);
        System.out.println("Unsorted array:");
        for(int i = 0;i<len;i++){
            System.out.print(numlist[i] + ", ");
        }
        System.out.println();
        System.out.println("Sorted array:");
        numlist = bubblesort(numlist);
        for(int i = 0;i<len;i++){
            System.out.print(numlist[i] + ", ");
        }
        System.out.println();
        double median = getMedian(numlist);
        System.out.print("Median: " + median);
    }
    
    public static double getMedian(int[] list){
        double median = 0;
        int half = len/2;
        if((list.length)%2 == 0){
            median = (list[half-1]+list[half]);
        }
        return median/2;
    }
}
