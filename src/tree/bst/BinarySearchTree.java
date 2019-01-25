package tree.bst;

public class BinarySearchTree {
    private Node root;
    
    public BinarySearchTree() {
        root = null;
    }
    
    public void insert(int i) {
        if(root!=null)
            insertNode(root,i);
        else
            root=new Node(i);
        
    }

    private void insertNode(Node head, int i) {
        if(head==null) {
             head=new Node(i);
            
        }
        else if(i < head.value ) {
            insertNode(head.left, i);
        }
        else if(i >= head.value ) {
            insertNode(head.right, i);
        }
    }

    public void inorder() {
        traverseInorder(root);
    }

    
   private void traverseInorder(Node root2) {
           if(root2!=null) {
               System.out.println(root2.value);
               traverseInorder(root2.left);
               traverseInorder(root2.right);
           }
        
    }


private static class Node{
       Node left;
       Node right;
       int value;
       
      public Node(int value){
           this.value=value;
           left=right=null;
       }
   }
}
