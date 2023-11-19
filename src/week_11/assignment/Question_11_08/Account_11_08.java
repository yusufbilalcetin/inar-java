package week_11.assignment.Question_11_08;

import week_11.assignment.Question_11_03.Transactions;

import java.util.ArrayList;
import java.util.Date;

public class Account_11_08 {
    private int id;
    private double balance;
    private static double annualInterestRate;
    private final Date dateCreated;
    private String name;
    private ArrayList<Transactions> transactions = new ArrayList<>();

    public Account_11_08() {
        dateCreated = new Date();
    }

    public Account_11_08(int id, double balance) {
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
    }

    public Account_11_08(String name, int id, double balance) {
        this.name = name;
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate / 100;
    }

    public static void setAnnualInterestRate(double annualInterestRate) {
        Account_11_08.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate() {
        return (getAnnualInterestRate() / 12);
    }

    public double getMonthlyInterest() {
        return (balance * getMonthlyInterestRate());
    }

    public ArrayList<Transactions> getTransactions() {
        return transactions;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
        Transactions transaction = new Transactions('W', amount, balance, "Withdraw from ATM");
        transactions.add(transaction);
    }

    public void deposit(double amount) {
        this.balance += amount;
        Transactions transaction = new Transactions('D', amount, balance, "Deposit to Bank");
        transactions.add(transaction);
    }

    @Override
    public String toString() {
        return "Name: " + name +
                "\nID: " + id +
                "\nBalance: " + balance;
    }
}
