public class Student {

    // Class creates a student object

    // Creates the instance variables

    private String firstName,
            lastName;
    private int grade,
            idNum;
    static int studentNumber;

    // Constructor sets the instance variables using the parameters given
    // Gives the student a unique student number starting at zero
    // Student number increases by one for every new student

    public Student(String firstName, String lastName, int grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        idNum = studentNumber;
        studentNumber++;
    }

    // Prints the return value when object is printed

    public String toString() {
        return "Name: " + firstName + " " + lastName + " Grade: " + grade;
    }

    // Getters and setters

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getIdNum() {
        return idNum;
    }

    public void setIdNum(int idNum) {
        this.idNum = idNum;
    }
}