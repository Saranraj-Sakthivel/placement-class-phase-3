package dsa;
class Node {
	int data;
	Node next;
	Node(int data){
		this.data = data;
		next=null;
		
	}
}
class demo{
	Node head;
	void insert(int data) {
		Node newnode = new Node(data);
	
		if(head==null)
		   head = newnode;
		else {
		  Node temp = head;
		  while(temp.next!=null) {
			  temp= temp.next;
	  
		  }
		  temp.next=newnode;
		}       
	}
	void display() {
		Node temp= head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp= temp.next;
		}
	}
	void insertbeg(int data) {
		Node newnode = new Node(data);
		newnode.next = head;
		head = newnode;
	}
	void delete_last() {
		Node temp = head;
		
		while(temp.next.next!=null) {
			temp= temp.next;
			
		   }
		temp.next=null;
		
	}
	void delete_start () {
		head = head.next;
	}
	void insert_pos(int pos,int val) {
		if(pos == 1) {
			insertbeg(val);
			return;
		}
		Node newnode = new Node(val);
		int cur = 1;
		Node temp=head;
		while(cur!=pos-1&&temp!=null) {
			temp = temp.next;
			cur =cur +1;
		
		}
		if(temp==null) {
			System.out.print("Invalid Input ");
			return;
		}
		newnode.next = temp.next;
		temp.next = newnode;
	}
	void delete_pos(int pos) {
		if(pos ==1) {
			head =head.next;
			return;
		}
		int cur = 1;
		Node temp=head;
		while(cur!=pos-1) {
			temp = temp.next;
			cur =cur +1;
		
		}
	
		temp.next=temp.next.next;
	}
}

public class Saran {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo obj=new demo();
		obj.insert(10);
		obj.insert(20);
		obj.insert(30);
		obj.insertbeg(5);
//		obj.delete_last();
//		obj.delete_start();
		obj.insert_pos(5,25);
		obj.delete_pos(5);
		
		obj.display();

	}

}
