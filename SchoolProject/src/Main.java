public class Main {
    public static void main(String[] args) {
        School school = new School("Timothy Nguyen Secondary School", 100, true);
        for (int i = 0; i < 10; i++) {
            school.addStudent();
        }
        for (int i = 0; i < 3; i++) {
            school.addTeacher();
        }
        school.printStudents();
        school.printTeachers();
        school.delStudent();
        school.delStudent();
        school.delTeacher();
        school.printStudents();
        school.printTeachers();
    }
}