
/**
 * Write a description of class CalcRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CalcRunner
{
    private int x;
    private int y;
    // Constructor
    public CalcRunner()
    {
        x = 0;
        y = 0;
    }

    public static void main(){
        SimpleCalc calculator = new SimpleCalc();
        System.out.println(calculator.add(3,4));
        System.out.println(calculator.subtract(3,4));
        System.out.println(calculator.multiply(3,4));
        System.out.println(calculator.divide(3,4));
        System.out.println(calculator.moduloDivide(5,4));
    }
    
}
