package week_09.assignment;

import java.util.Date;

public class Account_09_07 {
    private int Id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    public Account_09_07() {
        this.Id = 0;
        this.balance = 0;
        this.annualInterestRate = 0;
        this.dateCreated = new Date();
    }

    public Account_09_07(int Id, double balance, double annualInterestRate) {
        this.Id = Id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.dateCreated = new Date();
    }
    public Account_09_07(int id, double balance) {
        this.Id = id;
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getMonthlyInterestRate() {
        if (annualInterestRate != 0) {
            return annualInterestRate / 12;
        } else {
            return 0;
        }
    }

    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    public void withdraw(double amount) {
        balance = balance - amount;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public Date getDateCreated() {
        return dateCreated;
    }
}
