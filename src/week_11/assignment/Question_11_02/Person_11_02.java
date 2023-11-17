package week_11.assignment.Question_11_02;

public class Person_11_02 {
    private String name;
    private String address;
    private String phoneNumber;
    private String eMail;

    public Person_11_02() {
        this("Unknown", "Unknown", "Unknown", "Unknown");
    }

    public Person_11_02(String name, String address, String phoneNumber, String eMail) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.eMail = eMail;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return eMail;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    @Override
    public String toString() {
        return "    _Person_"+
                "\nName : " + name
                + "\nAdress : " + address
                + "\n Phone Number : " + phoneNumber
                + "\nEMail : " + eMail;
    }
}
