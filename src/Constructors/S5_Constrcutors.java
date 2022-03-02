public class S5_Constrcutors {
    private int accountnumber;
    private double balance;
    private String cust_name;
    private String email;
    private String contact;

    public S5_Constrcutors(int accountnumber, double balance, String cust_name, String email, String contact) {
        this.accountnumber = accountnumber;
        this.balance = balance;
        this.cust_name = cust_name;
        this.email = email;
        this.contact = contact;
        System.out.println("Constructor called. Parameters initialized.");
    }

    public int getAccountnumber() {
        return accountnumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCust_name() {
        return cust_name;
    }

    public String getEmail() {
        return email;
    }

    public String getContact() {
        return contact;
    }

    public void setAccountnumber(int accountnumber) {
        this.accountnumber = accountnumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCust_name(String cust_name) {
        this.cust_name = cust_name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void deposit(double deposit){
        this.balance += deposit;
        System.out.println("Amount Deposited ="+ deposit +". Total balance = "+ this.balance);
    }
    public void withdraw(double withdraw){
        this.balance -= withdraw;
        if (this.balance<0)
        System.out.println("Insufficient funds in account.");
        else
            System.out.println("Amount withdrawn ="+ withdraw+". Remaining balance = "+this.balance);
    }
}
