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

    // This kind of design makes it not possible to create a object of a EmptyTree-class.
    // The user can only create a instance of the EmptyTree-class because the constructor is private.
    // The instance, which the user can create with the function '.createInstance()',
    // can be put in a BinSearchTree-variable because the EmptyTree-class implements 
    // the BinSearchTree-interface as you can see on the keyword 'implements'.
    // Therefore, the EmptyTree-class act like a proxy.
    // The 'static' keyword ensures that all the created instances share the same memory space.
    // From there, all the new Node-objects of the Node-class 
    // are created with the function '.insert(Integer objNewBinarySearchTree)'.
    private static EmptyTree objEmptyTree = new EmptyTree();
    private EmptyTree() {}
    
    // Just a variable
    static int counter = 0;

    public static EmptyTree createInstance() {
        counter++; // Count +1 every time a instance was created.
        return objEmptyTree;
    }

    // Function must also be static to access the static variable 'counter'.
    public static int getCountOfInstances() {
        return counter;
    }
    
    @Override
    public boolean isEmpty() {
        return true;
    }

    @Override
    public boolean isIn(Integer inputInteger) {
        return false;
    }

    // If the user is trying to execute this function on a EmptyTree-instance
    // then a new Node-object (from class 'Node') is created and returned.
    // A Node-object contains logically a left and a right EmptyTree-instance
    // where the user can put in again a new Node-object and so on ...
    // It's endless.
    @Override
    public BinSearchTree insert(Integer objNewBinarySearchTree) {
        return new Node(objNewBinarySearchTree);
    }

    // Here, it makes no sense to define a sort alogrithm for a 'empty tree'
    @Override
    public void inOrder() {
    }

    // Here, it makes no sense to define a sort alogrithm for a 'empty tree'
    @Override
    public void preOrder() {
    }

    // Here, it makes no sense to define a sort alogrithm for a 'empty tree'
    @Override
    public void postOrder() {
    }

}
