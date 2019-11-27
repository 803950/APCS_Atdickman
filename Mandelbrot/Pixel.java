// Tal Dickman
// 11/26/2019

import javax.swing.JFrame;
import javax.swing.JComponent;
import java.awt.*;
public class Pixel
{
    public Pixel(Graphics f, int x, int y, int size){
        newPixel(f,x,y,size);
    }
    
    public static void newPixel(Graphics f, int x,int y,int size){
        f.setColor(Color.BLACK);
        f.fillRect(x,y,size,size);
    }
}
