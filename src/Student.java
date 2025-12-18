public class Student {

    // Fields
    private String name;
    private String id;
    private String major;
    private double gpa;
    private int credits;

    // Constructor
    public Student(String name, String id, String major) {
        this.name = name;
        this.id = id;
        this.major = major;
        this.gpa = 0.0;
        this.credits = 0;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getMajor() {
        return major;
    }

    public double getGpa() {
        return gpa;
    }

    public int getCredits() {
        return credits;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    // Methods
    public void addCredits(int c) {
        if (c > 0) {
            credits += c;
        }
    }

    public void updateGPA(double newGPA) {
        if (newGPA >= 0.0 && newGPA <= 4.0) {
            gpa = newGPA;
        }
    }

    public boolean isHonors() {
        return gpa >= 3.5;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", major='" + major + '\'' +
                ", GPA=" + gpa +
                ", credits=" + credits +
                '}';
    }
}
