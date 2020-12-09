import java.util.*;
import java.io.*;

class Node {
    Node left;
    Node right;
    int data;
    
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Solution {

	/*
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	public static Node lca(Node n, int v1, int v2) {
      	// Write your code here.
        while (n != null) {
            if (n.data > v1 && n.data > v2) {
                n = n.left;
            } else if (n.data < v1 && n.data < v2) {
                n = n.right;
            } else {
                break;
            } 
        }
        return n;
    }

	public static Node insert(Node root, int data) {
