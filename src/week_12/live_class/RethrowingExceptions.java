package week_12.live_class;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class RethrowingExceptions {
    public static void main(String[] args) {
        try {
            readFile("example.txt");
        } catch (IOException e) {
            System.err.println("Error occurred in main method: " + e.getMessage());
            // Additional handling or termination of the program could occur here
        }
    }


    public static void readFile(String fileName) throws IOException {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(fileName));
            System.out.println("test");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + fileName);
            throw e; // Rethrowing the exception
        }
    }
}
