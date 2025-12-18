public class Main {

    public static void main(String[] args) {

        // Create Students (Craeted by Chat GPT)
        Student s1 = new Student("Ali Khan", "S001", "CS");
        Student s2 = new Student("Dana Lee", "S002", "Math");
        Student s3 = new Student("John Smith", "S003", "Physics");
        Student s4 = new Student("Maria Ivanova", "S004", "Engineering");
        Student s5 = new Student("Chen Wei", "S005", "CS");

        // Methods
        s1.updateGPA(3.8);
        s1.addCredits(90);
        s2.updateGPA(3.2);
        s2.addCredits(75);
        s3.updateGPA(3.9);
        s3.addCredits(110);
        s4.updateGPA(2.9);
        s4.addCredits(60);
        s5.updateGPA(3.6);
        s5.addCredits(95);

        Student[] students = { s1, s2, s3, s4, s5 };

        // Output Students
        for (Student s : students) {
            System.out.println(s.toString());
        }

        // Data Proccessing Tasks
        Course course = new Course("Object Oriented Programming", "Aidana Aidynkyzy", 5);
        for (int i = 0; i < students.length; i++) {
            course.addStudent(students[i], i);
        }

        System.out.println("\nAverage GPA: " + course.courseAverageGPA());
        System.out.println("Highest credit student: " + course.highestCreditStudent());

        System.out.println("\nTop GPA student: " + getTopStudent(students));
        System.out.println("Honors students: " + countHonors(students));
        System.out.println("Total credits: " + totalCredits(students));
    }

    // Part 2 Methods
    public static Student getTopStudent(Student[] arr) {
        Student top = arr[0];
        for (Student s : arr) {
            if (s.getGpa() > top.getGpa()) {
                top = s;
            }
        }
        return top;
    }

    public static int countHonors(Student[] arr) {
        int count = 0;
        for (Student s : arr) {
            if (s.isHonors()) {
                count++;
            }
        }
        return count;
    }

    public static int totalCredits(Student[] arr) {
        int sum = 0;
        for (Student s : arr) {
            sum += s.getCredits();
        }
        return sum;
    }
}
