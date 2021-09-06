
import java.util.ArrayList;

public class StackDD {
	
	private final int MAX_NUMBER_OF_OBJECTS = 5;
	private int top;
	
	// Creating a stack with its maximum size
	private Integer stack[] = new Integer[MAX_NUMBER_OF_OBJECTS];
	
	// Constructor
	StackDD() {
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
			return false;
		} else {
			// pushing number to stack
			stack[++top] = numInt;
			return true;
		}
	}
	
}
