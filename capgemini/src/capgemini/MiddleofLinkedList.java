package capgemini;

public class MiddleofLinkedList {
	static class Node{
		int value;
		Node next;
		Node(int value){
			this.value=value;
		}
	}
	Node head;
	public void addNode(int value) {
		if(head==null) {
			head=new Node(value);
		}else {
			Node toAdd=new Node(value);
			toAdd.next=head;
			head=toAdd;
		}
	}
	public void display(Node head) {
		System.out.print("Linked List:");
		Node curr=head;
		while(curr!=null) {
			System.out.print(curr.value);
			if(curr.next!=null) {
				System.out.print("->");
			}
			curr=curr.next;
		}
		System.out.println();
	}
	public Node middleNode(Node head) {
		Node slow=head,fast=head;
		while(fast!=null && fast.next!=null && slow.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MiddleofLinkedList list1=new MiddleofLinkedList();
		list1.addNode(6);
		list1.addNode(5);
		list1.addNode(4);
		list1.addNode(3);
		list1.addNode(2);
		list1.addNode(1);
		list1.display(list1.head);
		System.out.println("Middle Node:"+list1.middleNode(list1.head).value);
	}

}
