package week_09.live_class;

public class TestCllass {
    public static void main(String[] args) {

        Student[] students = new Student[3];

        Student student1 = new Student("Oguz", "Han ");
        Student student2 = new Student("Emir", "Uyanık ");
        Student student3 = new Student("Harzem", "Şah ");


        students[0] = student1;
        students[1] = student2;
        students[2] = student3;

        Teacher[] teachers = new Teacher[2];

        Teacher teacher = new Teacher("Ahmet", "Matematik");
        Teacher teacher2 = new Teacher("Mehmet", "İngilizce");

        teachers[0] = teacher;
        teachers[1] = teacher2;

        School school = new School(students, teachers, "XYZ", "MAHMUT");

        school.printStudents();
        school.printTeachers();


    }
}
