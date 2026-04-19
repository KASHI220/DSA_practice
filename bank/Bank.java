package bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String bankName;
    private String address;
    private String ifsc;

    private List<Customer> customers = new ArrayList<>();

    public Bank(String bankName, String address, String ifsc) {
        this.bankName = bankName;
        this.address = bankName;
        this.ifsc = ifsc;
        // this.accountList = accountList;
    }

    public String getBankName() {
        return bankName;
    }

    public String getAddress() {
        return address;
    }

    public String getIfsc() {
        return ifsc;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void addCustomer(Customer account) {
        customers.add(account);
    }

    public Account searchAccount(int id) {
        //  boolean found = false;
        Account account = null;
        for (Customer customer : customers) {
            for (Account acc : customer.getNewAccountList()) {
                if (id == acc.getAccountNum()) {
                    //  found = true;
                    account = acc;

                }
            }
        }
        return account;
        //if (!found) System.out.println("not found");
    }

//    public Account searchAccount(int id) {
//        //  boolean found = false;
//        Account acc = null;
//        for (int i = 0; i < accountList.size(); i++) {
//            if (id == accountList.get(i).getAccountNum()) {
//                //  found = true;
//                acc = accountList.get(i);
//
//            }
//
//        }
//        return acc;
//        //if (!found) System.out.println("not found");
//    }

//    public int checkBalance(int accountNum) {
//        int balance = -1;
//        for (Account acc : accountList) {
//
//            if (acc.getAccountNum() == accountNum) {
//                balance = acc.getAmount();
//            }
//        }
//        return balance;
//    }

//    public void moneyTransfer(int senderAccNo, int receiverAccNo, int amount) {
//        if (amount > 10000) {
//            System.out.println("Can't tansfer Above 10000rs");
//        } else {
//            Account senderAccount = null;
//            Account receiverAccount = null;
//            int beforeTransactionAmount1 = 0;
//            int beforeTransactionAmount2 = 0;
//            boolean found = false;
//            boolean found1 = false;
//            for (Account acc : accountList) {
//                if (senderAccNo == acc.getAccountNum()) {
//                    senderAccount = acc;
//                    beforeTransactionAmount1 = senderAccount.getAmount();
//                    found = true;
//                }
//                if (receiverAccNo == acc.getAccountNum()) {
//                    receiverAccount = acc;
//                    beforeTransactionAmount2 = receiverAccount.getAmount();
//                    found1 = true;
//                }
//            }
//            if (!found) {
//                System.out.println("Sender Account not found..!");
//            }
//
//            if (!found1) {
//                System.out.println("receiver Account not found...!");
//            }
//
////        if (amount <= senderAccount.getAmount()) {
//            System.out.println("Transaction initiated");
//            int newSenderBalance = senderAccount.debitMoney(amount);
//            if (senderAccount.getAmount() > amount) {
//                int newReceiverBalance = receiverAccount.creditMoney(amount);
//            }
//
//
//            System.out.println("Before Transaction  " + "'" + senderAccount.getAccountNum() + "'" + " Balance is " + beforeTransactionAmount1);
//            System.out.println("Afterr Transaction  " + "'" + senderAccount.getAccountNum() + "'" + " Balance is " + senderAccount.getAmount());
//            System.out.println("Before Transaction  " + "'" + receiverAccount.getAccountNum() + "'" + " Balance is " + beforeTransactionAmount2);
//            System.out.println("After Transaction  " + "'" + receiverAccount.getAccountNum() + "'" + " Balance is " + receiverAccount.getAmount());
//        }
//    }
}