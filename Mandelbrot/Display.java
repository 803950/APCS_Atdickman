// Tal Dickman
// 11/26/2019

import javax.swing.JFrame;
import javax.swing.JComponent;
import java.awt.*;
public class Display extends JComponent{
    public static void main(){
        int w = 1000;
        int h = 1000;
        Graphics g;
        JFrame frame = new JFrame("Mandelbrot");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(w,h);        
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.WHITE);
        frame.add(new Display());
    }

    public void paint(Graphics g){ // this is where the pixels will be plotted
        Pixel p = new Pixel(g);
        int w = 1000;
        int h = 1000;
        g.setColor(Color.BLACK);
        int size = 1;
        int iterations = 1000;
        for(int i = 0; i < w/size; i++){
            for(int j = 0; j< h/size; j++){
                p.setX(j);
                p.setY(i);
                int color = calculateColor(j,i,iterations,4.0);
                if(color == 1){ // if magnitude is less than the max
                    p.newPixel(g,j,i,size); // draw a pixel
                }
            }
        }
    }

    public Display(){

    }

    public static int iterator(Pixel p, int max){
        int marker = 0;
        double a = (double)p.getX();
        double b = (double)p.getX();
        Complex zf;
        Complex zi = new Complex(0,0); // z0 is the z at iteration 0.
        Complex complix = new Complex(a,b);
        int iterations = 100;
        zf = iterate(complix,zi,iterations);
        if(zf.abs() > max){
            marker = 1;
        }
        return marker;
    }

    public static Complex iterate(Complex constant, Complex zi, int iterations){
        if(iterations == 1){
            return zi;
        }else{
            Complex zf = zi.times(zi).plus(constant);
            iterate(constant,zf,iterations-1);
            return zf;
        }
    }

    public int calculateColor(double x, double y,int iterations, double max){
        int marker = 1;
        double cx = x;
        double cy = y;
        for(int i = 0; i<iterations; i++){
            double nx = x*x - y*y + cx;
            double ny = 2*x*y + cy;
            x = nx;
            y = ny;
            if(x*x + y*y > max){ // if it "diverges" (passes the maximum)
                break;
            }else{
                marker = 0;
            }
        }
        return marker;
    }
}
