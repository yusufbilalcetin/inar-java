package week_09.live_class;

public class Arena {
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

    public static void main(String[] args) {


        Knight knight = new Knight("Blue");
        System.out.println(knight.toString());

        Archer archer = new Archer();
        System.out.println(archer.toString());

        knight.attack(archer);

        System.out.println("After attack ****************");
        while (archer.isAlive() && knight.isAlive()) {
            knight.attack(archer);
            System.out.println();
            archer.attack(knight);
        }
        System.out.println("Out of loop");
    }
}
