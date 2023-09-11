package week_05.assignment;

import java.util.Scanner;

public class Question_05_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        input.nextLine();

        double maxScore = 0;
        String maxName = "";
        System.out.println("Enter each student's name and score");
        for (int i = 1; i <= numberOfStudents; i++) {
            System.out.print("Student: " + i);
            System.out.print("\n \t Name: ");
            String name = input.nextLine();
            System.out.print("\t Score: ");
            double score = input.nextDouble();
            input.nextLine();
            if (maxScore < score) {
                maxScore = score;
                maxName = name;
            }

        }
        System.out.println("Student with the highest score: " + maxName);
    }
}