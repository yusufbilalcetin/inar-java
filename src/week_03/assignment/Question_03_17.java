package week_03.assignment;

import java.util.Scanner;

public class Question_03_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("scissor (0), rock(1), paper(2): ");
        int amount = input.nextInt();

        byte value1 = (byte)(Math.random() * 3);

        if(value1 == 0 || amount == 0){
            System.out.println("the computer is scissor. You are scissor too. it is a draw" );
        }else if(value1 == 0 || amount == 1){
            System.out.println("the computer is scissor. You are rock. You are won");
        }else if(value1 == 0 || amount == 2){
            System.out.println(("the computer is scissor. You are paper. You are lost" ));
        }else if(value1 == 1 || amount == 0){
            System.out.println("the computer is rock. You are rock. You are won");
        }else if(value1 == 1 || amount == 1) {
            System.out.println(("the computer is rock. You are rock too. it is a draw"));
        }else if(value1 == 1 || amount == 2){
            System.out.println("the computer is rock. You are paper. You are won");
        }else if(value1 == 2 || amount == 0){
            System.out.println("the computer is paper. You are scissor You are won");
        }else if(value1 == 2 || amount == 1) {
            System.out.println(("the computer is paper. You are rock . it is a draw"));
        }else if(value1 == 2 || amount == 2) {
            System.out.println("the computer is paper. You are paper too. You are won");
        }else{
            System.out.println("invalid amount");
        }

    }

}
