package week_10.assignment;

public class MyStringBuilder2Test_10_28 {
    public static void main(String[] args) {
        MyStringBuilder2_10_28 s1 = new MyStringBuilder2_10_28("1907");
        MyStringBuilder2_10_28 s2 = new MyStringBuilder2_10_28("Fenerbahce");
        System.out.println("Insert s2 into s1 at index 2 ---------> " + s1.insert(2,s2));
        System.out.println("Reverse s2 ---------------------------> " + s2.reverse());
        MyStringBuilder2_10_28 s3 = s1.insert(2,s2).substring(7);
        System.out.println("Substring of s3 beginning index 10 ---> " + s3);
        System.out.println("S2 to upper case ---------------------> " + s2.toUpperCase());
    }
}
