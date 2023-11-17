package week_11.assignment.Question_11_05;

public class CourseTest {
    public static void main(String[] args) {

        Course course = new Course("Inar Academy");
        course.addStudent("Nisanur AltunTaş");
        course.addStudent("Gürkan serteser");
        course.addStudent("Sinan Çetin");
        course.addStudent("Mehmet Toprak");
        course.addStudent("Sefa \nAtakul");
        course.addStudent("Musa Deniz");
        course.addStudent("Berkan Eriş");
        System.out.println("After adding students to the course...");
        System.out.println(course.getStudents().toString());
        System.out.println("Number of students: " + course.getNumberOfStudents());
        System.out.println("----------------------------------------------------");
        course.dropStudent("Sinan Çetin");
        course.dropStudent("Musa Deniz");
        course.dropStudent("Berkan Eriş");
        System.out.println("After adding students to the course...");
        System.out.println(course.getStudents().toString());
        System.out.println("Number of students: " + course.getNumberOfStudents());
    }
}
