package simpleBankingApplication;

import java.util.ArrayList;

import static java.lang.System.exit;

public class Customer {
    private ArrayList<Double> customerTransactionsList = new ArrayList<>();
    private String name;
    //private Double transaction;
    public Customer(String name, double transaction) {
        this.customerTransactionsList = new ArrayList<Double>();
        this.name = name;
        addTransaction(transaction);
    }

    public ArrayList<Double> getCustomerTransactionsList() {
        return customerTransactionsList;
    }

    public String getName() {
        return name;
    }

    public void addTransaction(double transaction) {
        if (transaction<=0.0)
            exit(-1);
        else{
            this.customerTransactionsList.add(transaction);
        }

    }

    public Customer createCustomer(String name, double transaction){
        return new Customer(name, transaction);
    }



}
