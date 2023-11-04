package week_09.assignment;

public class FanTest_09_08 {
    public static void main(String[] args) {
        Fan_09_08 fan1 = new Fan_09_08();
        Fan_09_08 fan2 = new Fan_09_08();

        fan1.setSpeed(fan1.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.turnOn();

        fan2.setRadius(5);
        fan2.turnOff();

        System.out.println(fan1);
        System.out.println("--------------------");
        System.out.println(fan2);

    }
}
