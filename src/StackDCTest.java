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
		stackDC testStack = new stackDC();
		assertTrue(testStack.isFull() != true);
	}
	
	@Test
	void isFullTest2() {
		stackDC testStack = new stackDC();
		testStack.push(1);
		testStack.push(2);
		testStack.push(3);
		testStack.push(4);
		testStack.push(5);
		assertTrue(testStack.isFull() == true);
	}
	
	//Testing emptyStack method
	
	@Test
	void emptyStackTest1() {
		stackDC testStack = new stackDC();
		testStack.push(1);
		testStack.push(2);
		testStack.push(3);
		testStack.emptyStack();
		assertTrue(testStack.isEmpty() == true);
	}
		
	//Testing push method
	
	@Test
	void pushTest1() {
		stackDC testStack = new stackDC();
		int numToPush = 1;
		testStack.push(numToPush);
		assertEquals(testStack.peek(), numToPush);
	}
	
	//Testing pop method
	
	@Test
	void popTest1() {
		stackDC testStack = new stackDC();
		int peekNumAfterPop = 1;
		testStack.push(peekNumAfterPop);
		testStack.push(2);
		testStack.pop();
		assertEquals(testStack.peek(), peekNumAfterPop);
	}
	
	@Test
	void popTest2() {
		stackDC testStack = new stackDC();
		int numToBePopped = 1;
		testStack.push(numToBePopped);
		int numPopped = testStack.pop();
		assertEquals(numPopped, numToBePopped);
	}
	
	//Testing peek method
	
	@Test
	void peekTest1() {
		stackDC testStack = new stackDC();
		int num = 1;
		testStack.push(num);
		assertEquals(testStack.peek(), num);
	}
	
	//Testing printStack method
	
	@Test
	void printStackTest1() {
		stackDC testStack = new stackDC();
		testStack.push(1);
		testStack.push(2);
		testStack.push(3);
		String stack = "3 2 1";
		assertEquals(stack, testStack.printStack());
	}
	
}
