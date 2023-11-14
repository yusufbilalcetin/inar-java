package week_10.assignment;

public class MyString2Test_10_23 {
    public static void main(String[] args) {

        MyString2_10_23 myString2 = new MyString2_10_23("ELON MUSK");
        System.out.println(myString2);
        MyString2_10_23 myString1 = new MyString2_10_23("D");
        System.out.println(myString1);
        System.out.println(myString1.getStr().length());
        System.out.println(myString2.valueOf(2>1));
        System.out.println(myString2.valueOf(false));
    }
}
