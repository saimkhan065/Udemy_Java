package OOPChallenge;

public class HealthyBurger extends BasicBurger{
    private String bread_type;
    private String meat;
    private double price;

    public HealthyBurger() {
        this.bread_type = "Brown Bread";
        this.meat = "Chicken";
        this.price = 3.50;
    }

    @Override
    public void getBasic_Burger_toppings(String topping_1, String topping_2, String topping_3) {
        System.out.println("Healthy Burger :");
        super.getBasic_Burger_toppings(topping_1, topping_2, topping_3);

    }


}
