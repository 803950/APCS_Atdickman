import javax.imageio.ImageIO;
import java.io.*;
import java.awt.image.*;
import java.util.*;
import java.lang.Math;
public class Display{
    static final int h = 4800; // make upper case
    static int w = 1200;
    static int iterations = 100;

    public static void main(String[] args) throws Exception{
        generateMandelbrotZoom(0.0,0.0,1.0,1.0);
        generateMandelbrot();
        System.out.println("Image created.");
    }

    public static void generateMandelbrot()throws Exception{
        Complex complix;
        Pixel[][] picture = new Pixel[h][w];
        for(int i = 0; i<h; i++){
            for(int j = 0; j<w; j++){
                complix = new Complex((i-(14*h/20.0))/(w/3.0),(j-(w/2.0))/(h/3.0*w/h)); // funky numbers to center and scale the figure
                int onoff = (int)(iterate(complix)*255);
                picture[i][j] = new Pixel(onoff,onoff,onoff);
            }
        }
        outputPicture(picture);
    }
    
    public static void generateMandelbrotZoom(double ri, double ci, double rf, double cf)throws Exception{
        Complex complix;
        int newh = (int)(h*(rf-ri));
        int neww = (int)(w*(cf-ci));
        Pixel[][] picture = new Pixel[h][w];
        for(int i = 0; i<newh; i++){
            for(int j = 0; j<neww; j++){
                complix = new Complex((i-(14*newh/20.0))/(neww/3.0),(j-(neww/2.0))/(h/3.0*neww/newh)); // funky numbers to center and scale the figure
                int onoff = (int)(iterate(complix)*255);
                picture[i][j] = new Pixel(onoff,onoff,onoff);
            }
        }
        outputPicture(picture);
    }
    

    public static double iterate(Complex num){
        Complex numi = num;
        for(int convergence = 0; convergence<iterations; convergence++){
            num = num.times(num).plus(numi);
            if(num.abs()>4){
                return 1-convergence/(double)iterations;
            }
        }
        return 0;
    }

    public static void outputPicture(Pixel[][] picture) throws Exception{
        int[] pixels = new int[w*h];
        for(int i = 0; i<h; i++){
            for(int j = 0; j<w; j++){
                pixels[i*w + j] = picture[i][j].getColorInt();
            }
        }
        BufferedImage image = new BufferedImage(w,h,BufferedImage.TYPE_INT_RGB);
        image.setRGB(0,0,w,h,pixels,0,w);
        ImageIO.write(image, "bmp", new File("output.bmp") ); 
    }
}