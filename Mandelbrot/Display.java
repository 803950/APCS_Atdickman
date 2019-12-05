import javax.imageio.ImageIO;
import java.io.*;
import java.awt.image.*;
public class Display{
    public static void main(String[] args) throws Exception{
        int h = 987;
        int w = 1597;
        int iterations = 100;
        Pixel[][] picture = new Pixel[h][w];
        for(int i = 0; i<h; i++){
            for(int j = 0; j<w; j++){
                if(iterate(i,j,iterations) == 1){
                    picture[i][j] = new Pixel(0,0,0);
                }else{
                    picture[i][j] = new Pixel(255,255,255);
                }
            }
        }
        outputPicture(picture);
    }

    public static int iterate(int a, int b, int iterations){
        int convergence = 0;
        Complex complex = new Complex(0,0); // initial complex number = 0+0i
        Complex c = new Complex(a,b);
        Complex zf = iterator(complex, c, iterations);
        if(zf.abs() < 4){ // the number converges
            convergence = 1;
        }
        return convergence;
    }

    public static Complex iterator(Complex zi, Complex c, int iterations){
        if(iterations == 1){
            return zi;
        }else{
            iterator(zi.times(zi).plus(c), c, iterations - 1);
        }
        return zi;
    }

    public static void outputPicture(Pixel[][] picture) throws Exception{
        int l = picture.length;
        int w = picture[0].length;
        int[] pixels = new int[l*w];
        for(int i = 0; i<l; i++){
            for(int j = 0; j<w; j++){
                pixels[i*w + j] = picture[i][j].getColorInt();
            }
        }
        BufferedImage image = new BufferedImage(w,l,BufferedImage.TYPE_INT_RGB);
        image.setRGB(0,0,w,l,pixels,0,w);
        ImageIO.write(image, "bmp", new File("output.bmp") );
        System.out.println("image created");   
    }
}