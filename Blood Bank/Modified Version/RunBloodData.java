import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RunBloodData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> validBloodTypes = Arrays.asList("A", "B", "AB", "O");
        List<String> validRhesusFactors = Arrays.asList("+", "-");

        BloodData bloodData = new BloodData();

        System.out.print("Enter blood type: ");
        String bloodType = scanner.nextLine();
        while (!validBloodTypes.contains(bloodType)) {
            System.out.print("Invalid blood type. Enter again: ");
            bloodType = scanner.nextLine();
        }
        bloodData.setBloodType(bloodType);

        System.out.print("Enter Rhesus factor (+ or -): ");
        String rhFactor = scanner.nextLine();
        while (!validRhesusFactors.contains(rhFactor)) {
            System.out.print("Invalid Rhesus factor. Enter again: ");
            rhFactor = scanner.nextLine();
        }
        bloodData.setRhFactor(rhFactor);

        bloodData.display();
    }
}
