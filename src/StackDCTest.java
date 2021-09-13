import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class StackDCTest {
	
	//Testing isEmpty method
	
	@Test
	void isEmptyTest1() {
		stackDC testStack = new stackDC();
		assertTrue(testStack.isEmpty() == true);
	}
	
	@Test
	void isEmptyTest2() {
		stackDC testStack = new stackDC();
		testStack.push(1);
		assertTrue(testStack.isEmpty() != true);
	}
	
	//Testing isFull method
	
	@Test
	void isFullTest1() {
		
	}
	
	@Test
	void isFullTest2() {
		
	}
	
	//Testing emptyStack method
	
	@Test
	void emptyStackTest1() {
		
	}
		
	//Testing push method
	
	@Test
	void pushTest1() {
		
	}
	
	//Testing pop method
	
	@Test
	void popTest1() {
		
	}
	
	@Test
	void popTest2() {
		
	}
	
	//Testing peek method
	
	@Test
	void peekTest1() {
		
	}
	
	//Testing printStack method
	
	@Test
	void printStackTest1() {
		
	}
	
}
