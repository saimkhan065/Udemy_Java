package simpleBankingApplication;

import java.util.ArrayList;

import static java.lang.System.exit;

public class Branch {
    Customer customerClassObject;
    private String name;
    private double transactionBranch;
    private ArrayList<Customer> customerList = new ArrayList<>();

    public Customer getCustomerClassObject() {
        return customerClassObject;
    }

    public Branch(String name, double transactionBranch) {
        this.name = name;
        this.customerList = new ArrayList<Customer>();
        addBranchTransaction(transactionBranch);



    }

    public boolean findCustomer(String name){
        for (int i = 0 ; i < customerList.size(); i++){
            if (customerList.get(i).getName().equals(name))
                return true;
        }
        return false;
    }

    public void addNewCustomer(String name, double transaction){
        if (!findCustomer(name))
            customerList.add(customerClassObject.createCustomer(name, transaction));
    }

    public void additionalTransactionCustomer(String name, double transaction){
        if (findCustomer(name))
            customerList.add(customerClassObject.createCustomer(name, transaction));
        else
            System.out.println("Customer not found !");
    }

    public void addBranchTransaction(double transaction){
        this.transactionBranch = transaction;
    }











}
