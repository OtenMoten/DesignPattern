package Kompositum_BinaryTree;

public class Main {

    public static void main(String[] args) {
		
        // The objBinarySearchTree-object is type of BinSearchTree-interface.
        // Because the EmptyTree-class implements also the BinSearchTree-interface
        // we can easily put the EmptyTree-class instance in objBinarySearchTree-object.
	BinSearchTree objBinarySearchTree = EmptyTree.createInstance();
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