package In_Class;

public class Rectangle implements Measurable {

    private int myWidth;
    private int myHeight;

    public Rectangle(int width, int height ){

        myHeight = height;
        myWidth = width;

    }

    public double getPerimeter(){
        return 2 * (myHeight + myWidth);
    }


    public double getArea(){
        return myHeight * myWidth;
    }
    
}
