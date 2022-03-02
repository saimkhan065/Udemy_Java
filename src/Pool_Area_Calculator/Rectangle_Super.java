package Pool_Area_Calculator;
public class Rectangle_Super {
    private double length;
    private double width;

    public Rectangle_Super(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
     public double getArea(){
        return length*width;
     }
}
