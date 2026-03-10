package placement;
class Node{
	int data;
	Node next;
	Node(int data){
		this.data = data;
		next=null;
	}
}
class LL_methods{
	Node head;
	void insert(int data) {
		Node nextnode = new Node(data);	
		if(head==null) {
			head = nextnode;
			head.next=head;
		}
		else {
			Node temp =head;
			while(temp.next!=head) {
				temp = temp.next;
			}
			temp.next=nextnode;
			nextnode.next= head;
			
		}
	}
	void display() {
		Node temp =head;
		while (temp.next != head) {
			System.out.print(temp.data + "-----> ");
			temp = temp.next;
		}
		System.out.print(temp.data);
	}
	
	void inserAt(int data) {
		Node temp = head;
		Node nextnode = new Node (data);
		while(temp.next != head) {
			temp = temp.next;
		}
		temp.next = nextnode;
		nextnode.next =head;
		head = nextnode;
	}
	void deleteAtend() {
		Node temp = head;
		while(temp.next.next != head) {
			temp = temp.next;
		}
		temp.next=head;
	}
	void deletebeg() {
		Node temp = head ;
		head = temp.next;
		while(head.next!=temp) {
			temp = temp.next;
		}
		temp.next = head;
	}
	void inserAtpos(int data,int pos) {
		Node nextnode = new Node(data);
	int cur =1;
	Node temp = head;
	while(cur!=pos-1) {
		temp =temp.next;
		cur +=1;	
	}
	nextnode.next=temp.next;
	temp.next=nextnode;
		
	}
}
public class Circular_linked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LL_methods obj = new LL_methods();
		obj.insert(10);
		obj.insert(20);
		obj.insert(30);
		obj.inserAt(5);
		obj.inserAtpos(25,4);
		obj.display();
	}

}
