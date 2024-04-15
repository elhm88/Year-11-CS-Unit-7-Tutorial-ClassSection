import java.util.*;

public class ClassSection {
    // Properties
    private String subject;
    private int capacity;
    private int yearLevel;
    private ArrayList<Student> students;

    // Constructors
    public ClassSection(String subject, int capacity, int yearLevel) {
        this.subject = subject;
        this.capacity = capacity;
        this.yearLevel = yearLevel;
        students = new ArrayList();
    }

    // Methods
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getYearLevel() {
        return yearLevel;
    }

    public void setYearLevel(int yearLevel) {
        this.yearLevel = yearLevel;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void addStudent(Student a) {
        boolean same = false;

        if (a.getYearLevel() != yearLevel) {
            same = true;
        }

        for (Student student : students) {
            if (student.equals(a)) {
                same = true;
            }
        }

        if (same == false) {
            students.add(a);
        }

    }

    public void removeStudent(Student a) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).equals(a)) {
                students.remove(i);
            }
        }
    }

    public boolean isStudentEnrolled(Student a) {
        boolean same = false;

        for (Student student : students) {
            if (student.equals(a)) {
                same = true;
            }
        }

        return same;
    }

    public String toString() {
        return "ClassSection{subject='" + subject + "', capacity=" + capacity + ", yearLevel=" + yearLevel + ", students=" + getStudents() + "}";
    }
}
