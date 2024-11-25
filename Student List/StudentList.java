import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> students = new HashMap<>();

        for (int i = 1; i <= 3; i++) {
            System.out.println("Enter student number for classmate " + i + ":");
            String studentNumber = scanner.nextLine();
            System.out.println("Enter first name for classmate " + i + ":");
            String firstName = scanner.nextLine();
            students.put(studentNumber, firstName);
        }

        System.out.println("Current entries in the map:");
        for (Map.Entry<String, String> entry : students.entrySet()) {
            System.out.println("Student Number: " + entry.getKey() + ", First Name: " + entry.getValue());
        }

        String thirdKey = (String) students.keySet().toArray()[2];
        students.remove(thirdKey);

        System.out.println("Enter your student number:");
        String myStudentNumber = scanner.nextLine();
        System.out.println("Enter your first name:");
        String myFirstName = scanner.nextLine();
        students.put(myStudentNumber, myFirstName);

        System.out.println("Updated entries in the map:");
        for (Map.Entry<String, String> entry : students.entrySet()) {
            System.out.println("Student Number: " + entry.getKey() + ", First Name: " + entry.getValue());
        }

        scanner.close();
    }
}
