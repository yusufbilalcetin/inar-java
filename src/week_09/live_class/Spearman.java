package week_09.live_class;

public class Spearman {
    private int health;
    private final int DAMAGE_FOR_KNIGHT = 10;
    private final int DAMAGE_FOR_ARCHER = 7;

    private final int DAMAGE_FOR_SPEARMAN = 7;

    private String color;

    private static int numberOfSpearman;

    private int experience;

    private boolean isAlive = true;

    public Spearman(String color) {
        this.health = 100;
        this.color = color;
        this.experience = 1;
    }

    public Spearman() {
        this("Red");
    }

    public void attack(Knight knight) {
        knight.takeDamage(DAMAGE_FOR_KNIGHT);
        this.experience++;
    }

    public void attack(Spearman spearman) {
        spearman.takeDamage(DAMAGE_FOR_SPEARMAN);
        this.experience++;
    }

    public void attack(Archer archer) {
        archer.takeDamage(DAMAGE_FOR_ARCHER);
        this.experience++;
    }

    public void takeDamage(int damage) {
        if (this.health > 0) {
            this.health -= damage;
        }
        if (this.health <= 0) {
            this.isAlive = false;
            this.health = 0;
            System.out.println("Spearman is dead");
        }
    }

    public static int getNumberOfSpearman() {
        return numberOfSpearman;
    }

    public boolean isAlive() {
        return this.isAlive;
    }

    @Override
    public String toString() {
        return "Spearman{" +
                "health=" + health +
                ", DAMAGE_FOR_KNIGHT=" + DAMAGE_FOR_KNIGHT +
                ", DAMAGE_FOR_ARCHER=" + DAMAGE_FOR_ARCHER +
                ", DAMAGE_FOR_SPEARMAN=" + DAMAGE_FOR_SPEARMAN +
                ", color='" + color + '\'' +
                ", experience=" + experience +
                ", isAlive=" + isAlive +
                '}';
    }
}
