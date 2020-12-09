

/* you only have to complete the function given below.  
Node is defined as  

class Node {
    int data;
    Node left;
    Node right;
}

*/

    public static void postOrder(Node root) {
        if(root.right!=null&&root.left!=null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
        }else if(root.right!=null&&root.left==null){
            postOrder(root.right);
            System.out.print(root.data+" ");
        }else if(root.right==null&&root.left!=null){
            postOrder(root.left);
            System.out.print(root.data+" ");
        }else if(root.right==null&&root.left==null){
            System.out.print(root.data+" ");
        }
    }

