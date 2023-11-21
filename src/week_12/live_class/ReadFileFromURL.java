package week_12.live_class;

import java.util.Scanner;

public class ReadFileFromURL {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter a URL: ");
        String URLString = input.next();

        try {
            java.net.URL url = new java.net.URL(URLString);
            int count = 0;
            Scanner inputURL = new Scanner(url.openStream());
            while (inputURL.hasNext()) {
                String line = inputURL.nextLine();
                count += line.length();
            }
            System.out.println("The file size is " + count + " characters");
        } catch (java.net.MalformedURLException ex) {
            System.out.println("Invalid URL");
        } catch (java.io.IOException ex) {
            System.out.println("I/O Errors: no such file");
        }
    }
}
