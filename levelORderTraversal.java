

	/* 
    
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	public static void levelOrder(Node root) {
        Queue<Node> q = new LinkedList<Node>();
        Node tempNode=root;
        while(tempNode!=null){
            System.out.print(tempNode.data+" ");
            if(tempNode.left!=null){
                q.add(tempNode.left);
            }
            if(tempNode.right!=null){
                q.add(tempNode.right);
            }
            tempNode=q.poll();
        }
    }


