package Binary.Search;

import Binary.Node;

public class BinarySearchTree {

Node root;

// Constructor for BST =>initial empty tree

BinarySearchTree() {root = null;}

/** function to insert input key in the given root. this returns the inserted node.
 inputs: Given node, given key
 output: Inserted Node
**/
Node insert_Recursive(Node root, int key){
	// Base case, empty root; in this case input key would be the root
	if(root ==null){
		root = new Node(key);
	return root ; }
	
	// if input key is smaller then key of the given node
	if(key < root.key){
		root.left = insert_Recursive(root.left,key);
	} else if (key > root.key ) {
		root.right = insert_Recursive(root.right,key);
	}
	
	return root;
}

/******* TO BE TESTED
Node insert_Recursive_Improvised(Node root, int key){
	
	while(root !=null) {
		if (key < root.key) {
			root.left = insert_Recursive_Improvised(root.left, key);
		} else if (key > root.key) {
			root.right = insert_Recursive_Improvised(root.right, key);
		} else root = new Node(key);
	}
	return root;
}

 
 ****/
// creating wrapper functions so that static method can call
void insert(int key){ root = insert_Recursive(root, key);}

public static void main (String[] args){
	
	System.out.println("Hello World");
	
	BinarySearchTree bst = new BinarySearchTree();
	
	bst.insert(5);
	
	
}


}
