
/**
 * review for exam1
 *
 * @tdickman
 * @916
 */
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
            //4.2
        public static int Digits2(int longsum,int longnum){
            while(longnum !=0){
                longsum += longnum%10;
                longnum = longnum%10;
            }
            return longsum;
        }  
        public static void main(){
            int count = 0;
            int longnum = 12345;
            int longsum = 0;
            System.out.print(Digits1(count,longnum));
            System.out.print(Digits2(longsum,longnum));
        }
}