package Pool_Area_Calculator;

public class Cuboid extends Rectangle_Super{
    private double height;

    public Cuboid(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume(){
        return  getArea()*height;
    }
}
