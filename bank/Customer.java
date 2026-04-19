package bank;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String customerName;
    private long phoneNo;
    private long adhadrNo;
    private List<Account> newAccountList = new ArrayList<>();

    public Customer(String customerName,long phoneNo,long adhadrNo){
        this.adhadrNo=adhadrNo;
        this.customerName=customerName;
        this.phoneNo=phoneNo;

    }
    public String getCustomerName(){
        return customerName;
    }
    public long getPhoneNo(){
        return phoneNo;
    }
    public long getAdhadrNo(){
        return adhadrNo;
    }

    public List<Account> getNewAccountList() {
        return newAccountList;
    }

    public void addAccount(Account account) {
        newAccountList.add(account);
    }


    @Override
    public String toString() {
        return "Customer Name:" + customerName ;
    }
//    String customerName="pramatha";
//
}
