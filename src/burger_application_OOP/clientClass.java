package burger_application_OOP;

public class clientClass {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("basic", "chicken", 3.50, "white");
        hamburger.addHamburgerAddition1("cheese", 0.50);
        hamburger.addHamburgerAddition2("tomato", 0.51);
        System.out.println(hamburger.itemizeHamburger());
        DeluxeBurger db = new DeluxeBurger();
    }
}
