import java.util.ArrayList;

public class stackDC {
	private final int limitSize = 5;
	private int currentLenght = -1;
	private int top = -1;
	private int[] stack;
	
	public stackDC() {
		// TODO Auto-generated constructor stub
		stack = new int[limitSize];
	}
	
	public boolean isFull() {
		return currentLenght == stack.length;
	}
	
	public void push(int value) {
		if (isFull()) {
			return;
		}
		if (value < 0) {
			return; 
		}
		top += 1;
		stack[top] = value;
	}
	
	public int pop() {
		if (isEmpty()) {
			return -1;
		}
		top--;
		return stack[top+1];
	}
	
	public void peek() {
		if (isEmpty()) {
			System.out.print("Stack is empty");
			return;
		}
		System.out.print(stack[top]);
	}
	
	public void emptyStack() {
		if (isEmpty()) {
			return;
		}
		for (int i = 0; i <= top; i++) {
			stack[i] = 0;
		}
	}


	private boolean isEmpty() {
		// TODO Auto-generated method stub
		return top == -1;
	}
	
	
}
