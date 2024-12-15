import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Chatbot {
    private static Map<String, String> productAvailability;

    public static void main(String[] args) {
        initializeProductAvailability();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Supermarket Chatbot!");
        System.out.println("How can I assist you today? (Type 'help' for a list of commands)");

        while (true) {
            System.out.print("\nYou: ");
            String input = scanner.nextLine().toLowerCase().trim();

            System.out.print("Chatbot: ");
            if (input.equals("help")) {
                displayHelp();
            } else if (input.equals("hello") || input.equals("hi")) {
                System.out.println("Hello! How can I help you?");
            } else if (input.equals("hours") || input.equals("open")) {
                System.out.println("We are open from 8 AM to 10 PM every day.");
            } else if (input.startsWith("do you have")) {
                checkProductAvailability(input);
            } else if (input.equals("exit") || input.equals("bye")) {
                System.out.println("Thank you for visiting! Have a great day!");
                break;
            } else {
                System.out.println("I'm sorry, I didn't understand that. Type 'help' for a list of commands.");
            }
        }

        scanner.close();
    }

    private static void initializeProductAvailability() {
        productAvailability = new HashMap<>();
        productAvailability.put("milk", "Yes, we have milk in stock.");
        productAvailability.put("bread", "Yes, we have bread in stock.");
        productAvailability.put("eggs", "Yes, we have eggs in stock.");
        productAvailability.put("cheese", "Yes, we have cheese in stock.");
        productAvailability.put("butter", "Yes, we have butter in stock.");
        productAvailability.put("apples", "Yes, we have apples in stock.");
        productAvailability.put("bananas", "Yes, we have bananas in stock.");
        productAvailability.put("oranges", "Yes, we have oranges in stock.");
        productAvailability.put("chicken", "Yes, we have chicken in stock.");
        productAvailability.put("beef", "Yes, we have beef in stock.");
        productAvailability.put("fish", "Yes, we have fish in stock.");
        productAvailability.put("rice", "Yes, we have rice in stock.");
        productAvailability.put("pasta", "Yes, we have pasta in stock.");
        productAvailability.put("tomatoes", "Yes, we have tomatoes in stock.");
        productAvailability.put("potatoes", "Yes, we have potatoes in stock.");
        productAvailability.put("carrots", "Yes, we have carrots in stock.");
        productAvailability.put("lettuce", "Yes, we have lettuce in stock.");
        productAvailability.put("cereal", "Yes, we have cereal in stock.");
        productAvailability.put("juice", "Yes, we have juice in stock.");
        productAvailability.put("water", "Yes, we have water in stock.");
        // Add more products as needed
    }

    private static void displayHelp() {
        System.out.println("Here are some commands you can use:");
        System.out.println("- 'hello' or 'hi': Greet the chatbot");
        System.out.println("- 'hours' or 'open': Get store hours");
        System.out.println("- 'do you have [product]': Check product availability");
        System.out.println("- 'exit' or 'bye': Exit the chatbot");
    }

    private static void checkProductAvailability(String input) {
        String product = input.replace("do you have", "").trim();
        if (productAvailability.containsKey(product)) {
            System.out.println(productAvailability.get(product));
        } else {
            System.out.println("I'm sorry, we don't have " + product + " in stock.");
        }
    }
}
