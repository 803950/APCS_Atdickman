import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
    ///////////////////// constructors //////////////////////////////////

    /**
     * Constructor that takes no arguments 
     */
    public Picture ()
    {
        /* not needed but use it to show students the implicit call to super()
         * child constructors always call a parent constructor 
         */
        super();  
    }

    /**
     * Constructor that takes a file name and creates the picture 
     * @param fileName the name of the file to create the picture from
     */
    public Picture(String fileName)
    {
        // let the parent class handle this fileName
        super(fileName);
    }

    /**
     * Constructor that takes the width and height
     * @param height the height of the desired picture
     * @param width the width of the desired picture
     */
    public Picture(int height, int width)
    {
        // let the parent class handle this width and height
        super(width,height);
    }

    /**
     * Constructor that takes a picture and creates a 
     * copy of that picture
     * @param copyPicture the picture to copy
     */
    public Picture(Picture copyPicture)
    {
        // let the parent class do the copy
        super(copyPicture);
    }

    /**
     * Constructor that takes a buffered image
     * @param image the buffered image to use
     */
    public Picture(BufferedImage image)
    {
        super(image);
    }

    ////////////////////// methods ///////////////////////////////////////

    /**
     * Method to return a string with information about this picture.
     * @return a string with information about the picture such as fileName,
     * height and width.
     */
    public String toString()
    {
        String output = "Picture, filename " + getFileName() + 
            " height " + getHeight() 
            + " width " + getWidth();
        return output;

    }

    /** Method to set the blue to 0 */
    public void zeroBlue()
    {
        Pixel[][] pixels = this.getPixels2D();
        for (Pixel[] rowArray : pixels)
        {
            for (Pixel pixelObj : rowArray)
            {
                pixelObj.setBlue(0);
            }
        }
    }

    public void zeroRed()
    {
        Pixel[][] pixels = this.getPixels2D();
        for (Pixel[] rowArray : pixels)
        {
            for (Pixel pixelObj : rowArray)
            {
                pixelObj.setRed(0);
            }
        }
    }

    public void zeroGreen()
    {
        Pixel[][] pixels = this.getPixels2D();
        for (Pixel[] rowArray : pixels)
        {
            for (Pixel pixelObj : rowArray)
            {
                pixelObj.setGreen(0);
            }
        }
    }

    //activity 5*******************
    public void keepOnlyBlue(){
        zeroRed();
        zeroGreen();
    }

    public void negate(){
        Pixel[][] pixels = this.getPixels2D();
        for (Pixel[] rowArray : pixels){
            for (Pixel pixelObj : rowArray){
                pixelObj.setGreen(255-pixelObj.getGreen());
                pixelObj.setRed(255-pixelObj.getRed());
                pixelObj.setBlue(255-pixelObj.getBlue());
            }
        }
    }

    public void grayscale(){
        Pixel[][] pixels = this.getPixels2D();
        for (Pixel[] rowArray : pixels){
            for (Pixel pixelObj : rowArray){
                int coloravg = (pixelObj.getGreen() + pixelObj.getBlue() + pixelObj.getRed())/3;
                pixelObj.setGreen(coloravg);
                pixelObj.setRed(coloravg);
                pixelObj.setBlue(coloravg);
            }
        }
    }

    public void fixUnderwater(){
        Pixel[][] pixels = this.getPixels2D();
        for (Pixel[] rowArray : pixels){
            for (Pixel pixelObj : rowArray){
                if(pixelObj.getGreen() > pixelObj.getBlue()){
                    pixelObj.setBlue(pixelObj.getBlue()*85/100);
                }
                if(pixelObj.getGreen() < pixelObj.getBlue()){
                    pixelObj.setBlue(pixelObj.getBlue()*95/90);
                }

            }
        }
    }
    //activity 5*******************

    //activity 6*******************
    public void mirrorVerticalRightToLeft(){
        Pixel[][] pixels = this.getPixels2D();
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        int width = pixels[0].length;
        for (int row = 0; row < pixels.length; row++)
        {
            for (int col = 0; col < width / 2; col++)
            {
                leftPixel = pixels[row][col];
                rightPixel = pixels[row][width - 1 - col];
                leftPixel.setColor(rightPixel.getColor());
            }
        }
    }

    public void mirrorHorizontal(){
        Pixel[][] pixels = this.getPixels2D();
        Pixel upperPixel = null;
        Pixel lowerPixel = null;
        int length = pixels.length;
        int width = pixels[0].length;
        for (int row = 0; row < pixels.length/2; row++)
        {
            for (int col = 0; col < width; col++)
            {
                upperPixel = pixels[row][col];
                lowerPixel = pixels[length-1-row][col];
                lowerPixel.setColor(upperPixel.getColor());
            }
        }
    }

    public void mirrorHorizontalBotToTop(){
        Pixel[][] pixels = this.getPixels2D();
        Pixel firstPixel = null;
        Pixel secondPixel = null;
        int length = pixels.length;
        int width = pixels[0].length;
        for (int row = pixels.length-1; row > pixels.length/2; row--)
        {
            for (int col = 0; col < width; col++)
            {
                firstPixel = pixels[row][col];
                secondPixel = pixels[length-1-row][col];
                secondPixel.setColor(firstPixel.getColor());
            }
        }
    }

    public void mirrorDiagonal(){
        Pixel[][] pixels = this.getPixels2D();
        Pixel firstPixel = null;
        Pixel secondPixel = null;
        int length = pixels.length;
        int width = pixels[0].length;
        for (int row = 0; row< pixels.length; row++)
        {
            for (int col = 0; col < length; col++)
            {
                firstPixel = pixels[row][col];
                secondPixel = pixels[col][row];
                secondPixel.setColor(firstPixel.getColor());
            }
        }
    }
    
    /** Method that mirrors the picture around a 
     * vertical mirror in the center of the picture
     * from left to right */
    public void mirrorVertical()
    {
        Pixel[][] pixels = this.getPixels2D();
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        int width = pixels[0].length;
        for (int row = 0; row < pixels.length; row++)
        {
            for (int col = 0; col < width / 2; col++)
            {
                leftPixel = pixels[row][col];
                rightPixel = pixels[row][width - 1 - col];
                rightPixel.setColor(leftPixel.getColor());
            }
        } 
    }

    /** Mirror just part of a picture of a temple */
    public void mirrorTemple()
    {
        int mirrorPoint = 276;
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        int count = 0;
        Pixel[][] pixels = this.getPixels2D();

        // loop through the rows
        for (int row = 27; row < 97; row++)
        {
            // loop from 13 to just before the mirror point
            for (int col = 13; col < mirrorPoint; col++)
            {
                count ++; // total count should equal 18410
                leftPixel = pixels[row][col];      
                rightPixel = pixels[row]                       
                [mirrorPoint - col + mirrorPoint];
                rightPixel.setColor(leftPixel.getColor());
            }
        }
        System.out.println("Number of executions:  " + count);
    }
    
    /** Mirrors part of the snowman's arms */
    public void mirrorArms(){
        Pixel[][] pixels = this.getPixels2D();
        Pixel upperPixel = null;
        Pixel lowerPixel = null;
        int length = pixels.length;
        int width = pixels[0].length;
        int ci = 100;
        int cf = 296;
        int ri = 163;
        int rf = 200;
        for (int row = ri; row < rf; row++)
        {
            for (int col = ci; col < cf; col++)
            {
                upperPixel = pixels[row][col];
                lowerPixel = pixels[390-row][col];
                lowerPixel.setColor(upperPixel.getColor());
            }
        }
    }
    
    /** Mirrors a seagull */
    public void mirrorGull(){
        Pixel[][] pixels = this.getPixels2D();
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        int ri = 230;
        int rf = 330;
        int ci = 230;
        int cf = 345;
        int width = 0;
        for (int row = ri; row < rf; row++)
        {
            for (int col = ci; col<cf; col++)
            {
                leftPixel = pixels[row][col];
                rightPixel = pixels[row-col/20][rf+ri - col - 150];
                rightPixel.setColor(leftPixel.getColor());
            }
        } 
    }
    
    /** copy from the passed fromPic to the
     * specified startRow and startCol in the
     * current picture
     * @param fromPic the picture to copy from
     * @param startRow the start row to copy to
     * @param startCol the start col to copy to
     */
    public void copy(Picture fromPic, 
    int startRow, int startCol)
    {
        Pixel fromPixel = null;
        Pixel toPixel = null;
        Pixel[][] toPixels = this.getPixels2D();
        Pixel[][] fromPixels = fromPic.getPixels2D();
        for (int fromRow = 0, toRow = startRow; 
        fromRow < fromPixels.length &&
        toRow < toPixels.length; 
        fromRow++, toRow++)
        {
            for (int fromCol = 0, toCol = startCol; 
            fromCol < fromPixels[0].length &&
            toCol < toPixels[0].length;  
            fromCol++, toCol++)
            {
                fromPixel = fromPixels[fromRow][fromCol];
                toPixel = toPixels[toRow][toCol];
                toPixel.setColor(fromPixel.getColor());
            }
        }   
    }
    
    public void copy(Picture fromPic, 
    int startRow, int startCol, int fromstartrow, int fromendrow, int fromstartcol, int fromendcol)
    {
        Pixel fromPixel = null;
        Pixel toPixel = null;
        Pixel[][] toPixels = this.getPixels2D();
        Pixel[][] fromPixels = fromPic.getPixels2D();
        for (int fromRow = fromstartrow, toRow = startRow; 
        fromRow < fromPixels.length &&
        toRow < toPixels.length; 
        fromRow++, toRow++)
        {
            for (int fromCol = fromstartcol, toCol = startCol; 
            fromCol < fromendcol &&
            toCol < toPixels[0].length;  
            fromCol++, toCol++)
            {
                fromPixel = fromPixels[fromRow][fromCol];
                toPixel = toPixels[toRow][toCol];
                toPixel.setColor(fromPixel.getColor());
            }
        }   
    }
    /** Method to create a collage of several pictures */
    public void createCollage()
    {
        Picture flower1 = new Picture("flower1.jpg");
        Picture flower2 = new Picture("flower2.jpg");
        this.copy(flower1,0,0);
        this.copy(flower2,100,0);
        this.copy(flower1,200,0);
        Picture flowerNoBlue = new Picture(flower2);
        flowerNoBlue.zeroBlue();
        this.copy(flowerNoBlue,300,0);
        this.copy(flower1,400,0);
        this.copy(flower2,500,0);
        this.mirrorVertical();
        this.write("collage.jpg");
    }
    
    public void myCollage(){
        Picture rat = new Picture("rat.jpg");
        this.copy(rat,0,0,50,600,500,1000);
        this.write("collage.jpg");
    }

    /** Method to show large changes in color 
     * @param edgeDist the distance for finding edges
     */
    public void edgeDetection(int edgeDist)
    {
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        Pixel[][] pixels = this.getPixels2D();
        Color rightColor = null;
        for (int row = 0; row < pixels.length; row++)
        {
            for (int col = 0; 
            col < pixels[0].length-1; col++)
            {
                leftPixel = pixels[row][col];
                rightPixel = pixels[row][col+1];
                rightColor = rightPixel.getColor();
                if (leftPixel.colorDistance(rightColor) > 
                edgeDist)
                    leftPixel.setColor(Color.BLACK);
                else
                    leftPixel.setColor(Color.WHITE);
            }
        }
    }

    /* Main method for testing - each class in Java can have a main 
     * method 
     */
    public static void main(String[] args) 
    {
        Picture pic = new Picture("mandelbrot.jpg");
        pic.explore();
        pic.zeroBlue();
        pic.explore();
    }

} // this } is the end of class Picture, put all new methods before this
