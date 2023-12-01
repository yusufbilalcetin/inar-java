package week_13.Question_13_13;

public class Course {
    private String courseName;
    private String[] student = new String[100];
    private int numberOfStudent;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        student[numberOfStudent] = student;
        numberOfStudent++;
    }

    public String[] getStudent() {
        return student;
    }

    public int getNumberOfStudent() {
        return numberOfStudent;
    }

    public String getCourseName() {
        return courseName;
    }
}
