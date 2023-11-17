package week_11.assignment.Question_11_02;

public class Student extends Person {
    private int status;

    public static final int FRESHMAN = 1;
    public static final int JUNIOR = 2;
    public static final int SOPHPMORE = 3;
    public static final int SENIOR = 4;

    public Student(String name, String address, String phoneNumber, String eMail, int status) {
        super(name, address, phoneNumber, eMail);
        this.status = status;
    }

    public String getStatus() {
        switch (status) {
            case 1:
                return "Freshman";
            case 2:
                return "Junior";
            case 3:
                return "Sophomore";
            case 4:
                return "Senior";
            default:
                return "Unknown";
        }
    }

    @Override
    public String toString() {
        return "     _Student_" +
                "\nName: " + this.getName() +
                "\nAddress: " + this.getAddress() +
                "\nPhone number: " + this.getPhoneNumber() +
                "\nEmail address: " + this.getEmail() +
                "\nclassStatus: " + status;
    }
}
