
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
		if (top >= (MAX_NUMBER_OF_OBJECTS - 1)) {
			// stack overflow
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
			Integer numPopped = stack[top--];
			return numPopped;
		}
	}
	
	// peek method
	public Integer peek() {
		if (top < 0) {
			// stack underflow
			return 0;
		} else {
			Integer topNum = stack[top];
			return topNum;
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
		if (this.isEmpty()) {
			// stack is already empty
			return false;
		} else {
			for (int i = 0; i <= top; i++) {
				stack[i] = 0;
			}
			this.top = -1;  // resetting top value
			return true;
		}
	}
	
	// showStack method
	public String showStack() {
		String stackString = "";
		for (int i = top; i > -1; i --) {
			stackString += stack[i];
			if (i != 0) {
				stackString += " ";
			}
		}
		return stackString;
	}
	
	
}
