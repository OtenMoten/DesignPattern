package Kompositum_BinaryTree;

public class Node implements BinSearchTree {

    Integer nodeID;
    BinSearchTree objLeftBinarySearchTree;
    BinSearchTree objRightBinarySearchTree;
    // int steps;

    public Node(Integer newNodeID) {

        this.nodeID = newNodeID;
        objLeftBinarySearchTree = EmptyTree.Instance();
        objRightBinarySearchTree = EmptyTree.Instance();

    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public BinSearchTree insert(Integer objNewInteger) {

        switch (nodeID.compareTo(objNewInteger)) {
            case -1:
                objLeftBinarySearchTree = objLeftBinarySearchTree.insert(objNewInteger);
                break;
            case 0:
                break;
            case +1:
                objRightBinarySearchTree = objRightBinarySearchTree.insert(objNewInteger);
                break;
        }
        return this;

    }

    @Override
    public boolean isIn(Integer newNodeID) {

        switch (nodeID.compareTo(newNodeID)) {
            case -1:
                return objLeftBinarySearchTree.isIn(newNodeID);
            case 0:
                return true;
            case +1:
                return objRightBinarySearchTree.isIn(newNodeID);
        }
        return false;
    }

    @Override
    public void inOrder() {

        // sortiert
        if (objRightBinarySearchTree != null) {
            ((BinSearchTree) objRightBinarySearchTree).inOrder();
        }

        System.out.print(nodeID + " ");

        if (objLeftBinarySearchTree != null) {
            ((BinSearchTree) objLeftBinarySearchTree).inOrder();
        }

    }

    @Override
    public void preOrder() {

        // Wurzelknoten
        // linker Teilbaum - rechter Teilbaum
        
        // Print the 'nodeID' before the ordering
        System.out.print(nodeID + " ");

        if (objRightBinarySearchTree != null) {
            ((BinSearchTree) objRightBinarySearchTree).preOrder();
        }

        if (objLeftBinarySearchTree != null) {
            ((BinSearchTree) objLeftBinarySearchTree).preOrder();
        }

    }

    @Override
    public void postOrder() {

        // linker Teilbaum - rechter Teilbaum
        // Wurzelknoten
        
        if (objRightBinarySearchTree != null) {
            ((BinSearchTree) objRightBinarySearchTree).postOrder();
        }

        if (objLeftBinarySearchTree != null) {
            ((BinSearchTree) objLeftBinarySearchTree).postOrder();
        }

        // Print the 'nodeID' after the ordering
        System.out.print(nodeID + " ");

    }

}