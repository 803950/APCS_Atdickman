import java.util.*;
public class IntArrayWorker
{
    /** two dimensional matrix */
    private int[][] matrix = null;

    /** set the matrix to the passed one
     * @param theMatrix the one to use
     */
    public void setMatrix(int[][] theMatrix)
    {
        matrix = theMatrix;
    }

    /**
     * Method to return the total 
     * @return the total of the values in the array
     */
    public int getTotal()
    {
        int total = 0;
        for (int row = 0; row < matrix.length; row++)
        {
            for (int col = 0; col < matrix[0].length; col++)
            {
                total = total + matrix[row][col];
            }
        }
        return total;
    }

    /**
     * Method to return the total using a nested for-each loop
     * @return the total of the values in the array
     */
    public int getTotalNested()
    {
        int total = 0;
        for (int[] rowArray : matrix)
        {
            for (int item : rowArray)
            {
                total = total + item;
            }
        }
        return total;
    }

    /**
     * Method to fill with an increasing count
     */
    public void fillCount()
    {
        int numCols = matrix[0].length;
        int count = 1;
        for (int row = 0; row < matrix.length; row++)
        {
            for (int col = 0; col < numCols; col++)
            {
                matrix[row][col] = count;
                count++;
            }
        }
    }

    /**
     * print the values in the array in rows and columns
     */
    public void print()
    {
        for (int row = 0; row < matrix.length; row++)
        {
            for (int col = 0; col < matrix[0].length; col++)
            {
                System.out.print( matrix[row][col] + " " );
            }
            System.out.println();
        }
        System.out.println();
    }

    /** 
     * fill the array with a pattern
     */
    public void fillPattern1()
    {
        for (int row = 0; row < matrix.length; row++)
        {
            for (int col = 0; col < matrix[0].length; 
            col++)
            {
                if (row < col)
                    matrix[row][col] = 1;
                else if (row == col)
                    matrix[row][col] = 2;
                else
                    matrix[row][col] = 3;
            }
        }
    }

    public int getCount(int[][] nums, int val){
        int count = 0;
        for(int r = 0; r<nums.length; r++){
            for(int c = 0; c<nums[r].length; c++){
                if(nums[r][c] == val){
                    count++;
                }
            }
        }
        return count;
    }
    
    public int getLargest(int[][] nums){
        int largest = 0;
        for(int r = 0; r<nums.length; r++){
            for(int c = 0; c<nums[r].length; c++){
                if(nums[r][c] > largest){
                    largest = nums[r][c];
                }
            }
        }
        return largest;
    }
    
    public int getColTotal(int[][] nums, int column){
        int sum = 0;
        for(int r = 0; r<nums.length; r++){
            sum += nums[r][column];
        }
        return sum;
    }
    
    
    /** Method to test Lab 1204 */
    public static int[][] loadEvensOdds(int[][] a){
        Random rand = new Random();
        for(int i = 0; i<a.length; i++){
            for(int j = 0; j<a[i].length; j++){
                a[i][j] = rand.nextInt(9)+1;
                if(j <= (a[i].length/2 - 1)){//left side
                    if(a[i][j]%2 != 0){
                        int n = rand.nextInt(1);
                        if(n == 1){
                            a[i][j]++;
                        }else{
                            a[i][j]--;
                        }
                    }
                }else{//right side
                    if(a[i][j]%2 == 0){
                        int n = rand.nextInt(1);
                        if(n == 1){
                            a[i][j]++;
                        }else{
                            a[i][j]--;
                        }
                    }
                }
            }   
        }
        return a;
    }
    
    public void flipVertical(int[][] numarray){
        int leftnum = 0;
        int rightnum = 0;
        int temp = 0;
        for(int r = 0; r<numarray.length; r++){
            for(int c = 0; c<numarray[r].length/2; c++){
                temp = numarray[r][c];
                numarray[r][c] = numarray[r][numarray[r].length - 1 - c];
                numarray[r][numarray[r].length - 1 - c] = temp;
            }
        }
    }
    
    public static void print2DArray(int[][] arr){
        for(int i = 0; i <arr.length;i++){
            for(int j = 0; j<arr[i].length;j++){
                System.out.print(arr[i][j] + ", ");
            }
            System.out.println();
        }
    }
    
}