
/**
 * Nested loops
 * 
 * @author tdickman
 * @version 918
 */
public class Nested_Loops
{
    public static void main(){
        ProblemA();
        ProblemB();
    }
    
    public static void ProblemA(){
        for(int i=1; i<=5; i++){
            for(int j=0; j<i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    
    public static void ProblemB(){
        for(int i=1; i<=5; i++){
            for(int j=1; j<8; j++){
                System.out.print(6-i);
            }
            System.out.println();
        }
    }
}