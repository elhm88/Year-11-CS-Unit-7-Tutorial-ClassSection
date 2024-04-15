import javax.swing.text.html.parser.TagElement;

public class Student {
    // Properties
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private int yearLevel;
    private static int studentCount;

    // Constructors
    public Student(String firstName, String lastName, int age, int yearLevel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.yearLevel = yearLevel;
        id = studentCount;
        studentCount++;
    }

    // Methods
    public int getId() {
        return id;
    }

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYearLevel() {
        return yearLevel;
    }

    public void setYearLevel(int yearLevel) {
        this.yearLevel = yearLevel;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public boolean equals(Student student) {
        boolean same = false;

        if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName) && student.getAge() == age && student.yearLevel == yearLevel) {
            same = true;
        }

        return same;
    }

    public String toString() {
        return "Student{id=" + id + ", firstName='" + firstName + "', lastName='" +lastName + "', age=" + age + ", yearLevel=" + yearLevel + "}";
    }

    // "Student{id=77, firstName='Adrian', lastName='Wong', age=17, yearLevel=12}"

}
