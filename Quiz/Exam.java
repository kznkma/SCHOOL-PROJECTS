public class Exam {
    private String message;
    private double price;
    private boolean status;

    // Constructor that assigns "Good luck" to message
    public Exam() {
        this.message = "Good luck";
    }

    // Overloaded constructor with two String parameters
    public Exam(String period, String level) {
        // Empty constructor
    }

    // Accessor for price
    public double getPrice() {
        return price;
    }

    // Accessor for status
    public boolean isFinished() {
        return status;
    }
}
