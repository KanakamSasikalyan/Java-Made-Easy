/*
	A Binary Tree is a Non-linear datastructure that have atmost two nodes for every node
	Properties of Binary Trees:-
		The maximum number of nodes n = 2^(h+1)-1
		The minimum number of nodes n = h+1
		
		The maximum height is h = n-1
		The minimum height is h = log2(h+1)-1

	There are different types of Binary Trees
		Full/strict/proper Binary Tree
			For every node strictly there is 0 or 2 nodes
			Properties:
				max node n = 2^(h+1)-1
				min node n = 2*h-1
				
				max hright = (n+1)/2
				min height = log2(h+1)-1
		
		Complete Binary Tree:
			For Internal nodes are completly filled except last level
			max nodes n = 2^(h+1)-1
			min nodes n = 2^h
			
		Perfect Binary Trees
		Degenerate Biinary Trees
		Balanced Binary Trees
*/


public class BinaryTree{
	public static class Node{
		int data;
		Node left, right;
		Node(int data){
			this.data = data;
			this.left = this.right = null;
		}
	}
	
	public static void preorder(Node root){
		if(root==null){return;}
		System.out.print(root.data+" ");
		preorder(root.left);
		preorder(root.right);
	}

	public static void inorder(Node root){
		if(root==null){
			return;
		}
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}

	public static void postorder(Node root){
		if(root==null){return;}
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data+" ");
	}
	
	public static void main(String[] args){
		Node root=null;
		Node fir = new Node(10);
		Node sec = new Node(100);
		Node thi = new Node(23);
		Node fou = new Node(34);
		Node fif = new Node(345);
		Node six = new Node(45);
		Node sev = new Node(67);

		root = fir;
		fir.left = sec;
		fir.right = thi;
		sec.left = fou;
		sec.right = fif;
		thi.right = six;
		six.right = sev;
		inorder(root);
		preorder(root);
		postorder(root);
	}
}
