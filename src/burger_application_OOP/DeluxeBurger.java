package burger_application_OOP;

public class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        super("Deluxe", "Sausage & Bacon", 14.54, "White");
        addHamburgerAddition1("Chips", 2.75);
        addHamburgerAddition2("Coke", 1.81);
        System.out.println(itemizeHamburger());
    }

    public DeluxeBurger(String name, String meat, double price, String breadRollType) {
        super(name, meat, price, breadRollType);
        name = "Deluxe Hamburger";
        meat = "Sausage & Bacon";
        price = 14.54;
        breadRollType = "White";

    }

    @Override
    public void addHamburgerAddition1(String addition1Name, double addition1Price) {
        super.addHamburgerAddition1("Chips", 2.75);
    }

    @Override
    public void addHamburgerAddition2(String addition2Name, double addition2Price) {
        super.addHamburgerAddition2(addition2Name, addition2Price);

    }

    @Override
    public void addHamburgerAddition3(String addition3Name, double addition3Price) {
        super.addHamburgerAddition3(addition3Name, addition3Price);
    }

    @Override
    public void addHamburgerAddition4(String addition4Name, double addition4Price) {
        super.addHamburgerAddition4(addition4Name, addition4Price);
    }
}
