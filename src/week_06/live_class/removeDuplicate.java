package week_06.live_class;

public class removeDuplicate {
    public static void main(String[] args) {


        // kelime
        String str = "Programming";
        System.out.println(removeDuplicate(str));
    }

    public static String removeDuplicate(String str) {
        String output = "";

        for (int i = 0; i < str.length(); i++) {
            if (output.indexOf(str.charAt(i) + "") == -1) {
                output += "" + str.charAt(i);
            }
        }
        return output;
    }
}
