import javax.imageio.ImageIO;
import java.io.*;
import java.awt.image.*;
public class Display{
    public static void main(String[] args) throws Exception{
        int h = 8000;
        int w = 8000;
        int iterations = 100;
        Pixel[][] picture = new Pixel[h][w];
        for(int i = 0; i<h; i++){
            for(int j = 0; j<w; j++){
                if(iterate((float)(i-w/2f)/(h/3),(float)(j-h/2f)/(w/3),iterations) == 0){
                    picture[i][j] = new Pixel(0,0,0);
                }else{
                    picture[i][j] = new Pixel(255,255,255);
                }
            }
        }
        outputPicture(picture);
    }

    public static int iterate(float a, float b, int iterations){
        int convergence = 0;
        float cx = a;
        float cy = b;
        int i = 0;
        for(;i<iterations;i++){
            float nx = a*a - b*b + cx;
            float ny = 2*a*b + cy;
            a = nx;
            b = ny;
            if(a*a + b*b > 4){
                break;
            }
        }
        if(i == iterations){
            convergence = 0;
        }else{
            convergence = 1;
        }
        return convergence;
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