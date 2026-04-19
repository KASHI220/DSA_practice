package bank;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class BankMain {
    public static void main(String[] args) {
        String bankName = "KVGB";
        String address = "banglore";
        String ifsc = "1Kcq3243";


        // List<Account> accountList = new ArrayList<Account>();
        BankMain bank = new BankMain();
        Bank bankObj = new Bank(bankName, address, ifsc);

        Customer bankCustomer = new Customer("Pramatha", 64569891, 123456789);
        Account acc1 = new Account(12345, 1000);
        bankCustomer.addAccount(acc1);
        Account acc2 = new Account(12346, 11200);
        bankCustomer.addAccount(acc2);
        bankObj.addCustomer(bankCustomer);
        Customer bankCustomer2 = new Customer("king", 789456123, 142536789);
        Account acc3 = new Account(12347, 1250);
        bankCustomer2.addAccount(acc3);
        Account acc4 = new Account(12348, 13000);
        bankCustomer2.addAccount(acc4);

        bankObj.addCustomer(bankCustomer2);
        // CreateAccount acc= new CreateAccount();
//        acc.createAcc(accountList);

//        bankObj.setAccount(accountList);
        System.out.println("Account Details..." + bankObj.getBankName());
        bank.display(bankObj);
        int id = 12345;
//
        Account result = bankObj.searchAccount(id);
        System.out.println(result);
//        int accno=12345;
//        System.out.println();
//        int amount= bankObj.checkBalance(accno);
//        System.out.println("balance :  "+amount);
//        bankObj.moneyTransfer(12345,12346,5005);

        //  bank.highestMoney(bankObj.getAccountList());
//        System.out.println();
//        System.out.println("Highest order...");
//        System.out.println();
//        bank.display(bankObj);
    }


    public void highestMoney(List<Account> accountList) {
        for (int i = 0; i < accountList.size() - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < accountList.size(); j++) {
                if (accountList.get(j).getAmount() > accountList.get(min_index).getAmount()) {
                    min_index = j;
                }
            }
            Account temp = accountList.get(min_index);
            accountList.set(min_index, accountList.get(i));
            accountList.set(i, temp);
        }
    }


    public void display(Bank bankObj) {

        for (Customer customer : bankObj.getCustomers()) {
            System.out.println(customer.getCustomerName());
            for (Account acc : customer.getNewAccountList()) {
                System.out.println(acc);
            }
        }
    }
}

