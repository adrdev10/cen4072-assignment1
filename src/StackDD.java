
public class StackDD {
	
	private final int MAX_NUMBER_OF_OBJECTS = 5;
	private int top;
	
	// Creating a stack with its maximum size
	private Integer stack[] = new Integer[MAX_NUMBER_OF_OBJECTS];
	
	// Constructor
	 StackDD() {
		top = -1;
	}
	
	// push method
	public boolean push(Integer numInt) {
           try {
		if (top >= (MAX_NUMBER_OF_OBJECTS - 1)) {
			// stack overflow
			throw new Exception();
		} else {
			// pushing number to stack
			stack[++top] = numInt;
			return true;
		}
           } catch (Exception e)
           {
               return false;
           }
                
	}
	
	// pop method
	public Integer pop() {
            
            try 
            {
		if (top < 0) {
			// stack underflow
			throw new Exception();
		} else {
			// popping number from stack
			Integer numPopped = stack[top--];
			return numPopped;
		}
            } catch (Exception e)
            {
                return 0;
            }
	}
	
	// peek method
	public Integer peek() {
            
            try 
            {
		if (top < 0) {
			// stack underflow
			throw new Exception();
		} else {
			Integer topNum = stack[top];
			return topNum;
		}
            } catch (Exception e)
            {
             return 0;   
            }
        }
	
	// isEmpty method
	public boolean isEmpty() {
		return (top < 0);
	}
		
	// isFull method
	public boolean isFull() {
		return (top >= MAX_NUMBER_OF_OBJECTS - 1);
	}
	
	// emptyStack method
	public boolean emptyStack() {
            try 
            {
		if (this.isEmpty()) {
			// stack is already empty
			throw new Exception();
		} else {
			for (int i = 0; i <= top; i++) {
				stack[i] = 0;
			}
			this.top = -1;  // resetting top value
			return true;
		}
            } catch (Exception e)
            {
                return false;
            }
	}
	
	// showStack method
	public String showStack() {
          
		String stackString = "";
                try 
                {
		for (int i = top; i > -1; i --) 
                {
			stackString += stack[i];
			if (i != 0) {
				stackString += " ";
			}
		}
                } catch (Exception e)
                {
                    e.printStackTrace();
                }
		return stackString;
	}
}
