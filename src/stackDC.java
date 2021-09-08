import java.util.ArrayList;
import java.util.*;
import java.lang.*;


public class MyStack 
{
	private final int limitSize = 5;
	private int currentLenght = -1;
	private int top = -1;
	private int[] stack;
	
	public MyStack() 
        {
		// TODO Auto-generated constructor stub
		stack = new int[limitSize];
	}
	
	public boolean isFull() 
        {
                if(top == 4 )
                {
                    return true;
                }
                else 
                    return false;
	}
	
	public void push(int value) {
		top += 1;
                System.out.println("Inserting number " + value);
		stack[top] = value;
	}
	
	public void pop() {
		top--;
	}
	
	public void peek() 
        {
                System.out.println("This the top item");
		System.out.println(stack[top]);
	}
	
	public void emptyStack() 
        {
		for (int i = 0; i <= top; i++) 
                {
			stack[i] = 0;
		}
                
         }

        public void printStack()
        {
            System.out.println("Here is your stack");
            for (int i = top; i > -1; i --) {
			System.out.println(stack[i] + " ");
		}
        }
        
	public boolean isEmpty() {
		// TODO Auto-generated method stub
                if(top == -1)
                    return true;
                else return false;
	}
	
}	
