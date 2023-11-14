package week_10.assignment;

public class MyStringBuilder2_10_28 {
    private StringBuilder str;

    public MyStringBuilder2_10_28() {
        str = new StringBuilder();
    }

    public MyStringBuilder2_10_28(char[] chars) {

        this(String.valueOf(chars));
    }

    public MyStringBuilder2_10_28(String s) {
        str = new StringBuilder(s);
    }

    public StringBuilder getStr() {
        return str;
    }

    public MyStringBuilder2_10_28 insert(int offset, MyStringBuilder2_10_28 s) {
        String newStr = str.substring(0, offset) + s.getStr().toString() + str.substring(offset);
        return new MyStringBuilder2_10_28(newStr);
    }

    public MyStringBuilder2_10_28 reverse() {
        StringBuilder newStr = new StringBuilder();
        for (int i = str.length() - 1; 0 <= i; i--) {
            newStr.append(str.charAt(i));
        }
        return new MyStringBuilder2_10_28(newStr.toString());
    }

    public MyStringBuilder2_10_28 substring(int begin) {
        return new MyStringBuilder2_10_28(str.substring(begin));
    }

    public MyStringBuilder2_10_28 toUpperCase() {
        return new MyStringBuilder2_10_28(str.toString().toUpperCase());
    }

    @Override
    public String toString() {
        return str.toString();
    }
}
