package Task3;

public class Account {

    private String name;
    private int accountNumber;
    private int sortCode;
    private double balance;

    public Account(String name, int accountNumber, int sortCode, double amount) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.sortCode = sortCode;
        this.balance = amount;
    }

    public Account(String name, int accountNumber, int sortCode) {
        this.balance = 0;
        this.name = name;
        this.accountNumber = accountNumber;
        this.sortCode = sortCode;
    }

    public String getName(){
        return name;
    }

    public void depositMoney(double balance) {
        this.balance += balance;
    }
    public void withdrawMoney(double balance) {
        this.balance -= balance;
    }
    public double getBalance() {
        return balance;
    }

}
