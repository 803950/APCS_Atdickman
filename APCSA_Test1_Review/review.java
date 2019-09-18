
/**
 * review for exam1
 *
 * @tdickman
 * @916
 */
import java.lang.Math;
public class review
{
    //1.1
    boolean test = true;
    //1.2
    //a is incorrect
    //b is incorrect
    //c is incorrect
    //d is incorrect
    //e is incorrect

    //2.1
    public class Pumpkin{
        private int num;
        public Pumpkin(int n){
            num = n;
        }
        Pumpkin p = new Pumpkin(3);
    }
    //3.1
    public class Numbers{
        //1
        int num1 = 3;
        int num2 = 4;
        //2
        public Numbers(int p,int q){
            num1 = p;
            num2 = q;
        }
        //3
        public int multiply(int p,int q){
            return p*q;
        }
    }
    //4.1
    public static int Digits1(int longnum, int count){
        while(longnum !=0){
            count++;
            longnum = (int)(longnum/10);
        }
        return count;
    }
    //4.2 and 5
    public static int Digits2(int longsum,int longnum){
        while(longnum !=0){
            longsum += longnum%10;
            longnum = (int)longnum/10;
        }
        return longsum;
    }  
    //6
    public static int add(int q,int p){
        return q+p;
    }

    public static int sub(int q,int p){
        return q-p;
    }

    public static int mul(int q,int p){
        return q*p;
    }

    public static int div(int q,int p){
        return q/p;
    }
    //7
    public static void output(int cntrl,int num){
        while(cntrl < num){
            cntrl++;
            System.out.println("num = " + num + ", cntrl = " + cntrl);
        }
    }
    //8 
    // the code will print "Space Out"

    //9 and 10
    public static int[] array_gen(){
        int[] random_array = new int[10];
        for(int i=0;i<random_array.length;i++){
            random_array[i] = (int)(Math.random()*10 + 1);
        }
        return random_array;

    }
    //11
    public static int array_sum(int[] array){
        int sum = 0;
        for(int i=0;i<array.length;i++){
            sum+=array[i];

        }
        return sum;
    }
    //12
    public int[] copyArray(int[] origArr){
        int[] newArray = new int[origArr.length];
        for(int i = 0; i<origArr.length; i++){
            newArray[i] = origArr[i];
        }
        return origArr;
    }

    public static void main(){
        int count = 0;
        int longnum = 12345;
        int longsum = 0;
        System.out.println("The number of digits is: " + Digits1(longnum,0));
        System.out.println("The sun of the digits is: " + Digits2(0,longnum));
        System.out.print("The output for the while loop in question 7 is ");
        output(0,5);
        array_gen();
        int[] ary = array_gen();
        for(int i = 0;i<ary.length;i++){
            System.out.print(ary[i]);
        }
        System.out.println();
        System.out.println("The sum of the digits of the random array above is: " + array_sum(ary));
    }
}