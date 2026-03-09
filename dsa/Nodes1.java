package dsa;

class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
	}
}
class SLL{
	Node head=null;
	void atStart(int data) {
		Node newNode=new Node(data);
		newNode.next=head;
		head=newNode;
		return;
	}
	void disp() {
		if(head==null) {
			System.out.println("It is empty");
			return;
		}
		Node current=head;
		while(current.next!=null) {
			System.out.print(current.data+"--->");
			current=current.next;
		}
		System.out.println(current.data);
	}
	void atEnd(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			return;
		}
		Node current=head;
		while(current.next!=null) {
			current=current.next;
		}
		current.next=newNode;
	}
	void atPos(int pos,int data) {
		Node newNode=new Node(data);
		Node current=head;
		
	}
}
public class Nodes1 {
	public static void main(String[] args) {
		SLL ob=new SLL();
		ob.atStart(5);
		ob.atStart(8);
		ob.atStart(15);
		ob.atEnd(45);
		ob.atEnd(93);
		ob.disp();
	}
}
