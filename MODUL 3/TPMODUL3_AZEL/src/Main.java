import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student name:");
        String studentName = scanner.nextLine();

        int studentID = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.println("Enter student ID:");
                studentID = scanner.nextInt();
                scanner.nextLine(); 
                validInput = true;

            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer for student ID.");
                scanner.nextLine(); 
            }
        }

        System.out.println("Enter courses to enroll in (separated by commas):");
        String courseInput = scanner.nextLine();
        String[] courseEnroll = courseInput.split(", ");

        Student student = new Student(studentName, studentID);
        for (String course : courseEnroll) {
            student.enrollInCourse(course);
        }

        String[][] courses = {
                {"101", "Statistika Industri", "Haris", "Metta"},
                {"102", "Desain Jaringan Komputer", "Windy", "Amilia"}
        };

        for (String[] course : courses) {
            System.out.println("Course ID: " + course[0] + "," +
                    "\nCourse Name: " + course[1] +
                    "\n - Student: " + course[2] +
                    "\n - Student: " + course[3] +
                    "\n");
        }

        System.out.println(student.getUserDetail());

        Teacher teacher = new Teacher("Yoga Raditya", 1202220000);
        teacher.teachClass("Pemodelan Proses Bisnis");

        Admin admin = new Admin("Hudza", 1202220001);
        admin.manageSystem("the university system");

        scanner.close();
    }
}