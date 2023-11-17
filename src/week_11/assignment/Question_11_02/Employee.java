package week_11.assignment.Question_11_02;

import week_10.assignment.MyDate_10_14;

public class Employee extends Person {
    private int office;
    private double salary;

    private MyDate_10_14 dateHired;

    public Employee(String name, String addres, String phoneNumber, String eMail, int office, double salary) {
        super(name, addres, phoneNumber, eMail);
        this.office = office;
        this.salary = salary;
        this.dateHired = new MyDate_10_14();
    }

    public int getOffice() {
        return office;
    }

    public double getSalary() {
        return salary;
    }

    public String getDateHired() {
        return dateHired.getYear() + "." + dateHired.getMonth() + "." + dateHired.getDay();
    }

    public void setOffice(int office) {
        this.office = office;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDateHired() {
        this.dateHired = new MyDate_10_14();
    }

    @Override
    public String toString() {
        return "     _Employee_" +
                "\nName: " + this.getName() +
                "\nAddress: " + this.getAddress() +
                "\nPhone number: " + this.getPhoneNumber() +
                "\nEmail address: " + this.getEmail() +
                "\noffice: " + office +
                "\nsalary: " + salary +
                "\nhiredDate: " + dateHired.toString();
    }
}
