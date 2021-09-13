
//Stack class implemented as Design by Contract
public class stackDC
{ 
	//Private attributes
	private final int limitSize = 5;
	private int top = -1;
	private int[] stack;
	
	//Constructor
	public stackDC() 
        {
		// TODO Auto-generated constructor stub
		stack = new int[limitSize];
	}
	
	//isFull() return true if function is full and false otherwise.
	public boolean isFull() 
        {
                if(top == 4 )
                {
                    return true;
                }
                else 
                    return false;
	}
	
	//Pre-condition: The stack is not full
	public void push(int value) {
		top += 1;
                System.out.println("Inserting number " + value);
		stack[top] = value;
	}
	//Post-condition: The stack size is incremented by 1
	
	//Pre-condition: The stack cannot be empty
	public void pop() {
		top--;
	}
	//Post-condition: The stack size is decremented by 1
	
	//Pre-condition: The stack cannot be empty
	public int peek() 
        {
                System.out.println("This the top item");
		System.out.println(stack[top]);
		return stack[top];
	}
	//Post-condition: Display the top item
	
	//Pre-condition: Stack is not empty
	public void emptyStack() 
        {
		for (int i = -1; i <= top; i++) 
                {
			pop();
		}
                
         }
	//Post-condition: Empty the stack

        public String printStack()
        {
            System.out.println("Here is your stack");
	    String stackString = "";
            for (int i = top; i > -1; i --) 
	        {
		    stackString += stack[i];
		    if( i != 0)
		    {
			    stackString += " ";
		    }
		}
		return stackString;
        }
        
	//isEmpty() return true if stack is empty and false otherwise.
	public boolean isEmpty() {
		// TODO Auto-generated method stub
                if(top == -1)
                    return true;
                else return false;
	}
	
}	
