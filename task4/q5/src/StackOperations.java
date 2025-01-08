import java.util.Stack;

public class StackOperations {

    // Stack to store integers
    private Stack<Integer> stack;

    // Constructor to initialize the stack
    public StackOperations() {
        stack = new Stack<>();
    }

    // Method to push an element onto the stack
    public void pushElement(int element) {
        stack.push(element);
        System.out.println("Pushed element: " + element);
    }

    // Method to pop an element from the stack
    public void popElement() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty. No elements to pop.");
        } else {
            int poppedElement = stack.pop();
            System.out.println("Popped element: " + poppedElement);
        }
    }

    // Method to display the current stack
    public void displayStack() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Current Stack: " + stack);
        }
    }

    // Main method
    public static void main(String[] args) {
        StackOperations stackOps = new StackOperations();

        // Push some elements onto the stack
        stackOps.pushElement(10);
        stackOps.pushElement(20);
        stackOps.pushElement(30);

        // Display the stack
        stackOps.displayStack();

        // Pop an element
        stackOps.popElement();

        // Display the stack again
        stackOps.displayStack();

        // Pop all elements
        stackOps.popElement();
        stackOps.popElement();

        // Try to pop from an empty stack
        stackOps.popElement();
    }
}
