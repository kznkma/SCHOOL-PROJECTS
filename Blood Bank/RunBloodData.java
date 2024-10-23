import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RunBloodData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> validBloodTypes = Arrays.asList("A", "B", "AB", "O");
        List<String> validRhesusFactors = Arrays.asList("+", "-");

        String bloodType = "";
        String rhesusFactor = "";

        while (true) {
            System.out.print("Enter blood type of patient: ");
            bloodType = scanner.nextLine().trim().toUpperCase();
            if (bloodType.isEmpty()) {
                bloodType = "O";
                rhesusFactor = "+";
                System.out.println("\n" + bloodType + rhesusFactor + " is added to the blood bank!");
                return;
            } else if (validBloodTypes.contains(bloodType)) {
                break;
            } else {
                System.out.println("Invalid blood type. Please enter a valid blood type (A, B, AB, O).");
            }
        }

        while (true) {
            System.out.print("Enter the Rhesus factor (+ or -): ");
            rhesusFactor = scanner.nextLine().trim();
            if (rhesusFactor.isEmpty()) {
                rhesusFactor = "+";
                break;
            } else if (validRhesusFactors.contains(rhesusFactor)) {
                break;
            } else {
                System.out.println("Invalid Rhesus factor. Please enter a valid Rhesus factor (+ or -).");
            }
        }

        System.out.println("\n" + bloodType + rhesusFactor + " is added to the blood bank!");
    }
}
