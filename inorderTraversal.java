

/* you only have to complete the function given below.  
Node is defined as  

class Node {
    int data;
    Node left;
    Node right;
}

*/

    public static void inOrder(Node root) {
        if(root.left!=null&&root.right!=null){
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }else if(root.left==null&&root.right!=null){
            System.out.print(root.data+" ");
            inOrder(root.right);
        }else if(root.left!=null&&root.right==null){
            inOrder(root.left);
            System.out.print(root.data+" ");
        }else{
            System.out.print(root.data+" ");
        }

    }


