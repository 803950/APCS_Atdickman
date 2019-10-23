
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
        System.out.println();
        ProblemB();
        System.out.println();
        ProblemC(6);
        System.out.println();
        ProblemD(5);
        System.out.println();
        ProblemE(5);
        System.out.println();
        ProblemF(10);
        System.out.println();
        ProblemG(7);
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

    public static void ProblemC(int n){
        for(int i = 0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }

    public static void ProblemD(int n){
        for(int i=1; i<=n; i++){
            for(int j=0; j<(n-i); j++){
                System.out.print("-");
            }
            System.out.println(i);
        }
    }

    public static void ProblemE(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=(n-i-2);j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void ProblemF(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<(n-i);j++){
                System.out.print(" ");
            }
            for(int j=0;j<(2*i+1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=0;i--){
            for(int j=0;j<(n-i);j++){
                System.out.print(" ");
            }
            for(int j=0;j<(2*i+1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void ProblemG(int n){
        //top line
        System.out.print("+ ");
        for(int i=0;i<(n+1);i++){
            System.out.print("- ");
        }
        System.out.print("+");
        //diamond1_top
        System.out.println();
        for(int j=0;j<(n-3);j++){
            System.out.print("|");
            for(int k=0;k<(n-j);k++){
                System.out.print(" ");
            }
            for(int l=0;l<j;l++){
                System.out.print("/");
            }
            System.out.print("+");
            for(int l=0;l<j;l++){
                System.out.print("\\");
            }
            for(int k=0;k<(n-j+2);k++){
                System.out.print(" ");
            }
            System.out.print("|");
            System.out.println();
        }
        //diamond1_bottom
        for(int j=0;j<(n-3);j++){
            System.out.print("|");
            for(int k=0;k<(j+4);k++){
                System.out.print(" ");
            }
            for(int l=0;l<(n-(j+4));l++){
                System.out.print("\\");
            }
            System.out.print("+");
            for(int l=0;l<((n-(j+4)));l++){
                System.out.print("/");
            }
            for(int k=0;k<(n+j-1);k++){
                System.out.print(" ");
            }
            System.out.print("|");
            System.out.println();
        }
        //middle line
        System.out.print("+ ");
        for(int i=0;i<(n+1);i++){
            System.out.print("- ");
        }
        System.out.print("+");
        //diamond2_top
        System.out.println();
        for(int j=0;j<(n-3);j++){
            System.out.print("|");
            for(int k=0;k<(j+4);k++){
                System.out.print(" ");
            }
            for(int l=0;l<(n-(j+4));l++){
                System.out.print("\\");
            }
            System.out.print("+");
            for(int l=0;l<((n-(j+4)));l++){
                System.out.print("/");
            }
            for(int k=0;k<(n+j-1);k++){
                System.out.print(" ");
            }
            System.out.print("|");
            System.out.println();
        }
        //diamond2_bottom
        for(int j=0;j<(n-3);j++){
            System.out.print("|");
            for(int k=0;k<(n-j);k++){
                System.out.print(" ");
            }
            for(int l=0;l<j;l++){
                System.out.print("/");
            }
            System.out.print("+");
            for(int l=0;l<j;l++){
                System.out.print("\\");
            }
            for(int k=0;k<(n-j+2);k++){
                System.out.print(" ");
            }
            System.out.print("|");
            System.out.println();
        }
        System.out.print("+ ");
        for(int i=0;i<(n+1);i++){
            System.out.print("- ");
        }
        System.out.print("+ ");
        System.out.println();
        
    }
}