package week_10.assignment;

public class MyIntegerTest_10_03 {
    public static void main(String[] args) {
        MyInteger_10_03 myInteger = new MyInteger_10_03(416114161);
        System.out.println("getValue() : " + myInteger.getValue());
        System.out.println("isEven()   : " + myInteger.isEven());
        System.out.println("isOdd()    : " + myInteger.isOdd());
        System.out.println("isPrime()  : " + myInteger.isPrime());
        System.out.println("equals()   : " + myInteger.equals(10));
        System.out.println("------------------------------------------------------------");
        System.out.println("equals(MyInteger(41614161)) : " + myInteger.equals(new MyInteger_10_03(41614161)));
        System.out.println("isEvent(41614161): " + MyInteger_10_03.isEven(41614161));
        System.out.println("isOdd(41614161)  : " + MyInteger_10_03.isOdd(41614161));
        System.out.println("isPrime(41614161): " + MyInteger_10_03.isPrime(41614161));
        System.out.println("--------------------------------------------------------------");
        System.out.println("parseInt(char[]{1,2,3}) static : " + MyInteger_10_03.parseInt(new char[]{'1', '2', '3'}));
        System.out.println("parseInt(String 123)    static : " + MyInteger_10_03.parseInt("123"));
    }
}
