
/**
 * Write a description of class SimpleCalc here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SimpleCalc
{
    public double add(double q,double p){
        double sum = q + p;
        return sum;
    }
    public double subtract(double q, double p){
        double sub = q - p;
        return sub;
    }
    public double multiply(double q, double p){
        double mul = q*p;
        return mul;
    }
    public double divide(double q, double p){
        double div = 0;
        if(p != 0){
            div = q/p;
            return div;
        }else{
            div = 0;
        }
        return div;
    }
    public int moduloDivide(int q, int p){
        int mod = q%p;
        return mod;
    }
}
