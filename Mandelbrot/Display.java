import javax.imageio.ImageIO;
import java.io.*;
import java.awt.image.*;
import java.util.*;
import java.lang.Math;
public class Display{
    static final int h =1000; // make upper case
    static int w = 1000;
    static int iterations = 100;

    public static void main() throws Exception{
        //generateMandelbrot();
        
        //generateMandelbrotZoom(0.0,0.0,1.0);
        //generateMandelbrotZoom(0.20,0.35,0.3);
        //generateMandelbrotZoom(0.4,0.4,0.1);
        //generateMandelbrotZoom(0.45,0.45,0.005);
        //generateMandelbrotZoom(0.45057,0.4505,0.0005);
        //generateMandelbrotZoom(0.4513,0.44961,0.002);
        //generateMandelbrotZoom(0.305,0.400,0.02);
        //generateMandelbrotZoom(0.10725,0.49740,0.0011);
        
        System.out.println("Image created.");
    }
    
    public static void generateMandelbrotZoom(double ri, double ci, double l)throws Exception{
        Complex complix;
        Pixel[][] picture = new Pixel[h][w];
        int a;
        int b;
        for(double i = ri*h; i<(ri+l)*h; i+= l) {
            for(double j = ci*w; j<(ci+l)*w; j+= l){
                a = (int)((i-ri*h)/l);
                b = (int)((j-ci*w)/l);
                complix = new Complex((i-(14*h/20.0))/(w/3.0),(j-(w/2.0))/(h/3.0*w/h)); // funky numbers to center and scale the figure
                int onoff = (int)(iterate(complix)*255);
                
                //**************RED MACRO RED MICRO**************// so far the best one
                //picture[a][b] = new Pixel(onoff*onoff,onoff*onoff/1000000,onoff*onoff/100000);
                
                //**************GREEN MACRO RED MICRO**************// so far the best one
                //picture[a][b] = new Pixel(onoff*onoff,onoff*onoff/50,onoff*onoff/1000);
                
                //**************BLUE MACRO RED MICRO**************// so far the best one
                picture[a][b] = new Pixel((onoff*onoff),onoff*onoff/50,onoff*onoff/50);
                
                //experimental
                //picture[a][b] = new Pixel(onoff*onoff*onoff,onoff*onoff*onoff/50,onoff*onoff*onoff/1000);
                
                
            }
        }
        
        for(int p = 0; p<h; p++){
            for(int q = 0; q<w; q++){
                if(picture[p][q] == null){
                    picture[p][q] = new Pixel(0,0,0);
                }
            }
        }
        outputZoomedPicture(picture);
    }
    
    public static void generateMandelbrot()throws Exception{
        Complex complix;
        Pixel[][] picture = new Pixel[h][w];
        for(int i = 0; i<h; i++){
            for(int j = 0; j<w; j++){
                complix = new Complex((i-(14*h/20.0))/(w/3.0),(j-(w/2.0))/(h/3.0*w/h)); // funky numbers to center and scale the figure
                int onoff = (int)(iterate(complix)*255);

                //********BLACK AND WHITE/********//
                picture[i][j] = new Pixel(onoff,onoff,onoff);
            }
        }
        outputPicture(picture);
    }

    public static void outputZoomedPicture(Pixel[][] picture) throws Exception{
        int p = 0;
        int[] pixels = new int[(w-p)*(h-p)];
        for(int i = 0; i<h-p; i++){
            for(int j = 0; j<w-p; j++){
                pixels[i*(w-p) + j] = picture[i][j].getColorInt();
            }
        }
        BufferedImage image = new BufferedImage(w-p,h-p,BufferedImage.TYPE_INT_RGB);
        image.setRGB(0,0,w-p,h-p,pixels,0,w-p);
        ImageIO.write(image, "bmp", new File("output.bmp") );
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

}