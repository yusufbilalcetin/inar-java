package week_11.assignment.Question_11_08;

import week_11.assignment.Question_11_03.Account;
import week_11.assignment.Question_11_03.Transactions;

import java.util.ArrayList;

public class Question_11_08 {
    public static void main(String[] args) {
        Account_11_08 account = new Account_11_08("George", 1122, 1000);
        account.deposit(30);
        account.deposit(40);
        account.deposit(50);
        account.deposit(5);
        account.deposit(4);
        account.deposit(2);
        ArrayList<Transactions> transactions = account.getTransactions();
        System.out.println(account + "\n[");
        for (int i = 0; i < transactions.size(); i++) {
            if (i != transactions.size() - 1) {
                System.out.println(transactions.get(i) + "\n,");
            } else{
                System.out.println(transactions.get(i));
            }
        }
        System.out.println("]");
    }
}
