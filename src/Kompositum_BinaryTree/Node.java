package Kompositum_BinaryTree;

public class Node implements BinSearchTree {

    Integer nodeID;
    BinSearchTree objLeftBinarySearchTree;
    BinSearchTree objRightBinarySearchTree;

    public Node(Integer newNodeID) {

        this.nodeID = newNodeID;
        this.objLeftBinarySearchTree = EmptyTree.createInstance();
        this.objRightBinarySearchTree = EmptyTree.createInstance();
        
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public BinSearchTree insert(Integer objNewInteger) {

        switch (this.nodeID.compareTo(objNewInteger)) {
            case -1: // 'this.nodeID' is lower >> Put higher 'objNewInteger' in the left root
                // The objLeftBinarySearchTree-object is type of a BinSearchTree-interface
                // and therefore, a new Node-object will be created in te left root.
                this.objLeftBinarySearchTree = this.objLeftBinarySearchTree.insert(objNewInteger);
                break;
            case 0:
                break;
            case +1: // 'this.nodeID' is higher >> Put lower 'objNewInteger' in the right root
                // The objRightBinarySearchTree-object is type of a BinSearchTree-interface
                // and therefore, a new Node-object will be created in te right root.
                this.objRightBinarySearchTree = this.objRightBinarySearchTree.insert(objNewInteger);
                break;
        }
        return this;

    }

    @Override
    public boolean isIn(Integer newNodeID) {

        switch (this.nodeID.compareTo(newNodeID)) {
            case -1:
                return this.objLeftBinarySearchTree.isIn(newNodeID);
            case 0:
                return true;
            case +1:
                return this.objRightBinarySearchTree.isIn(newNodeID);
        }
        return false;
    }

    @Override
    // Sorted (ascending) ordering.
    // Remember, the low variables are stored in the right roots and the high variables in the left root.
    // The sorting algorithm is hiself executing recursively until the final right root.
    // This is the place where the lowest variables is, and then it's printed.
    // From the last Node-object then the algorithm will recursively check the left root.
    // In this left root all the right roots will be looped like above and so on ...
    // The whole binary tree is looped and read-out from right to left.
    public void inOrder() { 
        
        // First, check the right roots.
        if (this.objRightBinarySearchTree != null) { // matches every time !!
            // If it's a Node then '.inOrder()' will be executed againg (recursive function).
            // If it's a Empty-Tree then '.inOrder()' will do nothing.
            ((BinSearchTree) this.objRightBinarySearchTree).inOrder();
        }
        
        // If there is no more variable in the right root of the last/recent node
        // then print the ID of the last/recent node.
        System.out.print(nodeID + " ");
        
        // After all variables in the right roots are printed then to algorithm
        // will start the same work in the left root of the main node on top.
        // Print all variables in the left root of the main node from right to left.
        if (this.objLeftBinarySearchTree != null) { // matches every time !!
            // If it's a Node then '.inOrder()' will be executed againg (recursive function).
            // If it's a Empty-Tree then '.inOrder()' will do nothing.
            ((BinSearchTree) this.objLeftBinarySearchTree).inOrder();
        }
        
    }
    
    @Override
    // This sorting algorithm loops from top to bottom and from right to left.
    // First, it print the ID of the Node-object then it goes in the next right root and print the
    // ID of this Node-object and so on ...
    // If there is no more right roots then the left roots will be looped through and printed.
    public void preOrder() {

        System.out.print(nodeID + " ");

        if (this.objRightBinarySearchTree != null) {
            ((BinSearchTree) this.objRightBinarySearchTree).preOrder();
        }

        if (this.objLeftBinarySearchTree != null) {
            ((BinSearchTree) this.objLeftBinarySearchTree).preOrder();
        }

    }

    @Override
    // This sorting algorithm loops from bottom to top and from right to left.
    // First, the final right Node-object is printed and then the left neighbour.
    // Next, the parent Node-object of both are printed and so on ...
    // After the whole right root of the main Node-object is looped then
    // it start again from the bottom in the left root.
    public void postOrder() {

        if (this.objRightBinarySearchTree != null) {
            ((BinSearchTree) this.objRightBinarySearchTree).postOrder();
        }

        if (this.objLeftBinarySearchTree != null) {
            ((BinSearchTree) this.objLeftBinarySearchTree).postOrder();
        }

        System.out.print(nodeID + " ");

    }

}