package Pool_Area_Calculator;

public class Main {
    public static void main(String[] args) {
        Rectangle_Super rs = new Rectangle_Super(0.0, 0.0);
        rs.setLength(10.0);
        rs.setWidth(12.0);
        Cuboid cd = new Cuboid(rs.getLength(), rs.getWidth(), 0.0);
        System.out.println(rs.getArea());
        cd.setHeight(10.0);
        System.out.println(cd.getHeight());
        System.out.println(cd.getVolume());
    }
}
