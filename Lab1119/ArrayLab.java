
/**
 * This lab finds trends in a randomly generated 2D array
 *
 * Tal Dickman
 * 19 November 2019
 */
import java.util.*;
public class ArrayLab
{
    public ArrayLab(){

    }

    public static void main(){
        int len = 10; // Square dimension of 2D array
        int[][] matrix = new int[len][len];
        matrix = loadArray(matrix);
        printMat(matrix);
        getMean(matrix);
        System.out.println();
        getMedian(matrix);
        getTotalMean(matrix);
        getMode(matrix);
    }

    public static int[][] loadArray(int[][] arr){
        Random rand = new Random();
        for(int r = 0; r<arr.length; r++){
            for(int c = 0; c<arr[r].length; c++){
                arr[r][c] = rand.nextInt(arr.length) + 1;
            }
        }
        return arr;
    }

    public static void printMat(int[][] matrix){
        for(int r = 0; r<matrix.length; r++){
            System.out.print("[");
            for(int c = 0; c<matrix[r].length-1; c++){
                System.out.print(matrix[r][c] + ", ");
            }
            System.out.println(matrix[r][matrix[r].length-1] + "]");
        }
    }

    public static void getMean(int[][] matrix){
        double avg = 0.0;
        for(int i = 1; i<=matrix.length; i++)
            System.out.println("Mean of line " + i + ":  " + getSum(matrix[i-1])/matrix[i-1].length);
    }

    public static int getSum(int[] arr){
        int sum = 0;
        for(int r = 0; r<arr.length; r++)
            sum += arr[r];
        return sum;
    }

    public static void getMedian(int[][] matrix){
        double mid = 0.0;
        for(int i = 0; i<matrix.length; i++){
            Arrays.sort(matrix[i]);
            if(matrix[i].length%2 == 0){
                mid = (double)(matrix[i][matrix[i].length/2 - 1] + matrix[i][matrix[i].length/2])/2;
            }else{
                mid = (double)matrix[i][matrix[i].length/2];
            }
            System.out.println("Median of line " + (i+1) + ":  " + mid);
        }
    }

    public static void getTotalMean(int[][] matrix){
        double totalsum = 0;
        int numCount = 0;
        for(int r = 0; r<matrix.length; r++){
            for(int c = 0; c<matrix[r].length; c++){
                totalsum += (double)matrix[r][c];
                numCount++;
            }
        }
        System.out.println("Total Mean:  " + totalsum/numCount);
    }

    public static void getMode(int[][] matrix){
        int mode = 0;
        int[] occurenceArray;
        for(int r = 0; r< matrix.length; r++){
            mode = 0;
            Arrays.sort(matrix[r]);
            int maxvalue = matrix[r][matrix[r].length - 1];
            occurenceArray = new int[maxvalue + 1];
            for(int k = 0; k<=maxvalue; k++){
                for(int c = 0; c<matrix[r].length; c++){
                    if(matrix[r][c] == k){
                        occurenceArray[k]++;
                    }
                }
            }

            Arrays.sort(occurenceArray);
            for(int i = 0; i<maxvalue; i++){
                if(occurenceArray[i] == occurenceArray[occurenceArray.length-1]){
                    mode = i;
                }
            }
            System.out.println("The mode of line " + (r+1) + ":  " + mode);
        }
    }
}
