package Carpet_Area_Calculator;

public class S5_CarpetArea_Class_Dimensions {
    private double length;
    private double width;
    private double area;

    public S5_CarpetArea_Class_Dimensions(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calcArea(){
       return this.area = length*width;

    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

}



