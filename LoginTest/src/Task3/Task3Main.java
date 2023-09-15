package Task3;

import java.util.ArrayList;

public class Task3Main {
    public static void main(String[] args) {


        Account mateoAcc = new Account("Mateo", 12345678, 503422, 500.00);
        Account kleoAcc = new Account("Kleo", 24681359, 766349, 500.00);
        Account johnAcc = new Account("John", 97642513, 135846);

        Bank bank = new Bank("Natwest", "343 Bank Street, Bank, London, NC1 2ST");
        bank.addAccount(mateoAcc);
        bank.addAccount(kleoAcc);
        bank.addAccount(johnAcc);

        System.out.println("These accounts have been added: " + mateoAcc.getName() + ", " + kleoAcc.getName() + ", " + johnAcc.getName());
        bank.removeAccount(johnAcc);
        System.out.println("These accounts have been removed: " + johnAcc.getName());

        ArrayList<Account> accounts = bank.getAccounts();
        for (int i = 0; i < accounts.size(); i++) {
            Account account = accounts.get(i);
            System.out.println("These are the current accounts: " + account.getName());
        }

        mateoAcc.depositMoney(500.00);
        kleoAcc.depositMoney(1000.00);
        mateoAcc.withdrawMoney(100.00);
        kleoAcc.withdrawMoney(200);

        System.out.println("Hi Mateo, your current balance is: " + mateoAcc.getBalance());
        System.out.println("Hi Kleo, your current balance is: " + kleoAcc.getBalance());

    }

}

//        Write a Java program to create a class called "Bank" with a collection of accounts and methods to add and remove accounts,
//        and to deposit and withdraw money. Also define a class called "Account" to maintain account details of a particular customer.