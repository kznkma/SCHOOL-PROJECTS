import java.util.Scanner;

public class CollegeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select type (E for Employee, F for Faculty, S for Student): ");
        char type = scanner.next().charAt(0);
        scanner.nextLine();
        System.out.println("-----------------");

        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("-----------------");

        System.out.println("Enter contact number: ");
        String contactNum = scanner.nextLine();
        System.out.println("-----------------");

        if (type == 'E') {
            Employee employee = new Employee();
            employee.setName(name);
            employee.setContactNum(contactNum);

            System.out.println("Enter salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("-----------------");

            System.out.println("Enter department: ");
            String department = scanner.nextLine();
            System.out.println("-----------------");

            employee.setSalary(salary);
            employee.setDepartment(department);

            System.out.println("Employee Information:");
            System.out.println("Name: " + employee.getName());
            System.out.println("Contact Number: " + employee.getContactNum());
            System.out.println("Salary: " + employee.getSalary());
            System.out.println("Department: " + employee.getDepartment());

        } else if (type == 'F') {
            Faculty faculty = new Faculty();
            faculty.setName(name);
            faculty.setContactNum(contactNum);

            System.out.println("Enter salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("-----------------");

            System.out.println("Enter department: ");
            String department = scanner.nextLine();
            System.out.println("-----------------");

            System.out.println("Is the faculty member regular/tenured? (Y/N): ");
            char isRegular = scanner.next().charAt(0);
            System.out.println("-----------------");

            faculty.setSalary(salary);
            faculty.setDepartment(department);
            faculty.setStatus(isRegular == 'Y');

            System.out.println("Faculty Information:");
            System.out.println("Name: " + faculty.getName());
            System.out.println("Contact Number: " + faculty.getContactNum());
            System.out.println("Salary: " + faculty.getSalary());
            System.out.println("Department: " + faculty.getDepartment());
            System.out.println("Regular/Tenured: " + (faculty.isRegular() ? "Yes" : "No"));

        } else if (type == 'S') {
            Student student = new Student();
            student.setName(name);
            student.setContactNum(contactNum);

            System.out.println("Enter program: ");
            String program = scanner.nextLine();
            System.out.println("-----------------");

            System.out.println("Enter year level: ");
            int yearLevel = scanner.nextInt();
            System.out.println("-----------------");

            student.setProgram(program);
            student.setYearLevel(yearLevel);

            System.out.println("Student Information:");
            System.out.println("Name: " + student.getName());
            System.out.println("Contact Number: " + student.getContactNum());
            System.out.println("Program: " + student.getProgram());
            System.out.println("Year Level: " + student.getYearLevel());
        } else {
            System.out.println("Invalid selection.");
        }

        scanner.close();
    }
}
