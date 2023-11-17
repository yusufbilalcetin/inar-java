package week_11.assignment.Question_11_02;

public class Staff extends Employee {
    private String title;

    public Staff(String name, String address, String phoneNumber, String eMail, String title, int office, String salary) {
        super(name, address, phoneNumber, eMail, office, Double.parseDouble(salary));
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "     _Staff_" +
                "\nName: " + this.getName() +
                "\nAddress: " + this.getAddress() +
                "\nPhone number: " + this.getPhoneNumber() +
                "\nEmail address: " + this.getEmail() +
                "\noffice: " + this.getOffice() +
                "\nsalary: " + this.getSalary() +
                "\nhiredDate: " + this.getDateHired().toString() +
                "\ntitle: " + "'" + title + "'";
    }
}
