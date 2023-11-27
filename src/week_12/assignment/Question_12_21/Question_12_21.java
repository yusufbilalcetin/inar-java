package week_12.assignment.Question_12_21;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Question_12_21 {
    public static void main(String[] args) {
        //C:\Users\Lenovo\Desktop\Yusuf\workspace\inar-java\src\week_12\assignment\Question_12_21\SortedString.txt
        boolean condition = true;
        StringBuilder page = new StringBuilder();
        while (condition) {
            System.out.println("File for checking if it is sorted :");
            Scanner inputFromUser = new Scanner(System.in);
            String pathOfFile = inputFromUser.nextLine();

            File file = new File(pathOfFile);
            if (!file.exists()) {
                System.out.println("File not found check the path !");
                continue;
            }
            try {
                Scanner input = new Scanner(file);
                while (input.hasNext()) {
                    String currentLine = input.nextLine();
                    page.append(currentLine);
                }
                printIfPageIsSorted(page.toString());
                condition = false;
            } catch (FileNotFoundException ex) {
                System.out.println(ex.getMessage());
            }
            if (condition) {
                inputFromUser.nextLine();
            }
        }

    }

    public static void printIfPageIsSorted(String page) {
        String[] words = page.split(",");
        ArrayList<Integer> notSortedWordsIndexes = new ArrayList<>();
        for (int i = 0; i < words.length - 1; i++) {
            String first = words[i].trim();
            String second = words[i + 1].trim();

            if (first.compareTo(second) > 0) {
                notSortedWordsIndexes.add(i);
            }
            if (notSortedWordsIndexes.size() == 2) {
                break;
            }
        }
        if (notSortedWordsIndexes.isEmpty()) {
            System.out.println("The file is sorted!");
        } else {
            System.out.println("The strings " + notSortedWordsIndexes.get(0) + " and " +
                    notSortedWordsIndexes.get(1) + " are out of order");
        }
    }
}
