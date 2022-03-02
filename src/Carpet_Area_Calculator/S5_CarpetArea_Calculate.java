package Carpet_Area_Calculator;
public class S5_CarpetArea_Calculate {


    public static void main(String[] args) {
        S5_CarpetArea_Class_Dimensions S5_D = new S5_CarpetArea_Class_Dimensions(50.0,100.0);
        S5_CarpetArea_Class_Cost S5_C = new S5_CarpetArea_Class_Cost(10);
        System.out.println("Length = "+S5_D.getLength());
        System.out.println("Width = "+S5_D.getWidth());
        System.out.println("Cost = $"+S5_C.getCarpet_cost()+"/sq. m");
        System.out.println("Area to be carpeted = " +S5_D.calcArea()+"sq. m");
        double totalcost = S5_D.calcArea() * S5_C.getCarpet_cost();
        System.out.println("Total cost of carpeting @");
    }

}
