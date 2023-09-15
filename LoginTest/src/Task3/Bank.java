package Task3;

import java.util.ArrayList;

public class Bank {

    private String name;
    private String address;
    private ArrayList<Account> accounts;

    public Bank(String name, String address) {
        this.name = name;
        this.address = address;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account newAccount) {
        this.accounts.add(newAccount);
    }
    public void removeAccount(Account newAccount) {
        this.accounts.remove(newAccount);
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }
}
