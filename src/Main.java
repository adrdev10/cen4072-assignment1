
public class Main {

	public static void main(String[] args) {
		
		StackDD stackDD = new StackDD();
		stackDD.push(2);
		stackDD.push(4);
		stackDD.push(6);
		stackDD.push(7);
		stackDD.push(9);
		
		stackDD.pop();
		
		System.out.println("The peek is: " + stackDD.peek());
		
		stackDD.showStack();

	}

}
