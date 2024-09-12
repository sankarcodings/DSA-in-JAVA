package TreeDSA;

public class BinaryTreeUsage
{
    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree(40);

//        tree.insertNode(70);
        tree.insertNode(10);
//        tree.insertNode(50);
//        tree.insertNode(30);
//        tree.insertNode(20);
//        tree.insertNode(60);

        if(tree.searchNode(tree.root,99) == null)
            System.out.println("Element Not Found --");
        else
            System.out.println("Element Found --");

        tree.displayNodes(tree.root);
        System.out.println();
        tree.deleteNode(40);
        tree.displayNodes(tree.root);
    }
}
