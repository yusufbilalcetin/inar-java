package week_10.live_class;

public class Computer {
    private int ram;

    private String name;

    public Computer(int ram, String name) {

        if (checkRam(ram) && checkName(name)) {
            this.ram = ram;
            this.name = name;


        }

    }


    private boolean checkRam(int ram) {
        return ram % 4 == 0;
    }

    private boolean checkName(String name) {
        name = name.toUpperCase();

        if (!(name.equals("ASUS") || name.equals("HP") || name.equals("LENOVO") || name.equals("MONSTER"))) {
            return false;

        }
        return true;

    }

    public int getRam() {
        return ram;
    }

    public String getName() {
        return name;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "ram=" + ram +
                ", name='" + name + '\'' +
                '}';
    }

}
