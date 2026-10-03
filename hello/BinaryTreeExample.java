class Node
{
int data;
node left;
node right;
Node(Node node)
{
this.data=data;
this.left=null;
this.right=null;
}
}
 class BinaryTreeExample {
    Node root;
    
    void PreOrder(Node node) {
        if (node==null){
            return;
        
        }
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

       void InOrder(Node node )
       {
        if(node==null)
            return;
        InOrder(node.left);
        System.out.println(node.data+ " ");  
        InOrder(node.right);
    }
       boolean Search(Node node ,int target)
       {
        if(node==null)
        return false;
    if(node.data==target)
        return true;
    if(target<node.data)
        return Search(node.left,target);
    else{
        return Search(node.right,target);
    }
        
       }
    
       void TotalEle(Node node)
{       {
    if(node.left != null && node.right != null)
    {
        System.out.println(node.right.data-node.left.data);         // Ssum of element find 
    }
}
       }
    public static void main(String[] args) {
        BinaryTreeExample tree = new BinaryTreeExample();
        tree.root = new Node(40);
        tree.root.left = new Node(20);
        tree.root.left.left = new Node(10);
        tree.root.right = new Node(50);
        tree.root.right.right=new Node(60);
        tree.root.right.left = new Node(45);
        
        System.out.println("Successfully Insert");
           
        System.out.println("\n This is pre Treversal");
        tree.PreOrder(tree.root);
         System.out.println("\n This is post Treversal");
        tree.PostOrder(tree.root);
         System.out.println("\n This is In Treversal");
        tree.InOrder(tree.root);
        System.out.println("\n");
        System.out.println(tree.Search(tree.root,45));
          System.out.println(tree.Search(tree.root,45));
          tree.TotalEle(tree.root);  
    
}
}
    