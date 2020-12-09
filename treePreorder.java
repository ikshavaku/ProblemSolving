

/* you only have to complete the function given below.  
Node is defined as  

class Node {
    int data;
    Node left;
    Node right;
}

*/

    public static void preOrder(Node root) {
        if(root.left == null && root.right==null){
            System.out.print(root.data+" ");
        } else if(root.left == null && root.right!=null){
            System.out.print(root.data+" ");
            preOrder(root.right);
        } else if(root.left != null && root.right==null){
            System.out.print(root.data+" ");
            preOrder(root.left);
        } else{
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }


