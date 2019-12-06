/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
import java.util.*;
public class PictureTester
{
    /** Method to test zeroBlue */
    public static void testZeroBlue()
    {
        Picture beach = new Picture("beach.jpg");
        beach.explore();
        beach.zeroBlue();
        beach.explore();
    }

    /** Method to test keepOnlyBlue */
    public static void keepOnlyBlue(){
        Picture mandelbrot = new Picture("mandelbrot.jpg");
        mandelbrot.explore();
        mandelbrot.keepOnlyBlue();
        mandelbrot.explore();
    }

    /** Method to test negate*/
    public static void testNegation(){
        Picture mandelbrot = new Picture("mandelbrot.jpg");
        mandelbrot.explore();
        mandelbrot.negate();
        mandelbrot.explore();
    }

    /** Method to test grayscale*/
    public static void testGrayscale(){
        Picture mandelbrot = new Picture("mandelbrot.jpg");
        mandelbrot.explore();
        mandelbrot.grayscale();
        mandelbrot.explore();
    }

    /** Method to test mirrorVertical */
    public static void testMirrorVertical()
    {
        Picture mandelbrot = new Picture("mandelbrot.jpg");
        mandelbrot.explore();
        mandelbrot.mirrorVertical();
        mandelbrot.explore();
    }

    /** Method to test mirrorHorizontal*/
    public static void testMirrorHorizontal(){
        Picture beach = new Picture("beach.jpg");
        beach.explore();
        beach.mirrorHorizontal();
        beach.explore();
    }

    /** Method to test mirrorHorizontalBotToTop*/

    public static void testMirrorHorizontalBotToTop(){
        Picture beach = new Picture("beach.jpg");
        beach.explore();
        beach.mirrorHorizontalBotToTop();
        beach.explore();
    }

    /** Method to test mirrorVerticalRightToLeft*/
    public static void testMirrorVerticalRightToLeft(){
        Picture mandelbrot = new Picture("mandelbrot.jpg");
        mandelbrot.explore();
        mandelbrot.mirrorVerticalRightToLeft();
        mandelbrot.explore();
    }

    /** Method to test mirrorDiagonal*/
    public static void testMirrorDiagonal(){
        Picture beach = new Picture("beach.jpg");
        beach.explore();
        beach.mirrorDiagonal();
        beach.explore();
    }

    /** Method to test fixUnderwater*/
    public static void testFixUnderwater(){
        Picture water = new Picture("water.jpg");
        water.explore();
        water.fixUnderwater();
        water.explore();
    }

    /** Method to test mirrorTemple */
    public static void testMirrorTemple()
    {
        Picture temple = new Picture("temple.jpg");
        temple.explore();
        temple.mirrorTemple();
        temple.explore();
    }

    /** Method to test mirrorArms */
    public static void testMirrorArms(){
        Picture snowman = new Picture("snowman.jpg");
        snowman.explore();
        snowman.mirrorArms();
        snowman.explore();
    }

    /** Method to test mirrorGull */
    public static void testMirrorGull(){
        Picture seagull = new Picture("seagull.jpg");
        seagull.explore();
        seagull.mirrorGull();
        seagull.explore();
    }

    /** Method to test the collage method */
    public static void testCollage()
    {
        Picture canvas = new Picture("2000x2000.jpg");
        Picture rat = new Picture("rat.jpg");
        rat.explore();
        canvas.myCollage();
        canvas.explore();
    }

    /** Method to test new copy method */
    public static void testCopy(){
        Picture canvas = new Picture("640*480.jpg");
        canvas.createCollage();
        canvas.explore();
    }

    /** Method to test myCollage*/
    public static void testMyCollage(){
        Picture canvas = new Picture("2000x2000.jpg");
        canvas.myCollage();
        canvas.explore();
    }

    /** Method to test edgeDetection */
    public static void testEdgeDetection()
    {
        Picture swan = new Picture("swan.jpg");
        swan.edgeDetection(10);
        swan.explore();
    }

    /** Main method for testing.  Every class can have a main
     * method in Java */
    public static void main(String[] args)
    {
        testZeroBlue();
        //testKeepOnlyBlue();
        //testKeepOnlyRed();
        //testKeepOnlyGreen();
        //testNegate();
        //testGrayscale();
        //testFixUnderwater();
        //testMirrorVertical();
        //testMirrorTemple();
        //testMirrorArms();
        //testMirrorGull();
        //testMirrorDiagonal();
        //testCollage();
        //testCopy();
        //testEdgeDetection();
        //testEdgeDetection2();
        //testChromakey();
        //testEncodeAndDecode();
        //testGetCountRedOverValue(250);
        //testSetRedToHalfValueInTopHalf();
        //testClearBlueOverValue(200);
        //testGetAverageForColumn(0);
    }

}