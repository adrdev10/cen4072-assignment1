import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class StackDCTest {
	
	//Testing isEmpty method
	/*
	 * Test case DC-01
	 * Purpose: Test if isEmpty method returns true when the stack is empty
	 * Preconditions: Stack is empty
	 * Input: none
	 * Expected output: isEmpty == true
	 */
	@Test
	void isEmptyTest1() {
		stackDC testStack = new stackDC();
		assertTrue(testStack.isEmpty() == true);
	}
	
	/*
	 * Test case DC-02
	 * Purpose: Test if isEmpty method returns false when the stack isn't empty
	 * Preconditions: Stack isn't empty or full
	 * Input: 1
	 * Expected output: isEmpty == false
	 */
	@Test
	void isEmptyTest2() {
		stackDC testStack = new stackDC();
		testStack.push(1);
		assertTrue(testStack.isEmpty() != true);
	}
	
	/*
	 * Test case DC-03
	 * Purpose: Test if isEmpty method returns false when the stack is full
	 * Preconditions: Stack is full
	 * Input: 1 2 3 4 5
	 * Expected output: isEmpty == false
	 */
	@Test
	void isEmptyTest3() {
		stackDC testStack = new stackDC();
		testStack.push(1);
		testStack.push(2);
		testStack.push(3);
		testStack.push(4);
		testStack.push(5);
		assertTrue(testStack.isEmpty() != true);
	}
	
	//Testing isFull method
	
	/*
	 * Test case DC-04
	 * Purpose: Test if isFull method returns false when the stack is empty
	 * Preconditions: Stack is empty
	 * Input: none
	 * Expected output: isFull == false
	 */
	@Test
	void isFullTest1() {
		stackDC testStack = new stackDC();
		assertTrue(testStack.isFull() != true);
	}
	
	/*
	 * Test case DC-05
	 * Purpose: Test if isFull method returns false when the stack isn't full
	 * Preconditions: Stack isn't full or empty
	 * Input: 1
	 * Expected output: isFull == false
	 */
	@Test
	void isFullTest2() {
		stackDC testStack = new stackDC();
		testStack.push(1);
		assertTrue(testStack.isFull() != true);
	}
	
	/*
	 * Test case DC-06
	 * Purpose: Test if isFull method returns true when the stack is full
	 * Preconditions: Stack is full
	 * Input: 1 2 3 4 5
	 * Expected output: isFull == true
	 */
	@Test
	void isFullTest3() {
		stackDC testStack = new stackDC();
		testStack.push(1);
		testStack.push(2);
		testStack.push(3);
		testStack.push(4);
		testStack.push(5);
		assertTrue(testStack.isFull() == true);
	}
	
	//Testing emptyStack method
	
	/*
	 * Test case DC-07
	 * Purpose: Test emptyStack method
	 * Preconditions: Stack isn't empty
	 * Input: 1 2 3
	 * Expected output: isEmpty == true
	 */
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
	
	/*
	 * Test case DC-08
	 * Purpose: Test push method
	 * Preconditions: Stack isn't full
	 * Input: 1
	 * Expected output: peek == 1
	 */
	@Test
	void pushTest1() {
		stackDC testStack = new stackDC();
		int numToPush = 1;
		testStack.push(numToPush);
		assertEquals(testStack.peek(), numToPush);
	}
	
	//Testing pop method
	
	/*
	 * Test case DC-09
	 * Purpose: Test pop method
	 * Preconditions: Stack isn't empty before pop
	 * Input: 1 2
	 * Expected output: peek == 1
	 */
	@Test
	void popTest1() {
		stackDC testStack = new stackDC();
		int peekNumAfterPop = 1;
		testStack.push(peekNumAfterPop);
		testStack.push(2);
		testStack.pop();
		assertEquals(testStack.peek(), peekNumAfterPop);
	}
	
	/*
	 * Test case DC-10
	 * Purpose: Test pop method
	 * Preconditions: Stack isn't empty before pop
	 * Input: 1
	 * Expected output: numPopped == 1
	 */
	@Test
	void popTest2() {
		stackDC testStack = new stackDC();
		int numToBePopped = 1;
		testStack.push(numToBePopped);
		int numPopped = testStack.pop();
		assertEquals(numPopped, numToBePopped);
	}
	
	//Testing peek method
	
	/*
	 * Test case DC-11
	 * Purpose: Test peek method
	 * Preconditions: Stack isn't empty
	 * Input: 1
	 * Expected output: peek == 1
	 */
	@Test
	void peekTest1() {
		stackDC testStack = new stackDC();
		int num = 1;
		testStack.push(num);
		assertEquals(testStack.peek(), num);
	}
	
	//Testing printStack method
	
	/*
	 * Test case DC-12
	 * Purpose: Test printStack method
	 * Preconditions: Stack isn't empty
	 * Input: 1 2 3
	 * Expected output: printStack == "3 2 1"
	 */
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
