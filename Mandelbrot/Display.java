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
        //generateMandelbrotZoom(0.0,0.0,1,0.1);
        //generateMandelbrot();
        generateMandelbrotZoom2(0.0,0.0,0.1);
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
        double scalarh = (rf-ri);
        double scalarw = (cf-ci);
        Pixel[][] picture = new Pixel[h][w];
        for(int i = 0; i<h; i++){
            for(int j = 0; j<w; j++){
                complix = new Complex((i-(14*h/20.0))*scalarh/((w/3.0))+scalarh,(j-(w/2.0))*scalarw/((h/3.0*w/h))+scalarw); // funky numbers to center and scale the figure
                int onoff = (int)(iterate(complix)*255);
                picture[i][j] = new Pixel(onoff,onoff,onoff);
            }
            
        }
        outputPicture(picture);
    }
    
    public static void generateMandelbrotZoom2(double ri, double ci, double len)throws Exception{
        int dim = 100;
        Complex complix;
        Pixel[][] picture = new Pixel[dim][dim];

        double newh = len;
        double neww = len;
        int p = 0;
        int q = 0;
        for(double i = ri; i<ri+newh && p<dim; i+= newh/dim, p++){
            for(double j = ci; j<ci+neww && q<dim; j+= neww/dim, q++){
                complix = new Complex((i-(14*h/20.0))/(w/3.0),(j-(w/2.0))/(h/3.0*w/h)); // funky numbers to center and scale the figure
                int onoff = (int)(iterate(complix)*255);
                picture[p][q] = new Pixel(onoff,onoff,onoff);
            }
        }
        
        outputZoomedPicture(picture, dim);
    }
    
    public static double makeLessThanOne(int n){
        double k = (double)n;
        while(k>1){
            k=k/10;
        }
        System.out.print(k);
        return k;
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
    
    public static void outputZoomedPicture(Pixel[][] picture,int dim) throws Exception{
        int[] pixels = new int[dim*dim];
        for(int i = 0; i<2; i++){
            for(int j = 0; j<2; j++){
                pixels[i*dim + j] = picture[i][j].getColorInt();
            }
        }
        BufferedImage image = new BufferedImage(dim,dim,BufferedImage.TYPE_INT_RGB);
        image.setRGB(0,0,dim,dim,pixels,0,dim);
        ImageIO.write(image, "bmp", new File("output.bmp") ); 
    }
}