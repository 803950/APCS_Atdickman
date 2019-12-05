public class Pixel{
    private int red;
    private int green;
    private int blue;
    Pixel(int r, int g, int b){
        red = r;
        green = g;
        blue = b;
    }

    public void setRed(int a){
        red = a;
    }

    public void setGreen(int a){
        green = a;
    }

    public void setBlue(int a){
        blue = a;
    }

    public int getRed(){
        return red;
    }

    public int getGreen(){
        return green;
    }

    public int getBlue(){
        return blue;
  }

  public int getColorInt(){
    return red*16*16*16*16 + green*16*16 + blue; // to put into base 16
  }
}