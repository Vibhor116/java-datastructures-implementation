package com.equals3.legacy.algorithms.trees;

public class BinarySearchTree {

	private Node root;

	public BinarySearchTree(){
		// no node in the tree yet
		this.root=null;
	}
	public Node find(int key){
		// assumes non empty tree
		Node current = root;

		while(current.iData !=key){
			if(key<current.iData){
				current=current.leftChild;
			}
			else if (key>=current.iData){
				current=current.leftChild;
			}
			if(current==null){
				return null;
			}
		}
		return current;
	}


	public void  insert(int key){
		Node newNode=new Node();
		newNode.iData=key;
		if(root==null){
			root=newNode;
		}
		else{
			Node current = root;
			Node parent;
			while(true){
				parent =current;
				if(key<current.iData){
					current=current.leftChild;
					if(current==null){
						parent.leftChild=newNode;
						return;
					}
				}
				else{
					current=current.rightChild;
					if(current==null){
						parent.rightChild=newNode;
						return;
					}
				}
			}
		}
	}

	public boolean delete(int key){
		// node may have 0/1/2 child
		Node current = root;
		Node parent = root;
		boolean isLeftChild = true;

		while(current.iData != key) // search for node
		{
			parent = current;
			if(key < current.iData)
			{
				isLeftChild = true;
				current = current.leftChild;
			}
			else 
			{
				isLeftChild = false;
				current = current.rightChild;
			}
			if(current == null){ 
				return false;
			}
			// this point current is the node to be deleted
			// the node is leaf node
			if(current.leftChild== null && current.rightChild==null){
				if(current==root){
					root = null;
				}
				else if(isLeftChild){
					parent.leftChild=null;
				}
				else if(isLeftChild==false){
					parent.rightChild=null;
				}
			}
			// node have no right child
			// if no right child, replace with left subtree
			else if(current.rightChild==null)
				if(current == root)
					root = current.leftChild;
				else if(isLeftChild)
					parent.leftChild = current.leftChild;
				else
					parent.rightChild = current.leftChild;
			// if no left child, replace with right subtree
			else if(current.leftChild==null)
				if(current == root)
					root = current.rightChild;
				else if(isLeftChild)
					parent.leftChild = current.rightChild;
				else
					parent.rightChild = current.rightChild;
		} 


		return false;
	}
	public void traverse(int traverseType)
	{
		switch(traverseType)
		{
		case 1: System.out.print("\nPreorder traversal: ");
		preOrder(root);
		break;
		case 2: System.out.print("\nInorder traversal: ");
		inOrder(root);
		break;
		case 3: System.out.print("\nPostorder traversal: ");
		postOrder(root);
		break;
		}
		System.out.println();
	}
	private void preOrder(Node localRoot)
	{
		if(localRoot != null)
		{
			System.out.print(localRoot.iData + " ");
			preOrder(localRoot.leftChild);
			preOrder(localRoot.rightChild);
		}
	}

	private void inOrder(Node localRoot)
	{
		if(localRoot != null)
		{
			inOrder(localRoot.leftChild);
			System.out.print(localRoot.iData + "");
			inOrder(localRoot.rightChild);
		}
	}
	private void postOrder(Node localRoot)
	{
		if(localRoot != null)
		{
			postOrder(localRoot.leftChild);
			postOrder(localRoot.rightChild);
			System.out.print(localRoot.iData + " ");
		}
	}

}
