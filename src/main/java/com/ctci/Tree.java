package com.ctci;

import com.equals3.legacy.algorithms.trees.Node;

public class Tree {

    private Node root;

    Tree() {
        this.root = null;
    }

    public Node find(int key) {
        // find node with given key
        // assumes non empty tree
        Node localRoot = root;
        while (localRoot.iData != key) {
            if (key < localRoot.iData) {
                // go left
                localRoot = localRoot.leftChild;
            } else {
                // go right
                localRoot = localRoot.rightChild;
            }
            if (localRoot == null) {
                // didnt find it
                return null;
            }
        }
        return localRoot;
    }

    public void insert(int key) {
        Node newNode = new Node();
        newNode.iData = key;
        if (root == null) {
            // if empty
            root = newNode;
        } else {
            // search a place to insert , start at root
            Node localRoot = root;
            Node parent;
            while (true) { // should exists internelly
                parent = localRoot;
                if (key < localRoot.iData) { // go left
                    localRoot = localRoot.leftChild;
                    if (localRoot == null) {
                        // place to insert
                        parent.leftChild = newNode;
                        return;
                    }
                } // if go left ends
                else {
                    // else go right
                    if (key > localRoot.iData) {
                        localRoot = localRoot.rightChild;
                        if (localRoot == null) {
                            // place to insert
                            parent.rightChild = newNode;
                            return;
                        }

                    }

                }
            } // end while

        }
    }

    public boolean delete(int key) {
        // delete node with given key
        // (assumes non-empty list)
        Node localRoot = root;
        Node parent = root;
        boolean isLeftChild = true;
        // find the node to be deleted
        while (localRoot.iData != key) {
            parent = localRoot;
            if (key < localRoot.iData) {
                // go left
                isLeftChild = true;
                localRoot = localRoot.leftChild;
            } else {
                isLeftChild = false;
                localRoot = localRoot.rightChild;
            }
            if (localRoot == null) {
                // end of line , didnt find node
                return false;
            }
        } // end while , localRoot should point to elem to be deleted
          // if no children (leaf node) simply delete node
        if (localRoot.leftChild == null && localRoot.rightChild == null) {
            if (localRoot == root) {
                // if root node to be deleted
                root = null;
            } else if (isLeftChild) {
                // disconnect from parent
                parent.leftChild = null;
            } else {
                parent.rightChild = null;
            }
        } //
          // if no right child, replace with left subtree
        else if (localRoot.rightChild == null) {
            if (localRoot == root) {
                root = localRoot.leftChild;

            } else if (isLeftChild)
                parent.leftChild = localRoot.leftChild;
            else
                parent.rightChild = localRoot.leftChild;
        }
        // if no left child, replace with right subtree
        else if (localRoot.leftChild == null) {
            if (localRoot == root) {
                root = localRoot.rightChild;

            } else if (isLeftChild)
                parent.leftChild = localRoot.rightChild;
            else
                parent.rightChild = localRoot.rightChild;
        }
    }

    public void traverse(int traverseType) {

        switch (traverseType) {
        case 1:
            System.out.println("pre order traversal");
            preOrder(this.root);
            break;

        case 2:
            System.out.println("IN order traversal");
            inOrder(this.root);
            break;
        case 3:
            System.out.println("post order traversal");
            postOrder(this.root);
            break;
        }
        System.out.println();
    }

    private void postOrder(Node root) {
        if (root != null) {
            postOrder(root.leftChild);
            postOrder(root.rightChild);
            System.out.println(root.iData + " ");

        }
    }

    private void inOrder(Node root) {
        if (root != null) {
            inOrder(root.leftChild);
            System.out.println(root.iData + " ");
            inOrder(root.rightChild);
        }
    }

    private void preOrder(Node root) {

        if(root !=null){
        System.out.println(root.iData);
        preOrder(root.leftChild);
        preOrder(root.rightChild);
        }
    }
}