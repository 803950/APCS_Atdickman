
/**
 * FRQ 2017.4
 *
 * @author Tal Dickman
 * @version 12 December 2019
 */
public class Position
{
    public Position(int r, int c){

    }
    
    public Position findPosition(int num, int[][] arr){
        for(int r = 0; r<arr.length; r++){
            for(int c = 0; c<arr[r].length; c++){
                if(arr[r][c] == num){
                    return new Position(r,c);
                }
            }
        }
        return null;
    }
    
    public Position[][] getSuccessorArray(int[][] intArr){
        int r = intArr.length;
        int c = intArr[r].length; // assuming that intArr is square
        Position[][]posarr = new Position[r][c];
        for(int i = 0; i<r; i++){
            for(int j = 0; j<c; j++){
                posarr[i][j] = findPosition(intArr[i][j]+ 1, intArr);
            }
        }
        return posarr;
    }
    
    public void toString(Position[][] posArray){
        for(int r = 0; r<posArray.length; r++){
            for(int c = 0; c<posArray[r].length; c++){
                System.out.print("");
            }
        }
    }
}
