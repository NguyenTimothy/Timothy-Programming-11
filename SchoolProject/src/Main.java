public class Main {
    public static void main(String[] args) {
        School school = new School("Timothy Nguyen Secondary School", 100, true);

        school.addStudent("Michelle", "Thuy", 8);
        school.addStudent("Leslie", "Perez", 12);
        school.addStudent("Dylon", "Walters", 11);
        school.addStudent("Allana", "Tran", 10);
        school.addStudent("Billy", "Kwan", 9);
        school.addStudent("Joe", "Johnson", 12);
        school.addStudent("Justin", "White", 8);
        school.addStudent("Cindy", "Ford", 10);
        school.addStudent("Dylan", "Black", 9);
        school.addStudent("Carly", "Morrison", 11);

        school.addTeacher("David", "Smith", "English");
        school.addTeacher("Bill", "Pham", "Math");
        school.addTeacher("Jessica", "Ingram", "Social Studies");

        school.printStudents();
        System.out.println();
        school.printTeachers();

        school.delStudent();
        school.delStudent();
        school.delTeacher();

        System.out.println();
        school.printStudents();
        System.out.println();
        school.printTeachers();
    }
}
