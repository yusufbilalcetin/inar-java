package week_10.assignment;

public class BMI_10_02 {
    private String name;
    private int age;
    private double weight;
    private double height;
    private double feet;
    private double inches;
    public static final double KILOGRAMS_PER_POUNDS = 0.45359237;
    public static final double METERS_PER_INCH = 0.0254;

    public BMI_10_02(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public BMI_10_02(String name, int weight, double height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    public BMI_10_02(String name, int age, double weight, double feet, double inches) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = (feet * 12) + inches;
    }

    public double getBMI() {
        double bmi = weight * KILOGRAMS_PER_POUNDS / ((height * METERS_PER_INCH) * (height * METERS_PER_INCH));
        return Math.round(bmi * 100) / 100.0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getStatus() {
        double bmi = getBMI();
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    @Override
    public String toString() {
        return "Name : " + name + "\n" +
                "BMI : " + getBMI() + " " + getStatus();
    }
}
