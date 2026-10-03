class Node
{
    int data;
    Node left;     
    Node right;     
    
    Node(int data)  
    {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BSTExample
{   Node node;
    Node insert(Node node, int data)
    {
        if(node == null)
        {
            node = new Node(data);
            return node;
        }
        
        if(data < node.data)
        {
            node.left = insert(node.left, data);
        }
        else
        {
            node.right = insert(node.right, data);
        }
        return node;  
    }

    void inOrderTraversal(Node node)  
    {
        if(node == null)
            return;
        
        inOrderTraversal(node.left);
        System.out.println(node.data);
        inOrderTraversal(node.right);
    }
     void PreOrder(Node node) {
        if (node==null)
            return;
        
    
        System.out.println(node.data+ " ");
        PreOrder(node.left);
        PreOrder(node.right);

     }

      void PostOrder(Node node)
    {
        if(node==null)
            return;
       PostOrder(node.left);
       PostOrder(node.right);
       System.out.println(node.data+" ");
       
    }

   void Leaf(Node node)
{
    if (node == null)
        return;

    if (node.left == null && node.right == null)
    {
        System.out.println(node.data); // leaf element
        return;
    }

    Leaf(node.left);
    Leaf(node.right);
}

    public static void main(String args[])
    {
      BSTExample bst = new BSTExample();
        bst.node = bst.insert(bst.node, 20); 
        bst.node = bst.insert(bst.node, 10);
        bst.node = bst.insert(bst.node, 30);
        bst.node = bst.insert(bst.node, 40);
        bst.node = bst.insert(bst.node, 50);
        System.out.println("\n In Order Treversal :");
        bst.inOrderTraversal(bst.node); 
        System.out.println("\nPreOrder :");  
        bst.PreOrder(bst.node); 
        System.out.println("\n Post Order :") ;
        bst.PostOrder(bst.node); 
        System.out.println("\nLeaf Node");
        bst.Leaf(bst.node);
}
}