package week_11.assignment.Question_11_02;

public class PersonTest {
    public static void main(String[] args) {
        Person_11_02 person = new Person_11_02("Gürol", "İstanbul", "9999999999", "gurol@inar.com");
        System.out.println(person.toString() + "\n");

        Student_11_02 student = new Student_11_02("Nafiz", "Ankara", "3333331133", "nafiz@gmail.com", 0);
        System.out.println(student.toString()+ "\n");

        Employee_11_02 employee = new Employee_11_02("Recai", "istanbul", "6666666666", "recai@inar.com", 910, 60000);
        System.out.println(employee.toString()+ "\n");

        Faculty_11_02 faculty = new Faculty_11_02("Serhat", "Texas,Dallas", "4133333333", "serhat@inar.com", 101, 50000.0, "10 am To 6 pm", "manager");
        System.out.println(faculty.toString()+ "\n");

        Staff_11_02 staff = new Staff_11_02("Elon", "California", "20302222220", "elon@musk.com", "CEO", 12, "6005000.0");
        System.out.println(staff.toString()+ "\n");
    }
}

