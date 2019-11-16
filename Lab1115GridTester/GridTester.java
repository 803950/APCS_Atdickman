
/**
 * GridTester loads a square 2 dimensional array with random integers and then finds trends of the numbers
 *
 * Tal Dickman
 * 16 November 2019
 */
import java.util.*;
public class GridTester
{
    public static void main(){
        int length = 10;
        int maximum = 100;
        int[][] matrix = loadArray(length,maximum); // 10*10 array with numbers 1 to 100
        int sum = sumAll(matrix);
        int greatest = findGreatest(matrix);
        int greatnum = numberOfGreatest(matrix);
        double average = findAvg(matrix);
        // Printing out sum, greatest, number of greatest, and average:
        System.out.println("Random " + length + " by " + length + " matrix:");
        printMatrix(matrix);
        System.out.println();
        System.out.println("Sum of all values in the matrix: " + sum);
        System.out.println("Greatest value in the matrix: " + greatest);
        System.out.println("Number of times greatest number occurs: " + greatnum);
        System.out.println("Average of all values in the matrix: " + average);
    }
    
    public static int[][] loadArray(int len, int max){ // len is dimension, max is highest number (range 1 --> max)
        int[][] mat = new int[len][len];
        Random rand = new Random();
        for(int r = 0; r<mat.length; r++){
            for(int c = 0; c<mat[r].length; c++){
                mat[r][c] = rand.nextInt(max) + 1;
            }
        }
        return mat;
    }
    
    public static int sumAll(int[][] mat){
        int sum = 0;
        for(int r = 0; r<mat.length; r++){
            for(int c = 0; c<mat[r].length; c++){
                sum += mat[r][c];
            }
        }
        return sum;
    }
    
    public static int findGreatest(int[][] mat){
        int max = 0;
        for(int r = 0; r<mat.length; r++){
            for(int c = 0; c<mat[r].length; c++){
                if(mat[r][c] > max){
                    max = mat[r][c];
                }
            }
        }
        return max;
    }
    
    public static int numberOfGreatest(int[][] mat){
        int maximum = findGreatest(mat);
        int num = 0;
        for(int r = 0; r<mat.length; r++){
            for(int c = 0; c<mat[r].length; c++){
                if(mat[r][c] == maximum){
                    num++;
                }
            }
        }
        
        return num;
    }
    
    public static double findAvg(int[][] mat){
        double average = sumAll(mat)/(mat.length*mat[0].length);
        return average;
    }
    
    public static void printMatrix(int[][] mat){
        for(int r = 0; r<mat.length; r++){
            System.out.print("[");
            for(int c = 0; c<mat[r].length-1; c++){
                System.out.print(mat[r][c] + ", ");
            }
            System.out.println(mat[r][mat[r].length-1] + "]");
        }
    }
}