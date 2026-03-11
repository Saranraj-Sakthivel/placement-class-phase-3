package placement;
class stack_arr{
	int arr [];
	int size ;
	int top;
	stack_arr(int size){
		this.size= size;
		arr = new int[size];
		top=-1;
		
	}
	
	boolean isfull() {
		if(top ==size-1)
			return true ;
		return false;
	}
	boolean isempty() {
		if(top==-1 ) {
			return true;
		}
		return false;
	}
	
	void push(int data) {
		if(isfull()) {
		    System.out.print("Stack is full ");
		    return;
		}	
			arr[++top] = data;
	}
	void pop() {
	 if(isempty())
	 {
		 System.out.println("Stack is Empty");
		 return;
	 }
	  top--;
		
	}
	void peek() {
		 if(isempty())
		 {
			 System.out.println("Stack is Empty");
			 return;
		 }
		 System.out.println(                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            )
		                                                                            
	}
	void display() {
	for(int i=0;i<=top;i++){
		   System.out.print(arr[i] +" ");
		 
	   }
	}
}
class Node {
	int data;
	Node next;
	Node (int data)
	{
		this.data = data;
		next=null;
	}
}
class stack_mthods{
	Node top;
	void push(int data) {
		Node  newnode = new Node(data);
		if(top == null) {
			top = newnode;
		}
		else {
			newnode.next= top;
			top= newnode;
		}
	}
	void pop() {
		top = top.next;
	}
	void display() {
		Node temp = top;
		while (temp!=null) {
			System.out.println(temp.data + " ");
			temp = temp.next;
		}
	}
	
}
public class stack {
	public static void main(String[] args) {
		stack_mthods obj = new stack_mthods();
		obj.push(10);
		obj.push(29);
		obj.push(30);
		obj.pop();
		obj.display();
	}

}
