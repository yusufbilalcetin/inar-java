package week_03.assignment;

import java.util.Scanner;

public class Question_03_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double random = Math.random();

        System.out.println("Guess the flip of coin ( 0 represents head and 1 represents tail : ");
        int answer = input.nextInt();

        if ( random < 0.5 && answer < 1){
            System.out.println("Your guess is correct");

        }else if (random >= 0.5 && answer == 1) {
            System.out.println("Your guess is correct");

        }else if ( (random < 0.5 && answer == 1) || (random > 0.5 && answer < 1)){
            System.out.println("Your guess is incorrect.");
        }
        else if (answer > 1 || answer < 0 ) {

            System.out.println("Invalid value ");
        }
    }
}