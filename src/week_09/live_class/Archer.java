package week_09.live_class;

public class Archer {

    private int health ;
    private final int DAMAGE_FOR_KNIGHT = 8;
    private final int DAMAGE_FOR_ARCHER = 5;

    private final int DAMAGE_FOR_SPEARMAN = 3;

    private String color;

    private static int numberOfArcher;

    private int experience;

    private boolean isAlive = true;

    public Archer(String color){
        this.health = 100;
        this.color = color;
        this.experience = 1;
    }

    public Archer(){
        this("Red");
    }

    public void attack(Knight knight){
        knight.takeDamage(DAMAGE_FOR_KNIGHT);
        this.experience++;
    }
    public void attack(Spearman spearman){
        spearman.takeDamage(DAMAGE_FOR_SPEARMAN);
        this.experience++;
    }
    public void attack(Archer archer){
        archer.takeDamage(DAMAGE_FOR_ARCHER);
        this.experience++;
    }
    public void takeDamage(int damage){
        if(!shield()){
            loseHealth(damage);
            System.out.println("Archer is damaged : "   + health);
        }
        else{
            System.out.println("Archer Used Shield, You missed !!!" + health);
        }
    }
    public static int getNumberOfArcher() {
        return numberOfArcher;
    }
    public boolean isAlive(){
        return this.isAlive;
    }
    private void loseHealth(int damage){

        if(this.health > 0){
            this.health -= damage;
        }
        if(this.health <= 0){
            this.isAlive = false;
            this.health = 0;
            System.out.println("Archer is dead");
        }
    }
    private boolean shield(){
        int x = (int)(Math.random()*2);

        if (x == 1){
            return true;
        }
        else{
            return false;
        }


    }

    @Override
    public String toString() {
        return "Archer{" +
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
