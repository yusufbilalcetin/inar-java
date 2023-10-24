package week_08.assignment;

import java.util.Scanner;

public class Question_08_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of banks: ");
        int numberOfBanks = input.nextInt();
        System.out.println("Enter minimum total assets for keeping a bank safe: ");
        int limit = input.nextInt();
        double[] assetsOfBanks = new double[numberOfBanks];
        double[][] borrowers = new double[numberOfBanks][numberOfBanks];
        int[] unsafeControlArray = new int[numberOfBanks];


        fillTheUnsafeControlArray(unsafeControlArray);
        getBorrowersArray(borrowers, assetsOfBanks);
        findAndDisplayAllTheUnsafeBanks(unsafeControlArray, assetsOfBanks, borrowers, limit);
    }

    public static void findAndDisplayAllTheUnsafeBanks(int[] unsafeControlArray, double[] assetsOfBanks, double[][] borrowers, int limit) {
        boolean isContinue;
        do {
            isContinue = false;
            for (int i = 0; i < assetsOfBanks.length; i++) {
                if (!isSafe(i, assetsOfBanks, borrowers, limit) && unsafeControlArray(i, unsafeControlArray)) {
                    unsafeControlArray[i] = i;
                    fixBorrowers(i, borrowers);
                    isContinue = true;
                }
            }
        } while (isContinue);
        System.out.println("Unsafe banks are: ");
        for (int i = 0; i < borrowers.length; i++) {
            if (!isSafe(i, assetsOfBanks, borrowers, limit)) {
                System.out.print(i + " ");
            }
        }

    }

    private static void fixBorrowers(int i, double[][] borrowers) {
        for (int j = 0; j < borrowers.length; j++) {
            borrowers[j][i] = 0;
        }
    }

    private static boolean unsafeControlArray(int i, int[] unsafeControlArray) {
        return unsafeControlArray[i] == -1 ? true : false;
    }


    private static boolean isSafe(int i, double[] assetsOfBanks, double[][] borrowers, int limit) {
        double assets = assetsOfBanks[i];
        for (int j = 0; j < assetsOfBanks.length; j++) {
            assets += borrowers[i][j];
        }
        return (assets < limit) ? false : true;
    }

    public static void getBorrowersArray(double[][] borrowers, double[] assetsOfBanks) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < borrowers.length; i++) {
            System.out.println("Enter bank " + i + "'s total assets " + "Enter the number of banks that borrowed money " +
                    "from bank " + i + " Enter borrowers ID amount borrowed: ");
            assetsOfBanks[i] = input.nextDouble();
            int numberOfBorrewersFromBank = input.nextInt();
            for (int j = 0; j < numberOfBorrewersFromBank; j++) {
                int bank = input.nextInt();
                borrowers[i][bank] = input.nextDouble();
            }
        }
    }

    public static void fillTheUnsafeControlArray(int[] unsafeControlArray) {
        for (int i = 0; i < unsafeControlArray.length; i++) {
            unsafeControlArray[i] = -1;
        }
    }
}
