
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
        clientOne stackTest = new clientOne();

        System.out.println("\nHello, this code will demonstrate how Defensive Design (StackDD) ");
        System.out.println("works! Since this is a stack, you have the option to either push, ");
        System.out.println("pop, peek, or print the stack depending on your choice!");


        stackTest.startProgram();
        }
}
