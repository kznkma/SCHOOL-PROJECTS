import java.util.PriorityQueue;
import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PriorityQueue<String> nicknames = new PriorityQueue<>();

        System.out.println("Please enter the nicknames of four of your classmates:");
        for (int i = 0; i < 4; i++) {
            System.out.print("Nickname " + (i + 1) + ": ");
            nicknames.add(scanner.nextLine());
        }

        System.out.println("Press 'H' to say Hi to each of them.");

        while (!nicknames.isEmpty()) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("H")) {
                String nickname = nicknames.poll();
                if (nickname != null) {
                    System.out.println("Hi " + nickname + "!");
                }
            }
        }

        System.out.println("Done saying hi.");
        scanner.close();
    }
}
