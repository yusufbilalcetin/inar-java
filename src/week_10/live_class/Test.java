package week_10.live_class;

public class Test {
    public static void main(String[] args) {
        String s = "a+b$#c".replaceAll("[$+#]", "NNN");
        System.out.println(s);
    }
}
