import javax.imageio.ImageIO;
import java.io.*;
import java.awt.image.*;
import java.util.*;
import java.lang.Math;
/**
 * Write a description of class Mandelbrot here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Mandelbrot implements Display
{
    public Mandelbrot(){
        final int h =10000; // make upper case
        int w = 10000;
        int iterations = 100;
    }
    public static void main() throws Exception{
        Mandelbrot m = new Mandelbrot();
        m.generate(0.0,0.0,1.0); // full
        //generate(0.20,0.35,0.3); // top half
        //generate(0.4,0.4,0.1); //crack
        //generate(0.45,0.45,0.005); // swirl
        //generate(0.45057,0.4505,0.0005); // spiral
        //generateMandelbrotZoom(0.4513,0.44961,0.002); // girl with braids
        //generateMandelbrotZoom(0.305,0.400,0.02); // spiky mini mandelbrot
        //generateMandelbrotZoom(0.10725,0.49740,0.0011); // spiky tail
        //generateMandelbrotZoom(0.10725556,0.49740059,0.0000002); // tunnel
        //generateMandelbrotZoom(0.107255653,0.497400682,0.000000018); // hole
        //generateMandelbrotZoom(0.2,0.0,1.0); // for Unconnected Julia Set
        //generateMandelbrotZoom(0.1072556600,0.4974006898,0.000000003); // mandeblrot inside hole
        //generateMandelbrotZoom(0.74934,0.29430,0.000022); // spiky mini mandelbrot
        System.out.println("Image created.");
    }
    
    public void generate(double ri, double ci, double l)throws Exception{
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
                
                //**************RED MACRO RED MICRO**************//
                picture[a][b] = new Pixel(onoff*onoff,onoff*onoff/1000000,onoff*onoff/100000);
                
                //**************GREEN MACRO RED MICRO**************// so far the best one
                //picture[a][b] = new Pixel(onoff*onoff,onoff*onoff/50,onoff*onoff/1000);
                
                //**************BLUE MACRO RED MICRO**************//
                //picture[a][b] = new Pixel((onoff*onoff),onoff*onoff/50,onoff*onoff/40);
                
                //**************CONFETTI**************//
                //picture[a][b] = new Pixel(onoff*onoff*onoff,onoff*onoff*onoff/10,onoff*onoff*onoff/500);
                
                //**************GRAYSCALE**************//
                //picture[a][b] = new Pixel(onoff,onoff,onoff);
                
                //**************INVERSE GRAYSCALE**************//
                //picture[a][b] = new Pixel(255-onoff,255-onoff,255-onoff);
                
                //**************YELLOW MACRO BLUE MICRO**************//
                //picture[a][b] = new Pixel(onoff*onoff/50,onoff*onoff/50,onoff*onoff);
                
                //**************RED MACRO BLUE MICRO**************//
                //picture[a][b] = new Pixel(onoff*onoff/50,onoff*onoff/1000,onoff*onoff);
            }
        }
        
        for(int p = 0; p<h; p++){
            for(int q = 0; q<w; q++){
                if(picture[p][q] == null){
                    picture[p][q] = new Pixel(0,0,0);
                }
            }
        }
        output(picture);
    }

    public void output(Pixel[][] picture) throws Exception{
        int p = 0;
        int[] pixels = new int[(w-p)*(h-p)];
        for(int i = 0; i<h-p; i++){
            for(int j = 0; j<w-p; j++){
                pixels[i*(w-p) + j] = picture[i][j].getColorInt();
            }
        }
        BufferedImage image = new
        BufferedImage(w-p,h-p,BufferedImage.TYPE_INT_RGB);
        image.setRGB(0,0,w-p,h-p,pixels,0,w-p);
        ImageIO.write(image, "bmp", new File("output.bmp") );
    }
    
    public double iterate(Complex num){
        Complex numi = num; //Mandelbrot Set
        //Complex numi = new Complex(-0.6,0.46); //Disconnected Julia Set
        //Complex numi = new Complex(-0.6,0.42); //Connected Julia Set
        for(int convergence = 0; convergence<iterations; convergence++){
            num = num.times(num).plus(numi);
            if(num.abs()>4){
                return 1-convergence/(double)iterations;
            }
        }
        return 0;
    }
}
