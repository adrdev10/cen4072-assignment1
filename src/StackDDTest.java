import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StackDDTest {
	
	// Testing isEmpty method
	
	@Test
	void isEmptyTest1() {
		StackDD stackDD = new StackDD();
		assertTrue(stackDD.isEmpty() == true);
	}
	
	@Test
	void isEmptyTest2() {
		StackDD stackDD = new StackDD();
		stackDD.push(3);
		assertTrue(stackDD.isEmpty() != true);
	}

	
	// Testing isFull method
	
	@Test
	void isFullTest1() {
		StackDD stackDD = new StackDD();
		assertTrue(stackDD.isFull() != true);
	}
		
	@Test
	void isFullTest2() {
		StackDD stackDD = new StackDD();
		stackDD.push(3);
		stackDD.push(7);
		stackDD.push(8);
		stackDD.push(1);
		stackDD.push(9);
		assertTrue(stackDD.isFull() == true);
	}
	
	
	// Testing emptyStack method
	
	@Test
	void emptyStackTest1() {
		StackDD stackDD = new StackDD();
		stackDD.push(6);
		stackDD.push(9);
		stackDD.push(7);
		stackDD.emptyStack();
		assertTrue(stackDD.isEmpty() == true);
	}
	
	
	// Testing push method
	
	@Test
	void pushTest1() {
		StackDD stackDD = new StackDD();
		int numToPush = 4;
		stackDD.push(numToPush);
		assertEquals(stackDD.peek(), numToPush);
	}
	
	
	// Testing pop method
	
	@Test
	void popTest1() {
		StackDD stackDD = new StackDD();
		int peekNumAfterPop = 9;
		stackDD.push(peekNumAfterPop);
		stackDD.push(5);
		stackDD.pop();
		assertEquals(stackDD.peek(), peekNumAfterPop);
	}
	
	@Test
	void popTest2() {
		StackDD stackDD = new StackDD();
		int numToBePopped = 2;
		stackDD.push(numToBePopped);
		int numPopped = stackDD.pop();
		assertEquals(numPopped, numToBePopped);
	}
	
	
	
	// Testing peek method
	
	@Test
	void peekTest1() {
		StackDD stackDD = new StackDD();
		int num = 5;
		stackDD.push(num);
		assertEquals(stackDD.peek(), num);
		
	}
	
	
	
	// Testing showStack method
	
	@Test
	void showStackTest1() {
		StackDD stackDD = new StackDD();
		stackDD.push(6);
		stackDD.push(9);
		stackDD.push(7);
		String stack = "7 9 6";
		assertEquals(stack, stackDD.showStack());
	}
	
}
