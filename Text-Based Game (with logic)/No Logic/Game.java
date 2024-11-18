import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String playerName = scanner.nextLine();

        Player player = new PlayerImpl();
        player.setName(playerName);

        System.out.println("Press 1 or 2 to select your game mode.");
        System.out.println("1 - Story");
        System.out.println("2 - Survival");

        int mode = scanner.nextInt();
        scanner.nextLine();

        GameMode gameMode;
        if (mode == 1) {
            gameMode = new StoryMode();
        } else {
            gameMode = new SurvivalMode();
        }

        System.out.println("Press P to start playing, " + player.getName());
        String start = scanner.nextLine();

        if (start.equalsIgnoreCase("P")) {
            gameMode.start();
        } else {
            System.out.println("Invalid input. Exiting game.");
        }

        scanner.close();
    }
}
