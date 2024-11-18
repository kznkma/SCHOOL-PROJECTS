import java.util.Scanner;

public class SurvivalMode implements GameMode {
    @Override
    public void start() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Starting Survival Mode...");
            Thread.sleep(1000);
            System.out.println("You are stranded on a deserted island.");
            Thread.sleep(1000);
            System.out.println("You need to find food and water to survive.");
            Thread.sleep(1000);
            System.out.println("You see a coconut tree and a stream nearby.");
            Thread.sleep(1000);
            System.out.println("What do you do?");
            Thread.sleep(1000);
            System.out.println("1 - Climb the tree to get coconuts");
            System.out.println("2 - Go to the stream to get water");

            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("You climb the tree and get some coconuts. You survive another day.");
                Thread.sleep(1000);
                System.out.println("You see a boat in the distance. What do you do?");
                Thread.sleep(1000);
                System.out.println("1 - Signal the boat");
                System.out.println("2 - Stay on the island");

                choice = scanner.nextInt();

                if (choice == 1) {
                    System.out.println("You signal the boat and get rescued. You are now safe!");
                } else {
                    System.out.println("You stay on the island and continue to survive. Maybe another boat will come.");
                }
            } else {
                System.out.println("You go to the stream and get some water. You survive another day.");
                Thread.sleep(1000);
                System.out.println("You see a boat in the distance. What do you do?");
                Thread.sleep(1000);
                System.out.println("1 - Signal the boat");
                System.out.println("2 - Stay on the island");

                choice = scanner.nextInt();

                if (choice == 1) {
                    System.out.println("You signal the boat and get rescued. You are now safe!");
                } else {
                    System.out.println("You stay on the island and continue to survive. Maybe another boat will come.");
                }
            }

            System.out.println("The End.");
        } catch (InterruptedException e) {
            System.out.println("An error occurred.");
        }
    }
}
