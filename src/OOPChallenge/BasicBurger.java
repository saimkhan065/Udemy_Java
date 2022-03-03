package OOPChallenge;

public class BasicBurger {
    private double price;
    private String bread_type;
    private String meat;
    private String topping_1, topping_2, topping_3, topping_4;
    private double topping_lettuce = 0.20;
    private double topping_tomato = 0.30;
    private double topping_cheese = 0.50;

    public BasicBurger() {

        this.bread_type = "White Bread";
        this.meat = "Beef";
        this.price = 3.50;
    }

    public void getBasicBurger(){
        System.out.println("Bread:"+bread_type+" Meat:"+meat+" Total:$"+price);

    }

    public void getBasic_Burger_toppings(String topping_1, String topping_2,
                                         String topping_3){
        if (topping_1.equals("lettuce"))
        {
            price+= topping_lettuce;
        }
        if (topping_2.equals("tomato")){
            price+= topping_tomato;
        }
        if (topping_3.equals("cheese")){
            price+=topping_cheese;
        }
        System.out.println("Burger with toppings: "+price);
    }

    public String getBread_type() {
        return bread_type;
    }


    public String getMeat() {
        return meat;
    }


    public String getTopping_1() {
        return topping_1;
    }


    public String getTopping_2() {
        return topping_2;
    }


    public String getTopping_3() {
        return topping_3;
    }

    public String getTopping_4() {
        return topping_4;
    }

    public void setTopping_lettuce(double topping_lettuce) {
        this.topping_lettuce = topping_lettuce;
    }

    public void setTopping_tomato(double topping_tomato) {
        this.topping_tomato = topping_tomato;
    }

    public void setTopping_cheese(double topping_cheese) {
        this.topping_cheese = topping_cheese;
    }
}
