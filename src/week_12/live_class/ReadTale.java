package week_12.live_class;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReadTale {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File(System.getProperty("user.dir") + "/src/exceptions_fileio/xyz.txt");
        System.out.println(file.getParent());
        File tempFile = new File(file.getParent() + "/temp.txt");

        PrintWriter output = new PrintWriter(tempFile);

        Scanner input = new Scanner(file);

        while (input.hasNext()) {

            String line = input.nextLine();
            line = line.replaceAll("was", "is");
            output.println(line + " ");

        }
        output.close();
    }
}
