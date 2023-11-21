package week_12.live_class;

import java.util.ArrayList;
import java.util.Scanner;

public class WebCrawler {
    // Main method - Entry point of the program
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a URL
        System.out.print("Enter a URL: ");
        String url = input.nextLine();

        // Start crawling from the provided URL
        crawler(url);
    }


    // crawler method that takes a starting URL and performs web crawling
    public static void crawler(String startingURL) {
        // List to keep track of URLs that are yet to be visited
        // ArrayList<String> listOfPendingURLs = new ArrayList<>();

        // List to keep track of URLs that have been visited
        ArrayList<String> listOfTraversedURLs = new ArrayList<>();

        // Add starting URL to the list of pending URLs
        ArrayList<String> listOfPendingURLs = new ArrayList<>();
        listOfPendingURLs.add(startingURL);

        // Continue crawling until there are no more pending URLs or until we have traversed 100 URLs
        while (!listOfPendingURLs.isEmpty() && listOfTraversedURLs.size() <= 100) {
            // Remove the first URL from the list of pending URLs to process it
            String urlString = listOfPendingURLs.remove(0);

            // Check if the URL has not been traversed already
            if (!listOfTraversedURLs.contains(urlString)) {
                // Add the URL to the list of traversed URLs
                listOfTraversedURLs.add(urlString);

                // Print the URL that is currently being crawled
                System.out.println("Craw " + urlString);

                // For each sub-URL found on the current page
                for (String s : getSubURLs(urlString)) {
                    // Check if the sub-URL has not been traversed
                    if (!listOfTraversedURLs.contains(s))
                        // Add the sub-URL to the list of pending URLs
                        listOfPendingURLs.add(s);
                }
            }
        }
    }


    // getSubURLs method takes a URL as input and returns a list of sub-URLs found on that page
    public static ArrayList<String> getSubURLs(String urlString) {
        // List to store the sub-URLs
        ArrayList<String> list = new ArrayList<>();

        try {
            // Create a URL object from the urlString
            java.net.URL url = new java.net.URL(urlString);

            // Open a Scanner to read from the URL's stream
            Scanner input = new Scanner(url.openStream());

            // Variable to keep track of the current position in the line
            int current = 0;

            // While there is more content to read from the stream
            while (input.hasNext()) {
                // Read the next line from the stream
                String line = input.nextLine();

                // Search for the next occurrence of "http:" in the line
                current = line.indexOf("http:", current);

                // While there is another URL in the line
                while (current > 0) {
                    // Find the end of the URL (indicated by the closing quote)
                    int endIndex = line.indexOf("\"", current);

                    // Check if a valid end index is found
                    if (endIndex > 0) {
                        // Extract the URL and add it to the list
                        list.add(line.substring(current, endIndex));

                        // Move to the next occurrence of "http:"
                        current = line.indexOf("http:", endIndex);
                    } else
                        current = -1; // No more URLs in this line
                }
            }
        } catch (Exception ex) {
            // If an error occurs (e.g., MalformedURLException, IOException), print the error message
            System.out.println("Error: " + ex.getMessage());
        }
        return list; // Return the list of sub-URLs
    }
    // End of the WebCrawler class
    //URLs in HTML are often enclosed in quotes as part of an attribute, like href="http://example.com".
}
