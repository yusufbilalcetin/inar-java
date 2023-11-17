package week_11.assignment.Question_11_03;

import week_09.assignment.Account_09_07;

public class AccountTest {
    public static void main(String[] args) {
        Account_09_07 myAccount = new Account_09_07( 10,1000, 2);
        CheckingAccount myCheckingAccount = new CheckingAccount(11, 1450, -500);
        SavingsAccount mySavingAccount = new SavingsAccount(16, 4820);
        System.out.println(myCheckingAccount);
        System.out.println("----------------------------------");
        System.out.println(mySavingAccount);
    }
}
