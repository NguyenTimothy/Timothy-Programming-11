import java.util.ArrayList;

public class School {

    // Class creates a school object that comprises of teacher and student objects

    // Creates the instance variables

    private String name;
    private int totalCourses;
    private boolean publicSchool; // True if school is public, false otherwise

    // Constructor sets the instance variables using the parameters given

    public School(String name, int totalCourses, boolean publicSchool) {
        this.name = name;
        this.totalCourses = totalCourses;
        this.publicSchool = publicSchool;
    }

    // Creates an ArrayList of teachers, students, and courses

    ArrayList<Teacher> teachers = new ArrayList<>();
    ArrayList<Student> students = new ArrayList<>();
    ArrayList<String> courses = new ArrayList<>();

    // The next three methods with the prefix 'add' adds a new element to their respective ArrayLists.

    public void addTeacher() {
        teachers.add(new Teacher());
    }

    public void addStudent() {
        students.add(new Student());
    }

    public void addCourse(String course) {
        // Elements in courses list cannot exceed totalCourses
        // totalCourses must be increased if limit is reached and you want to add a new course
        if (courses.size() < totalCourses) {
            courses.add(course);
        }
    }

    // The next three methods with the prefix 'del' deletes the last element in their respective ArrayLists

    public void delTeacher() {
        teachers.remove(teachers.size() - 1);
    }

    public void delStudent() {
        students.remove(students.size() - 1);
    }

    public void delCourse() {
        courses.remove(courses.size() - 1);
    }

    // The next three methods with the prefix 'print' prints out all the elements in their respective ArrayLists

    public void printTeachers() {
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
    }

    public void printStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void printCourses() {
        for (String course : courses) {
            System.out.println(course);
        }
    }

    // Getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalCourses() {
        return totalCourses;
    }

    public void setTotalCourses(int totalCourses) {
        this.totalCourses = totalCourses;
    }

    public boolean isPublicSchool() {
        return publicSchool;
    }

    public void setPublicSchool(boolean publicSchool) {
        this.publicSchool = publicSchool;
    }
}