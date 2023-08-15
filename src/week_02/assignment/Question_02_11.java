package week_02.assignment;

import java.util.Scanner;

public class Question_02_11 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of years: ");
        int numberOfyears = input.nextInt();

        int currentPopulation = 312032486;
        int numberOfChangeAfterInYears = (365 * 24 * 60 * 60 / 7) + (365 * 24 * 60 * 60 / 45)
                - (365 * 24 * 60 * 60 / 13);

        int totalOfPopulationAfterYears = numberOfChangeAfterInYears * numberOfyears ;

        int currentPopulationAfterYears = currentPopulation + totalOfPopulationAfterYears;

        System.out.println("The population in " + numberOfyears + " years is " + currentPopulationAfterYears);
    }
}
