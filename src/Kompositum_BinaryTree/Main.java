package Kompositum_BinaryTree;

public class Main {

    public static void main(String[] args) {
		
	BinSearchTree objBinarySearchTree = EmptyTree.Instance();		
	objBinarySearchTree = fillTree(objBinarySearchTree);
	
	System.out.println(objBinarySearchTree);
	System.out.println(objBinarySearchTree.isIn(11));
		
	objBinarySearchTree.inOrder();
	System.out.println();
	objBinarySearchTree.preOrder();
	System.out.println();
	objBinarySearchTree.postOrder();
    
    }
	
    public static BinSearchTree fillTree(BinSearchTree objBinarySearchTree) { 
        return objBinarySearchTree.
                insert(6).
                insert(3).
                insert(9).
                insert(5).
                insert(11).
                insert(23).
                insert(1);
    }
	
}