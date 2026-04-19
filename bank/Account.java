package bank;

public class Account {
    //    private String name;
    private int accountNum;
    private int amount;

    public Account(int accountNum, int amount) {

        this.accountNum = accountNum;
        this.amount = amount;

    }

//    public String getName() {
//        return name;
//    }

    public int getAccountNum() {
        return accountNum;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int newSenderBalance) {
        this.amount = newSenderBalance;
    }

    @Override
    public String toString() {
        return "Account number :  " + accountNum + "  Balance :  " + amount;
    }

    public int creditMoney(int money) {
        return this.amount += money;
    }

    public int debitMoney(int money) {
        int bal = this.amount;
        if (this.amount >= money) bal = this.amount -= money;
        else {
            System.out.println("Your Account Balance is : " + getAmount() + "You can't Transfer " + money);
        }
        return bal;
    }


}
