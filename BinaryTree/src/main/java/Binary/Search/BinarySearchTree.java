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
	if(root ==null){ /*** ALWAYS DO*******/
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

void printInorder(Node root){
	if(root == null){ return; }
	printInorder(root.left);
	System.out.println(" Inorder Print ::" + root.key);
	printInorder(root.right);
}

void printPreorder(Node root){
	if (root == null){return;} //Base case
	System.out.println(" Preorder Print ::" + root.key);
	printPreorder(root.left);
	printPreorder(root.right);
}

void printPostorder(Node root){
	if (root == null){return ;}
	printPostorder(root.left);
	printPostorder(root.right);
	System.out.println(" PostOrder Print ::" + root.key);
}

boolean isBST(Node root, int max, int min) {
	
	if (root == null) return false;
	
	return (root.key > min &&
			root.key > max &&
			isBST(root.left, min, root.key) &&
			isBST(root.right, root.key, max));
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

/** creating wrapper functions so that static main method can call
	1. Insert - For inserting a data item
    2. Inorder Traversal
    3. Preorder Traversal
    4. Postorder Traversal
    5. Delete
    6. check if Binary tree is Binary Search tree or not.
 **/
void insert(int key){ root = insert_Recursive(root, key);}
void inOrder(){printInorder(root);}

void preOrder() {printPreorder(root);}

void postOrder() {printPostorder(root);}
boolean isValidBST() {isBST(root, Integer.MAX_VALUE, Integer.MIN_VALUE);}
public static void main (String[] args){
	
	System.out.println("Hello World");
	
	BinarySearchTree bst = new BinarySearchTree();
	
	bst.insert(50);
	bst.insert(7);
	bst.insert(10);
	bst.insert(90);
	bst.insert(45);
	bst.insert(12);
	
	bst.inOrder();
	bst.preOrder();
	bst.postOrder();
	
	bst.isValidBST();
	
//	isValidBST();
	
}


}
