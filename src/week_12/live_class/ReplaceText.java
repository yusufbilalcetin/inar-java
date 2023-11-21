package week_12.live_class;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReplaceText {
    // Main method - the entry point of the program
    public static void main(String[] args) throws FileNotFoundException {
        // Check if the correct number of command line arguments are provided
        if (args.length != 4) {
            // If not, inform the user of the correct usage
            System.out.println("Usage: java ReplaceText sourceFile targetFile oldStr newStr");
            // Exit the program with a status code of 1 indicating an error with input
            System.exit(1);
        }

        // Create a File object for the source file using the first command line argument
        File sourceFile = new File(args[0]);
        // Check if the source file exists
        if (!sourceFile.exists()) {
            // If it doesn't exist, inform the user and exit with a status code of 2
            System.out.println("Source file " + args[0] + " does not exist");
            System.exit(2);
        }

        // Create a File object for the target file using the second command line argument
        File targetFile = new File(args[1]);
        // Check if the target file already exists
        if (targetFile.exists()) {
            // If it exists, inform the user and exit with a status code of 3
            System.out.println("Target file " + args[1] + " already exists");
            System.exit(3);
        }

        // Try-with-resources block to ensure proper closing of resources
        try (
                // Create a Scanner object for reading from the source file
                Scanner input = new Scanner(sourceFile);
                // Create a PrintWriter object for writing to the target file
                PrintWriter output = new PrintWriter(targetFile);
        ) {
            // While the source file has more lines to read
            while (input.hasNext()) {
                // Read a line from the source file
                String s1 = input.nextLine();
                // Replace occurrences of the old string (args[2]) with the new string (args[3])
                String s2 = s1.replaceAll(args[2], args[3]);
                // Write the modified line to the target file
                output.println(s2);
            }
        } // The Scanner and PrintWriter are automatically closed at the end of the try block
    }
}
