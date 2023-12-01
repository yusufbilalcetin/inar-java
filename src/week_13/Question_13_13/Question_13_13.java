package week_13.Question_13_13;

public class Question_13_13 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Course course1 = new Course("Inar Academy");
        System.out.println("Course Name: " + course1.toString());

        course1.addStudents("Burak");
        course1.addStudents("Emre");
        course1.addStudents("Furkan");
        course1.addStudents("Jack");

        Course course2 = course1.clone();
        course2.addStudents("Jonny");
        course2.addStudents("Tonny");

        System.out.println("\nNumber of students in course1 :" + course1.getNumberOfStudents());
        String[] students1 = course1.getStudents();
        for (int i = 0; i < course1.getNumberOfStudents(); i++) {
            System.out.print(students1[i] + ", ");
        }

        System.out.println("\n---------------------------------------");

        System.out.println("Number of students in course2 :" + course2.getNumberOfStudents());
        String[] students2 = course2.getStudents();
        for (int i = 0; i < course2.getNumberOfStudents(); i++) {
            System.out.print(students2[i] + ", ");
        }
    }
}
