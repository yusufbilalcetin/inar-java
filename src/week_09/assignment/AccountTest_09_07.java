package week_09.assignment;

import java.util.Date;
import java.util.Scanner;

public class AccountTest_09_07 {
    public static void main(String[] args) {
        Account_09_07 account = new Account_09_07(1122, 20500,4.5/100);

        System.out.println("           Account statement  :             ");
        System.out.println("---------------------------------------------");

        System.out.println("Account  ID   : " + account.getId());
        System.out.println("Date created  : " + account.getDateCreated());
        System.out.println("Balance       : " + account.getBalance());
        System.out.println("Monthly Interest: " + account.getMonthlyInterest());

    }
}
