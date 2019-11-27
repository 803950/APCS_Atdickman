// Tal Dickman
// 11/26/2019

import javax.swing.JFrame;
import javax.swing.JComponent;
import java.awt.*;
public class Pixel
{
    private double x;
    private double y;
    private double size;
    public Pixel(Graphics f){
        newPixel(f,x,y,size);
    }
    
    public static void newPixel(Graphics f, double x,double y,double size){
        f.setColor(Color.BLACK);
        f.fillRect((int)x,(int)y,(int)size,(int)size);
    }
    
    public double getX(){
        return x;
    }
    
    public double getY(){
        return y;
    }
    
    public double getSize(){
        return size;
    }
    
    public void setX(double a){
        this.x = a;
    }
    
    public void setY(double a){
        this.y = a;
    }
    
    public void setSize(double a){
        this.size = a;
    }
}
