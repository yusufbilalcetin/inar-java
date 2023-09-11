package week_05.live_class;

public class ReverseWord {
    public static void main(String[] args) {
        //Hello world
        //olleH dlroW
        String str = "Hello Java";
        String firstWord = "";
        String secondWord = "";
        String output = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                firstWord = str.substring(0, i);
                secondWord = str.substring(i + 1);
                break;
            }
        }
        for (int i = firstWord.length() - 1; i >= 0; i--) {
            output += firstWord.charAt(i);

        }
        output += ' ';

        for (int i = secondWord.length() - 1; i >= 0; i--) {
            output += secondWord.charAt(i);

        }

        System.out.println(output);
    }
}
