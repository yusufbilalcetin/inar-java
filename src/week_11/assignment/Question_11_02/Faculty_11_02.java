package week_11.assignment.Question_11_02;

public class Faculty_11_02 extends Employee_11_02 {
    private String officeHours;
    private String rank;

    public Faculty_11_02(String name, String address, String phoneNumber, String eMail, int office, double salary, String officeHours, String rank) {
        super(name, address, phoneNumber, eMail, office, salary);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public String getRank() {
        return rank;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "     _Faculty_" +
                "\nName: " + this.getName() +
                "\nAddress: " + this.getAddress() +
                "\nPhone number: " + this.getPhoneNumber() +
                "\nEmail address: " + this.getEmail() +
                "\noffice: " + this.getOffice() +
                "\nsalary: " + this.getSalary() +
                "\nhiredDate: " + this.getDateHired().toString() +
                "\nofficeHours: " + officeHours +
                "\nrank: " +"'" + rank + "'";
    }
}
