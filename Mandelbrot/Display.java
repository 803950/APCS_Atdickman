import javax.imageio.ImageIO;
import java.io.*;
import java.awt.image.*;
public class Display{
    private static int h = 10000;
    private static int w = 10000;
    public static void main() throws Exception{
        int iterations = 100;
        Pixel[][] picture = new Pixel[h][w];
        double convergence = 0;
        for(int i = 0; i<h; i++){
            for(int j = 0; j<w; j++){
                convergence = iterate((float)(i-w/2f)/(h/3),(float)(j-h/2f)/(w/3),iterations);
                if(convergence == 0.0){ // determines black regions
                    picture[i][j] = new Pixel(0,0,0);
                }else{
                    picture[i][j] = new Pixel((int)(255*convergence),255,(int)(210*convergence)); // choose colors here
                }
            }
        }
        outputPicture(picture);
    }

    public static double iterate(float a, float b, int iterations){
        double convergence = 0.0;
        float cx = a;
        float cy = b;
        int i = 0;
        for(;i<iterations;i++){
            float nx = a*a - b*b + cx;
            float ny = 2*a*b + cy;
            a = nx;
            b = ny;
            if(a*a + b*b > 4){
                convergence = 4.0/(a*a + b*b);
                break;
            }
        }
        if(i == iterations){
            convergence = 0.0;
        }
        return convergence;
    }

    public static void outputPicture(Pixel[][] picture) throws Exception{
        int[] pixels = new int[h*w];
        for(int i = 0; i<h; i++){
            for(int j = 0; j<w; j++){
                pixels[i*w + j] = picture[i][j].getColorInt();
            }
        }
        BufferedImage image = new BufferedImage(w,h,BufferedImage.TYPE_INT_RGB);
        image.setRGB(0,0,w,h,pixels,0,w);
        ImageIO.write(image, "bmp", new File("output.bmp") );
        System.out.println("image created");   
    }
}