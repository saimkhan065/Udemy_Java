package OOPChallenge;

public class UltimateBurger extends BasicBurger{

    private double price;

    public UltimateBurger() {
        this.price=5.00;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void getBasic_Burger_toppings(String topping_1, String topping_2, String topping_3) {
        System.out.println("Ultimate Burger :");
        super.getBasic_Burger_toppings(topping_1, topping_2, topping_3);

    }
}
