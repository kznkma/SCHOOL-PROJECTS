import java.util.Scanner;

class RunQuad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press R for Rectangle or S for Square:");
        String choice = scanner.nextLine().toUpperCase();

        if (choice.equals("R")) {
            Rectangle rectangle = new Rectangle();
            rectangle.showDescription();
        } else if (choice.equals("S")) {
            Square square = new Square();
            square.showDescription();
        } else {
            System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}

class Quadrilateral {
    public void showDescription() {
        System.out.println("- is quadrilateral");
    }
}

class Rectangle extends Quadrilateral {
    @Override
    public void showDescription() {
        super.showDescription();
        System.out.println("- has 4 right angles");
    }
}

class Square extends Rectangle {
    @Override
    public void showDescription() {
        super.showDescription();
        System.out.println("- has 4 equal sides");
    }
}
