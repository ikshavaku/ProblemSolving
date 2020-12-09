

 /* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;
    
    */

	public static Node insert(Node root,int data) {
        if (root==null){
            //System.out.print("null check");
            root = new Node(data);
            return root;
        }
        if(data<root.data&&root.left!=null){
            //System.out.print("in function 1");
            root.left=insert(root.left,data);
        }else if(data<root.data&&root.left==null){
            //System.out.print("in function 2");            
            Node temp = new Node(data);
            root.left=temp;
        }else if(data>root.data&&root.right!=null){
            //System.out.print("in function 3");
            root.right=insert(root.right,data);
        }else if(data>root.data&&root.right==null){
            //System.out.print("in function 4");
            Node temp = new Node(data);
            root.right=temp;
        }
        return root;
    }


