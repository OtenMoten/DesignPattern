package Kompositum_BinaryTree;

public class Node implements BinSearchTree {

    Integer nodeID;
    BinSearchTree objLeftBinarySearchTree;
    BinSearchTree objRightBinarySearchTree;
    // int steps;

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
                this.objLeftBinarySearchTree = this.objLeftBinarySearchTree.insert(objNewInteger);
                break;
            case 0:
                break;
            case +1: // 'this.nodeID' is higher >> Put lower 'objNewInteger' in the right root
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
    public void inOrder() {
        
        // sorted
        if (this.objRightBinarySearchTree != null) {
            ((BinSearchTree) this.objRightBinarySearchTree).inOrder();
        }
        
        System.out.print(nodeID + " ");
        
        //'if' matches everytime
        if (this.objLeftBinarySearchTree != null) {
            //if it's a Node '.inOrder()' will recursive executed
            //if it's a Empty-Tree '.inOrder()' will do nothing
            ((BinSearchTree) this.objLeftBinarySearchTree).inOrder();
        }
        
    }
    
    @Override
    public void preOrder() {

        // Wurzelknoten
        // linker Teilbaum - rechter Teilbaum
        
        // Print the 'nodeID' before the ordering
        System.out.print(nodeID + " ");

        if (this.objRightBinarySearchTree != null) {
            ((BinSearchTree) this.objRightBinarySearchTree).preOrder();
        }

        if (this.objLeftBinarySearchTree != null) {
            ((BinSearchTree) this.objLeftBinarySearchTree).preOrder();
        }

    }

    @Override
    public void postOrder() {

        // linker Teilbaum - rechter Teilbaum
        // Wurzelknoten
        
        if (this.objRightBinarySearchTree != null) {
            ((BinSearchTree) this.objRightBinarySearchTree).postOrder();
        }

        if (this.objLeftBinarySearchTree != null) {
            ((BinSearchTree) this.objLeftBinarySearchTree).postOrder();
        }

        // Print the 'nodeID' after the ordering
        System.out.print(nodeID + " ");

    }

}