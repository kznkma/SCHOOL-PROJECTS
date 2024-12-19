import java.util.Scanner;

class RunQuad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press R for Rectangle, S for Square, P for Parallelogram, H for Rhombus, or T for Trapezoid:\n");
        String choice = scanner.nextLine().toUpperCase();

        switch (choice) {
            case "R":
                System.out.println("R for Rectangle");
                Rectangle rectangle = new Rectangle();
                rectangle.showDescription();
                break;
            case "S":
                System.out.println("S for Square");
                Square square = new Square();
                square.showDescription();
                break;
            case "P":
                System.out.println("P for Parallelogram");
                Parallelogram parallelogram = new Parallelogram();
                parallelogram.showDescription();
                break;
            case "H":
                System.out.println("H for Rhombus");
                Rhombus rhombus = new Rhombus();
                rhombus.showDescription();
                break;
            case "T":
                System.out.println("T for Trapezoid");
                Trapezoid trapezoid = new Trapezoid();
                trapezoid.showDescription();
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }

        scanner.close();
    }
}

class Quadrilateral {
    public void showDescription() {
        System.out.println("- is quadrilateral");
    }
}

class Parallelogram extends Quadrilateral {
    @Override
    public void showDescription() {
        super.showDescription();
        System.out.println("- has 2 pairs of parallel sides");
    }
}

class Rectangle extends Parallelogram {
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

class Rhombus extends Parallelogram {
    @Override
    public void showDescription() {
        super.showDescription();
        System.out.println("- has 4 congruent sides");
    }
}

class Trapezoid extends Quadrilateral {
    @Override
    public void showDescription() {
        super.showDescription();
        System.out.println("- has 1 pair of parallel sides");
    }
}
