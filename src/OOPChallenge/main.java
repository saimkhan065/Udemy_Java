package OOPChallenge;

public class main {
    public static void main(String[] args) {
        BasicBurger bb = new BasicBurger();
        HealthyBurger healthyBurger = new HealthyBurger();
        bb.getBasic_Burger_toppings("lettuce","no","no");
        healthyBurger.getBasic_Burger_toppings("lettuce","no","cheese");
        UltimateBurger ultimateBurger = new UltimateBurger();
       ultimateBurger.getBasic_Burger_toppings("no","no","cheese");
        System.out.println(ultimateBurger.getPrice());
    }


}
