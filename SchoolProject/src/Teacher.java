public class Teacher {

    // Class creates a teacher object

    // Creates the instance variables

    private String firstName,
            lastName,
            subject;

    // Class uses default constructor

    // Prints the return value when object is printed

    public String toString() {
        return "Name: " + firstName + " " + lastName + " Subject: " + subject;
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}