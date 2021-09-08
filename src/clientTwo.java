import java.util.Scanner;

/*----------------------------------
| Goal: Document and have the
| program run even when client
| enters a response other than
| an integer
----------------------------------*/


public class clientTwo
{
    public static void main(String[] args)
    {
        Scanner clientInput = new Scanner(System.in);
        clientOne stackTest = new clientOne();

        System.out.println("\nHello, this code will demonstrate how defensive design works!");
        System.out.println("Since this is a stack, you have the option to either push, pop,");
        System.out.println("peek, or print the stack depending on your choice!");

        boolean isRunning = true;

        while(isRunning)
        {
            System.out.println("\nHere are your options:");
            System.out.println("1. Push()");
            System.out.println("2. Pop()");
            System.out.println("3. Peek()");
            System.out.println("4. Show the Stack()");
            System.out.println("5. End the program");

            int choice = clientInput.nextInt();



            if(choice == 1)
            {
                System.out.println("Enter a number to push in the stack:");
                int entry =  clientInput.nextInt();

                stackTest.push(entry);
            }
            else if (choice == 2)
            {
                if (stackTest.isEmpty())
                {
                    System.out.println("Cannot perform Pop() at this time");
                }
                else
                System.out.println("The element has been taken out: " + stackTest.pop());
            }
            else if (choice == 3)
            {
                if (stackTest.isEmpty())
                {
                    System.out.println("Cannot perform Peek() at this time");
                }
                else
                System.out.println("Here is the top element: " + stackTest.peek());
            }
            else if (choice == 4)
            {
                if (stackTest.isEmpty())
                {
                    System.out.println("The stack is empty as of now");
                }
                stackTest.showStack();
            }
            else if (choice == 5)
            {
                isRunning = false;
                System.out.println("Thank you for participating!");
            } else {
                System.out.println("Invalid response");
                break;
            }

        }
    }
}