import java.util.Scanner;

public class RunAnimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose an animal:");
        System.out.println("Press B for Bird");
        System.out.println("Press C for Cat");
        System.out.println("Press D for Dog");
        System.out.println();

        String choice = scanner.nextLine();
        System.out.println("------------------------");

        Animal animal;
        if (choice.equalsIgnoreCase("B")) {
            animal = new Bird();
        } else if (choice.equalsIgnoreCase("C")) {
            animal = new Cat();
        } else if (choice.equalsIgnoreCase("D")) {
            animal = new Dog();
        } else {
            System.out.println("Unknown choice.");
            scanner.close();
            return;
        }

        animal.eat();
        animal.sleep();
        animal.makeSound();
        scanner.close();
    }
}
