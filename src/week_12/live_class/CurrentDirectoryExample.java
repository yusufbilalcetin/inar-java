package week_12.live_class;

public class CurrentDirectoryExample {
    public static void main(String[] args) {
        // Get the current working directory
        String currentDirectory = System.getProperty("user.dir");

        // Print the current working directory
        System.out.println("Current working directory: " + currentDirectory);
    }
}
