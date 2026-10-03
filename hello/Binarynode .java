    class Binarynode {
    int data;
    Node left;
    Node right;

     Node(int data) {
        this.data = data;
        this.left = null;
        this.right=null;
    }
}

class BinaryTreeExample {
    Node root;
    public static void main(String args[])
    {
    BinaryTreeExample n=new BinaryTreeExample();
    n.root=new Node(10);
    n.root.left=new Node(20);
    n.root.left.left=new Node(40);
    n.rootleft.right=new Node(50);
    n.root.right=new Node(30);
    System.out.println("Successfully Insert");
    }
}