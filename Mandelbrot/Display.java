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
        g.setColor(Color.BLACK);
        int xi = 400;
        int yi = 400;
        int size = 10;
        for(int i = 0; i < 100/size; i++){ // testing code, fills a 100*100 square with pixels
            for(int j = 0; j< 100/size; j++){
                Pixel.newPixel(g,(xi + size*j*2),(yi + size*i*2),size);
            }
        }
    }
    
    public Display(){
        
    }
    
}
