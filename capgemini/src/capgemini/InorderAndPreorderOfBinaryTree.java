package capgemini;
import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Stack;
public class InorderAndPreorderOfBinaryTree {
	Scanner sc=new Scanner(System.in);
	static class Pair{
		Node node;
		int value;
		Pair(Node node,int value){
			this.node=node;
			this.value=value;
		}
	}
	static class Node{
		Node left,right;
		int value;
		Node(int value){
			this.value=value;
		}
	}
	public Node create() {
		System.out.print("Enter the root element:");
		int value=sc.nextInt();
		Node root=new Node(value);
		Queue<Node> q=new LinkedList<>();
		q.add(root);
		while(true) {
			Node curr=q.poll();
			System.out.print("Do you want to add left child of "+curr.value+"(yes/no):");
			String choice=sc.next();
			if(choice.equalsIgnoreCase("yes")) {
				System.out.print("Enter the left child's value:");
				value=sc.nextInt();
				curr.left=new Node(value);
				q.add(curr.left);
			}
			System.out.print("Do you want to add right child of "+curr.value+"(yes/no):");
			choice=sc.next();
			if(choice.equalsIgnoreCase("yes")) {
				System.out.print("Enter the right child's value:");
				value=sc.nextInt();
				curr.right=new Node(value);
				q.add(curr.right);
			}
			System.out.print("Do you want to add more node (yes/no):");
			choice=sc.next();
			if(choice.equalsIgnoreCase("no")) {
				break;
			}	
		}
		return root;
	}
	public void levelOrder(Node root) {
		if(root==null) {
			System.out.println("Please create the Binary Tree first.");
		}else {
			System.out.print("Binary Tree:");
			Queue<Node> q=new LinkedList<>();
			q.add(root);
			while(!q.isEmpty()) {
				Node curr=q.poll();
				System.out.print(curr.value+" ");
				if(curr.left!=null) {
					q.add(curr.left);
				}
				if(curr.right!=null) {
					q.add(curr.right);
				}
			}
			System.out.println();
		}
	}
	public void inorderPreorder(Node root) {
		ArrayList<Integer> inorder=new ArrayList<>();
		ArrayList<Integer> preorder=new ArrayList<>();
		Stack<Pair> st=new Stack<>();
		st.push(new Pair(root,1));
		while(!st.isEmpty()) {
			Pair curr=st.pop();
			if(curr.value==1) {
				preorder.add(curr.node.value);
				st.push(new Pair(curr.node,curr.value+1));
				if(curr.node.left!=null) {
					st.push(new Pair(curr.node.left,1));
				}
			}else if(curr.value==2) {
				inorder.add(curr.node.value);
				if(curr.node.right!=null) {
					st.push(new Pair(curr.node.right,1));
				}
			}
		}
		System.out.println("inorder:"+inorder);
		System.out.println("preorder:"+preorder);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InorderAndPreorderOfBinaryTree tree=new InorderAndPreorderOfBinaryTree();
		Node root=tree.create();
		tree.levelOrder(root);
		tree.inorderPreorder(root);
	}

}
