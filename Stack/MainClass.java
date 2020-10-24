import java.util.Scanner;

/**
 * Program to implement stack push,pop,and display operations. 
 * Date : 24-Oct-2020 10:57PM
 */
class Stack {
	int arr[];
	int TOP = -1;
	int size;

	void push(int x) {

		// check isFull
		if (TOP >= size) {
			System.out.println("Stack is full");
			System.exit(0);
		} else {
			TOP = TOP + 1;
			arr[TOP] = x;
		}
	}

	// pop
	void pop() {
		if (TOP < 0) {
			System.out.println("Stack is Empty");
			System.exit(0);
		} else {
			System.out.println("Removed after POP:" + arr[TOP]);
			TOP = TOP - 1;
		}
	}

	// Display items
	void display() {
		for (int i = 0; i <= TOP; i++) {
			System.out.println(arr[i]);
		}
	}
}

class MainClass {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Stack stack = new Stack();
		System.out.print("Enter size of the Stack:");
		stack.size = sc.nextInt();
		stack.arr = new int[stack.size];
		stack.push(5);
		stack.push(10);
		stack.push(15);
		stack.push(20);

		stack.display();
		// pop
		stack.pop();
		stack.pop();
		stack.display();
	}
}