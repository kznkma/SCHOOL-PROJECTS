import java.util.Scanner;

public class StoryMode implements GameMode {
    @Override
    public void start() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Starting Story Mode...");
            Thread.sleep(1000);
            System.out.println("Once upon a time, in a land far, far away...");
            Thread.sleep(1000);
            System.out.println("You are a brave knight on a quest to save the kingdom.");
            Thread.sleep(1000);
            System.out.println("You encounter a dragon! What do you do?");
            Thread.sleep(1000);
            System.out.println("1 - Fight the dragon");
            System.out.println("2 - Run away");

            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("You bravely fight the dragon and win! The kingdom is saved.");
                Thread.sleep(1000);
                System.out.println("You continue your journey and find a treasure chest. What do you do?");
                Thread.sleep(1000);
                System.out.println("1 - Open the chest");
                System.out.println("2 - Ignore the chest");

                choice = scanner.nextInt();

                if (choice == 1) {
                    System.out.println("You open the chest and find a magical sword. You are now the hero of the kingdom!");
                } else {
                    System.out.println("You ignore the chest and continue your journey. You are still a hero, but without the magical sword.");
                }
            } else {
                System.out.println("You run away and the kingdom falls into despair.");
            }

            System.out.println("The End.");
        } catch (InterruptedException e) {
            System.out.println("An error occurred.");
        }
    }
}
