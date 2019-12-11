import javax.imageio.ImageIO;
import java.io.*;
import java.awt.image.*;
import java.util.*;
import java.lang.Math;
public class Display{
    static final int h = 1000; // make upper case
    static int w = 1000;
    static int iterations = 100;

    public static void main(String[] args) throws Exception{
        generateMandelbrot();
        System.out.println("Image created.");
        generateMandelbrot(0,0,1,1);
        generateMandelbrot();
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

    public static void generateMandelbrot(int ri,int ci,int rf,int cf)throws Exception{
        Complex complix;
        Pixel[][] picture = new Pixel[h][w];
        for(int i = ri; i<rf; i++){
            for(int j = ci; j<cf; j++){
                complix = new Complex((ri-(14*rf/20.0))/(cf/3.0),(ci-(cf/2.0))/(rf/3.0*cf/rf)); // funky numbers to center and scale the figure
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