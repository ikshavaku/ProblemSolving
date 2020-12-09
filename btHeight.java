

	/*
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	public static int height(Node root) {
      	// Write your code here.
          int count=0;
          while(root.left != null || root.right != null){
              if(root.right != null){
                  root=root.right;
                  count+=1;
              }else if(root.left != null){
                  root=root.left;
                  count+=1;
              }
          }
        return count;
    }


