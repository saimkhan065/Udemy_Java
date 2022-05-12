package burger_application_OOP;

public class Hamburger {
    private String name= "demo-name";
    private String meat = "demo-meat";
    private double price = 0.0;
    private String breadRollType = "demo-breadroll";
    private String addition1Name = "demo-addition-1";
    private String addition2Name = "demo-addition-2";
    private String addition3Name = "demo-addition-3";
    private String addition4Name = "demo-addition-4";
    private double addition1Price = 0.0;
    private double addition2Price = 0.0;
    private double addition3Price = 0.0;
    private double addition4Price = 0.0;

    public Hamburger(){
        System.out.println("default constructor");
    }


    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setBreadRollType(String breadRollType) {
        this.breadRollType = breadRollType;
    }

    public void addHamburgerAddition1(String addition1Name,double addition1Price ){
        this.addition1Name = addition1Name;
        this.addition1Price = addition1Price;

    }

    public void addHamburgerAddition2(String addition2Name,double addition2Price ){
        this.addition2Name = addition2Name;
        this.addition2Price = addition2Price;

    }

    public void addHamburgerAddition3(String addition3Name,double addition3Price ){
        this.addition3Name = addition3Name;
        this.addition3Price = addition3Price;

    }

    public void addHamburgerAddition4(String addition4Name,double addition4Price ){
        this.addition4Name = addition4Name;
        this.addition4Price = addition4Price;

    }

    public double itemizeHamburger(){
        System.out.println("Burger Items: "+ name + " "+ meat+" "+" " + breadRollType+ " Price : "+ price);
        if (addition1Price!=0.0)
            System.out.println("Added "+ addition1Name + " for extra "+ addition1Price);
        if (addition2Price!=0.0)
            System.out.println("Added "+ addition2Name + " for extra "+ addition2Price);
        if (addition3Price!=0.0)
            System.out.println("Added "+ addition3Name + " for extra "+ addition3Price);
        if (addition4Price!=0.0)
            System.out.println("Added "+ addition4Name + " for extra "+ addition4Price);
        return addition1Price + addition2Price +addition3Price + addition4Price + price;

    }
}
