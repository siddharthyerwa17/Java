package pack_stack_demo;

class Stack{
	int stack[] = new int[10];
	int tos;
//	initialize top-of-stack
	Stack() {
		tos = -1;
	}
//	push item in stack
	
	void push(int item) {
		if (tos==9) {
			System.out.println("Stack is full");
		}else {
			stack[++tos]=item;
		}
	}
	
//	pop the item from stack
	
	int pop() {
		if(tos<0) {
				System.out.println("Stack underflow");
				return 0;
		}else {
			return stack[tos--];
		}
				
	}
	
}
public class TestStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s = new Stack();
		Stack st = new Stack();
		
//		push some number to stack
		for (int i=0;i<10;i++) {
			s.push(i);
		}
		
		for (int i = 10;i<20;i++) {
			st.push(i);
		}
//		pop those number fromstack
		
		System.out.println("Stack in mystack: ");
		for(int i=0;i<10;i++) {
			System.out.println(s.pop());
		}
		System.out.println("stack in mystack2");
		for (int i=0;i<10;i++) {
			System.out.println(st.pop());
		}
	}
	

}
