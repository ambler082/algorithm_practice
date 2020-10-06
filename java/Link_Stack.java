class node {
	int value;
	node next = null;
	node(int value){
		this.value =value;
	}
}

class Stack{
	private node head = null;
	
	public Stack(){
		
	}
	public void print_stack() {
		if(head == null){
			System.out.println("null");
		}
		
		node cur = head ;
		while(cur != null) {
			System.out.print(cur.value);
			cur = cur.next;
		}
	}
	public void push(int value) {
		if(head == null ){
			head = new node(value);
			return;
		}
		
		node cur = head;
		node node_1 = new node(value);
		
		while(cur.next != null){
				cur = cur.next;
			}
			cur.next = node_1;
	}


	public void pop() {
	
		if (head == null) {
			System.out.println("no stack");
			return;
		}
		node prev = null;
		node cur = head;
		while(cur.next != null){
				prev = cur; 
				cur = cur.next;
			}
		
		if(prev == null) {
			head = head.next;
		}
		else{
		prev.next = null;
		}
	}

}
public class Link_Stack {
	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(3);
		stack.push(4);
		stack.pop();
		stack.pop();
		stack.pop();
		stack.print_stack();
	}
}