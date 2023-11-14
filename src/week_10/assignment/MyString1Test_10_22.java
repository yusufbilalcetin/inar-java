package week_10.assignment;

public class MyString1Test_10_22 {
    public static void main(String[] args) {
        char[] name = {'I', 'N', 'A', 'R'};
        MyString1_10_22 myString1 = new MyString1_10_22(name);

        System.out.println(myString1);
        System.out.println(myString1.toLowerCase());
        System.out.println(myString1.substring(0,2));
        MyString1_10_22 myString2 = myString1.substring(0,2);
        System.out.println(myString2.length());
        System.out.println(myString2.equals(myString1));
        System.out.println(myString2.equals(myString2));
        System.out.println(myString1.valueOf(65913));
    }
}
