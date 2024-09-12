package TreeDSA;

public class BinaryTree {
    Node root;

    class Node {
        Node left;
        int key;
        Node right;

        Node(int data) {
            left = null;
            key = data;
            right = null;
        }
    }

    BinaryTree(int data) {
        root = new Node(data);
    }

    BinaryTree() {
        root = null;
    }

    public void insertNode(int data) {
        insertingNode(root, data);
        return;
    }

    public Node insertingNode(Node rootNode,int val)
    {
        if(rootNode == null)
            return new Node(val);
        if(rootNode.key>val)
            rootNode.left = insertingNode(rootNode.left, val);
        else
            rootNode.right = insertingNode(rootNode.right, val);
        return rootNode;
    }
    public Node searchNode(Node rootNode,int val)
    {
        if(rootNode==null || rootNode.key == val)
            return rootNode;
        if(rootNode.key>val)
            return searchNode(rootNode.left,val);
        return searchNode(rootNode.right,val);

    }
    public void deleteNode(int val)
    {
        root = deletingNode(root,val);
        return;
    }
    public Node deletingNode(Node rootNode,int val)
    {
        if(rootNode==null)
            return rootNode;
        if(rootNode.key>val)
            rootNode.left = deletingNode(rootNode.left , val);
        else if(rootNode.key<val)
            rootNode.right = deletingNode(rootNode.right , val);
        else
        {
            if(rootNode.right == null)
                return rootNode.left;
            else if(rootNode.left == null)
                return rootNode.right;
            rootNode.key = minValue(rootNode.right);
            rootNode.right = deletingNode(rootNode.right,root.key);
        }
        return rootNode;
    }
    public int minValue(Node rootNode)
    {
//        if(rootNode == null)
//            return rootNode.key;
        int min = rootNode.key;
        while(rootNode.left!=null)
        {
            min = rootNode.left.key;
            rootNode = rootNode.left;
        }
        return min;
    }
    public void displayNodes(Node rootNode)
    {
        if(rootNode!=null)
        {
            displayNodes(rootNode.left);
            System.out.print(rootNode.key+" ");
            displayNodes(rootNode.right);
        }
    }

}
