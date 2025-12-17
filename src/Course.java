public class Course {

    // Fields
    private String courseName;
    private String instructor;
    private Student[] students;

    // Constructor
    public Course(String courseName, String instructor, int size) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.students = new Student[size];
    }

    // Methods
    public void addStudent(Student s, int index) {
        if (index >= 0 && index < students.length) {
            students[index] = s;
        } else {
            System.out.println("Error: invalid index");
        }
    }

    public double courseAverageGPA() {
        double sum = 0;
        int count = 0;

        for (Student s : students) {
            if (s != null) {
                sum += s.getGpa();
                count++;
            }
        }
        return count == 0 ? 0 : sum / count;
    }

    public Student highestCreditStudent() {
        Student best = null;

        for (Student s : students) {
            if (s != null) {
                if (best == null || s.getCredits() > best.getCredits()) {
                    best = s;
                }
            }
        }
        return best;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", instructor='" + instructor + '\'' +
                '}';
    }
}
