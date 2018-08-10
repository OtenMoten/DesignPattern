package Kompositum_BinaryTree;

interface BinSearchTree {

    boolean isEmpty();

    boolean isIn(Integer inputInteger);

    BinSearchTree insert(Integer objNewBinarySearchTree);

    void inOrder();

    void preOrder();

    void postOrder();
}

class EmptyTree implements BinSearchTree {

    private static EmptyTree objEmptyTree = new EmptyTree();

    private EmptyTree() {
    }

    public static EmptyTree Instance() {
        return objEmptyTree;
    }

    @Override
    public boolean isEmpty() {
        return true;
    }

    @Override
    public boolean isIn(Integer inputInteger) {
        return false;
    }

    @Override
    public BinSearchTree insert(Integer objNewBinarySearchTree) {
        return new Node(objNewBinarySearchTree);
    }

    @Override
    public void inOrder() {
    }

    @Override
    public void preOrder() {
    }

    @Override
    public void postOrder() {
    }

}
