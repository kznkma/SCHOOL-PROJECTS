import java.util.Scanner;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class BookStackQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> bookStack = new Stack<>();
        Queue<String> bookQueue = new LinkedList<>();

        for (int i = 0; i < 4; i++) {
            System.out.print("Enter book title " + (i + 1) + ": ");
            String bookTitle = scanner.nextLine();
            bookStack.push(bookTitle);
        }

        while (!bookStack.isEmpty()) {
            bookQueue.add(bookStack.pop());
        }

        System.out.println("Books in the queue:");
        for (String book : bookQueue) {
            System.out.println(book);
        }

        scanner.close();
    }
}
