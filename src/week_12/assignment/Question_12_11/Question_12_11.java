package week_12.assignment.Question_12_11;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Question_12_11 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.print("Usage Java Question_12_11 John filename");
            System.exit(1);
        }
        File myFile = new File(args[1]);
        if (!myFile.exists()) {
            System.out.println(args[1] + " does not exits");
            System.exit(2);
        }
        ArrayList<String> myTest = new ArrayList<>();
        try {
            Scanner input = new Scanner(myFile);
            while (input.hasNext()) {
                String s1 = input.nextLine();
                String s2 = s1.replaceAll(args[0], "");
                myTest.add(s2);
            }
            input.close();
            PrintWriter output = new PrintWriter(myFile);
            for (int i = 0; i < myTest.size(); i++) {
                output.println(myTest.get(i));
            }
            output.close();
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
