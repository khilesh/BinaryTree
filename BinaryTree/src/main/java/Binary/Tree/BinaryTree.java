package Binary.Tree;


import Binary.Node;

public class BinaryTree {
  Node root;

BinaryTree() {
	root = null;
}


void  printInorder(Node node) {
	if(node == null){ return;}
	
	printInorder(node.left);
	
	System.out.println(node.key + "Node key");
	
	printInorder(node.right);
}

void printPreorder(Node node){
if(node == null) return;
	System.out.println(node.key + "Node key PreOrder");
	printPreorder(node.left);
	printPreorder(node.right);
	
}

void printPostorder(Node node){
	if(node == null) return;
	printPostorder(node.left);
	printPostorder(node.right);
	System.out.println(node.key + "Node key PostOrder");
}
// Wrappers over above recursive functions

void printInorder() {printInorder(root);}
void printPostorder() {printPostorder(root);}
void printPreorder() {printPreorder(root);}

public static void main(String[] args){
	
	BinaryTree tree = new BinaryTree();
	tree.root = new Node(1);
	tree.root.left = new Node(2);
	tree.root.right = new Node(3);
	tree.root.left.left = new Node(4);
	tree.root.left.right = new Node(5);
	
	
	System.out.println("Inorder traversal of Binary Tree is ::" );
	tree.printInorder();
	tree.printPreorder();
	tree.printPostorder();
}


}