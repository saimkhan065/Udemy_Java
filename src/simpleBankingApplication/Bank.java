package simpleBankingApplication;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Branch> branchList = new ArrayList<>();
    private String name;
    private double transaction;

    public Bank(String name, double transaction){
        this.name = name;
        this.transaction = transaction;
        this.branchList = new ArrayList<Branch>();
    }

    public double getTransaction() {
        return transaction;
    }

    public ArrayList<Branch> getBranchList() {
        return branchList;
    }

    public String getName() {
        return name;
    }

    public void addBranch(String name, double transaction){
        branchList.add(new Branch(name, transaction));
    }

    public void printAllCustomers(){
        for (int i = 0 ; i < branchList.size() ; i++)
            System.out.println(branchList.get(i));
    }

}
