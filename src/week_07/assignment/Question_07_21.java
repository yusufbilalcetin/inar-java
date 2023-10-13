package week_07.assignment;

import java.util.Scanner;

public class Question_07_21 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of balls: ");
        int numberOfBalls = input.nextInt();
        System.out.println("Please enter the number of slots: ");
        int numberOfSlots = input.nextInt();


        String[] droppings = new String[numberOfBalls];

        for (int i = 0; i < numberOfBalls; i++) {
            droppings[i] = dropTheBall(numberOfSlots);
            System.out.println(droppings[i]);
        }

        int[] slotArray = fillTheSlots(droppings, numberOfSlots);

        drawTheMachine(numberOfBalls, slotArray);

    }

    private static int[] fillTheSlots(String[] droppings, int numberOfSlots) {
        int[] slotArray = new int[numberOfSlots];
        for (int i = 0; i < droppings.length; i++) {
            int index = 0;
            for (int j = 0; j < droppings[i].length(); j++) {
                if (droppings[i].charAt(j) == 'R') {
                    index++;
                }
            }
            slotArray[index]++;
        }
        return slotArray;
    }

    private static String dropTheBall(int numberOfSlots) {
        String dropping = "";
        for (int i = 0; i < numberOfSlots - 1; i++) {
            int random = (int) (Math.random() * 2);
            if (random == 0) {
                dropping += "R";
            } else {
                dropping += "L";
            }
        }
        return dropping;
    }

    // {1 , 0 , 4 , 3, 2 , 1 , 0}
    public static void drawTheMachine(int numberOfBalls, int[] slotArray) {
        for (int i = numberOfBalls; i > 0; i--) {
            for (int j = 0; j < slotArray.length; j++) {
                if (slotArray[j] >= i) {
                    System.out.print("O");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }

    }

}



