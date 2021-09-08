import java.util.InputMismatchException;
import java.util.Scanner;

class clientOne {

    private final int MAX_NUMBER_OF_OBJECTS = 5;
    private int top;

    // Creating a stack with its maximum size
    private int stack[] = new int[MAX_NUMBER_OF_OBJECTS];

    // Constructor
    clientOne() {
        top = -1;
    }

    // isEmpty method
    public boolean isEmpty() {
        return (top < 0);
    }

    // push method
    public boolean push(Integer numInt) {
        if (top >= (MAX_NUMBER_OF_OBJECTS - 1)) {
            // stack overflow
            System.out.println("Cannot load anymore number");
            return false;
        } else {
            // pushing number to stack
            stack[++top] = numInt;
            return true;
        }
    }

    // pop method
    public Integer pop() {
        if (top < 0) {
            // stack underflow
            return 0;
        } else {
            // popping number from stack
            return stack[top--];
        }
    }

    // peek method
    public Integer peek() {
        if (top < 0) {
            // stack underflow
            return 0;
        } else {
            return stack[top];
        }
    }

    // showStack method
    public void showStack() {
        for (int i = top; i > -1; i--) {
            System.out.print(stack[i] + " ");
        }
    }

    public void startProgram() {

        Scanner clientTest = new Scanner(System.in);
        clientOne stack = new clientOne();

        boolean isRunning = true;

        while (isRunning) {
            System.out.println("\nHere are your options:");
            System.out.println("1. Push()");
            System.out.println("2. Pop()");
            System.out.println("3. Peek()");
            System.out.println("4. Show the Stack()");
            System.out.println("5. End the program");

            int choice = 0;

            try {
                choice = clientTest.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Try another time");
                clientTest.next();
                continue;
            }

            if (choice == 1) {
                System.out.println("Enter a number to push in the stack:");
                int entry = clientTest.nextInt();

                stack.push(entry);
            } else if (choice == 2) {
                if (stack.isEmpty()) {
                    System.out.println("Cannot perform Pop() at this time");
                } else
                    System.out.println("The element has been taken out: " + stack.pop());
            } else if (choice == 3) {
                if (stack.isEmpty()) {
                    System.out.println("Cannot perform Peek() at this time");
                } else
                    System.out.println("Here is the top element: " + stack.peek());
            } else if (choice == 4) {
                if (stack.isEmpty()) {
                    System.out.println("The stack is empty as of now");
                }
                stack.showStack();
            } else if (choice == 5) {
                isRunning = false;
                System.out.println("Thank you for participating!");
            } else {
                System.out.println("Invalid response");
                break;
            }
        }
    }
}
