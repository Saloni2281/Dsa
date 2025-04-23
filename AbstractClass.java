import java.util.*;

class Node {
	int data;
	Node left;
	Node right;

	Node(int val) {
		data=val;
		left=right=null;
	}
}
class Main
{
	/*----------------Height--------------------------*/
	public static int height(Node root) {
		if(root==null) return 0;
		int leftHeight=height(root.left);
		int rightHeight=height(root.right);
		return Math.max(leftHeight,rightHeight)+1;
	}

	/*----------------Count of Nodes(recursive)-------------------*/
	public static int numberOfNodes(Node root) {
		if(root==null) return 0;
		return 1+numberOfNodes(root.left)+numberOfNodes(root.right);
	}

	/*---------------Check value-------------------------------*/
	public static boolean checkValue(Node root,int target) {
		if(root==null) return false;
		if(root.data==target) return true;
		return checkValue(root.left,target) || checkValue(root.right,target);
	}

	/*----------Count leaf nodes-------------------------*/
	public static int countLeafNode(Node root) {
		if(root==null) return 0;
		if(root!=null && root.left==null && root.right==null) return 1;
		return countLeafNode(root.left)+countLeafNode(root.right);
	}

	/*------------Printing level------------------------------*/
	public static void printLevel(Node root,int level) {
		if(root==null) return;
		if(level==1) {
			System.out.print(root.data+" ");
		} else {
			printLevel(root.left,level-1);
			printLevel(root.right,level-1);
		}
	}

	/*-------------------Sum Of Nodes---------------------------*/
	public static int sumOfNodes(Node root) {
		if(root==null) return 0;
		return root.data+sumOfNodes(root.left)+sumOfNodes(root.right);
	}

	/*----------------Node insertion----------------------------*/
	public static boolean insert(Node root, int val) {
	    if (root == null) return false;

	    if (root.left == null) {
	        root.left = new Node(val);
	        return true;
	    }
	    if (root.right == null) {
	        root.right = new Node(val);
	        return true;
	    }
	    boolean inserted = insert(root.left, val);
	    if (!inserted) {
	        inserted = insert(root.right, val);
	    }
	    return inserted;
	}
// 	public static void insert(Node root,Node x) {
// 		if(root==null) return;

// 		if(root.left!=null&&root.right==null) {
// 			root.right=x;
// 			return;
// 		}
// 		if(root.left==null&&root.right!=null) {
// 			root.left=x;
// 			return;
// 		}
// 		insert(root.left,x);
// 		insert(root.right,x);
// 	}
	public static void printTree(Node root) {
		int h = height(root);
		for (int i = 1; i <= h; i++) {
			printLevel(root, i);
		}
		System.out.println();
	}


	public static void main(String[] args) {
		Node root=new Node(10);
		root.left=new Node(20);
		root.right=new Node(30);
		root.left.left=new Node(40);
		root.left.right=new Node(50);
		System.out.println("Height of the tree is:"+height(root));
		System.out.println("Number of nodes are: "+numberOfNodes(root));
		System.out.println("Is the number present in tree or not?? "+checkValue(root,11));
		System.out.println("The leaf nodes: "+countLeafNode(root));
		System.out.print("Nodes at level 3: ");
		printLevel(root,3);
		System.out.println();
		System.out.println("The sum of nodes of the tree is: "+sumOfNodes(root));
		System.out.println("Tree before insertion:");
		printTree(root);

		insert(root,100);
        
		System.out.println("Tree after insertion: ");
		printTree(root);
	}
}

