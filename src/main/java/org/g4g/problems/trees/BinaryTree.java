package org.g4g.problems.trees;

//http://www.geeksforgeeks.org/find-maximum-or-minimum-in-binary-tree/
public class BinaryTree {

	private Node root;

	public static void main(String args[])
	{
		  BinaryTree tree = new BinaryTree();
	        tree.root = new Node(20);
	        tree.root.leftChild = new Node(9);
	        tree.root.rightChild = new Node(49);
	        tree.root.leftChild.rightChild = new Node(12);
	        tree.root.leftChild.leftChild = new Node(5);
	        tree.root.rightChild.leftChild = new Node(23);
	        tree.root.rightChild.rightChild = new Node(52);
	        tree.root.leftChild.rightChild.rightChild = new Node(12);
	        tree.root.rightChild.rightChild.leftChild = new Node(50);

		System.out.println("Maximum element is " +
				tree.findMax(tree.root));
	}

	private int findMax(Node root2) {
		if(root2==null){
			return Integer.MIN_VALUE;
		}
		int leftVal = findMax(root2.leftChild);
		System.out.println(root2.leftChild);
		int rightVal = findMax(root2.rightChild);
		return 1;
	}
}
