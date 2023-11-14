package week_10.assignment;

public class MyStringBuilder1_10_27 {
    private StringBuilder str;

    public MyStringBuilder1_10_27(String s) {
        str = new StringBuilder(s);
    }

    public StringBuilder getStr() {
        return str;
    }

    public MyStringBuilder1_10_27 append(MyStringBuilder1_10_27 s) {
        String newStr = str.toString() + s.getStr().toString();
        return new MyStringBuilder1_10_27(newStr);

    }

    public MyStringBuilder1_10_27 append(int i) {
        String newStr = str.toString() + i;
        return new MyStringBuilder1_10_27(newStr);
    }

    public int length() {
        return str.length();
    }

    public char charAt(int index) {
        return str.charAt(index);
    }

    public MyStringBuilder1_10_27 toLowerCase() {
        return new MyStringBuilder1_10_27(str.toString().toLowerCase());
    }

    public MyStringBuilder1_10_27 substring(int begin, int end) {
        String subString = "";
        for (int i = begin; i <= end; i++) {
            subString += str.charAt(i);
        }
        return new MyStringBuilder1_10_27(subString);
    }

    @Override
    public String toString() {
        return str.toString();
    }
}
