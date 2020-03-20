
/**
 * Abstract class Display - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public interface Display
{
    static final int h =1000; // make upper case
    static int w = 1000;
    static int iterations = 800;
    
    public double iterate(Complex num);
    public void generate(double ri, double ci, double l) throws Exception;
    public void output(Pixel[][] picture) throws Exception;
}
