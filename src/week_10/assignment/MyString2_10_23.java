package week_10.assignment;

public class MyString2_10_23 {
    private String str;

    public MyString2_10_23(String s) {
        str = s;
    }

    public String getStr() {
        return str;
    }

    public int compare(String s) {
        for (int i = 0; i < str.length() && i < s.length(); i++) {
            if (str.charAt(i) != s.charAt(i)) {
                return str.charAt(i) - s.charAt(i);
            }
        }
        return str.length() - s.length();
    }

    public MyString2_10_23 substring(int begin) {
        String subString = "";
        for (int i = begin; i < str.length(); i++) {
            subString += str.charAt(i);
        }
        return new MyString2_10_23(subString);
    }

    public MyString2_10_23 toUpperCase() {
        String upperCase = "";
        for (int i = 0; i < str.length(); i++) {
            upperCase += Character.toUpperCase(str.charAt(i));
        }
        return new MyString2_10_23(upperCase);
    }

    public char[] toChars() {
        char[] chars = new char[str.length()];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = str.charAt(i);
        }
        return chars;
    }

    public static MyString2_10_23 valueOf(boolean b) {
        return new MyString2_10_23(b + "");
    }

    @Override
    public String toString() {
        String output = "";
        for (int i = 0; i < str.length(); i++) {
            output += str.charAt(i);
        }
        return output;
    }
}
