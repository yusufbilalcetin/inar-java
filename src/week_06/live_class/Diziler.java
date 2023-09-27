package week_06.live_class;

public class Diziler {
    public static void main(String[] args) {
        String[] arrey = new String[3];
        arrey[0] = "yusuf selam abime";
        arrey[1] = "yusuf selam abim";
        arrey[2] = "yusuf selam abi";
        String str = arrey[0];
        System.out.println(str.length());
        for (int i = 0; i < arrey.length; i++) {
            System.out.println(arrey[i].length() + " harfdir bu cumle -> " + arrey[i]);
        }
    }
}
