import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BirthMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> group1 = new HashSet<>();
        Set<String> group2 = new HashSet<>();
        Set<String> self = new HashSet<>();

        System.out.print("Enter your birth month: ");
        String myBirthMonth = scanner.nextLine();
        self.add(myBirthMonth);

        for (int i = 1; i <= 6; i++) {
            System.out.print("Enter birth month of classmate " + i + ": ");
            String birthMonth = scanner.nextLine();
            if (i <= 3) {
                group1.add(birthMonth);
            } else {
                group2.add(birthMonth);
            }
        }

        System.out.println("Group 1 birth months: " + group1);
        System.out.println("Group 2 birth months: " + group2);

        Set<String> union = new HashSet<>(group1);
        union.addAll(group2);
        System.out.println("Union of both groups: " + union);

        Set<String> intersection = new HashSet<>(group1);
        intersection.retainAll(group2);
        System.out.println("Intersection of both groups: " + intersection);

        Set<String> difference = new HashSet<>(group1);
        difference.removeAll(group2);
        System.out.println("Difference of group1 from group2: " + difference);

        if (group1.contains(myBirthMonth) || group2.contains(myBirthMonth)) {
            System.out.println("You have the same birth month with one of your classmates.");
        } else {
            System.out.println("You do not have the same birth month with any of your classmates.");
        }

        scanner.close();
    }
}
