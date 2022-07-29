package com.gl.Transaction.Model;

public class Model {
	
	public Node node;
    public Node headNode = null;
    public Node prevNode = null;

    public void btToSkewed(Node root) {
    	
    	//Right Skewed Implementation
    	
        if(root == null) {
            return;
        }
        
        btToSkewed(root.left);
        
        Node rightNode = root.right;
       
        if(headNode == null) {
            headNode = root;
            root.left = null;
            prevNode = root;
        }
        else {
            prevNode.right = root;
            root.left = null;
            prevNode = root;
        } 

        btToSkewed(rightNode);
        
    }
    
    public void traverseSkewed(Node root) {
       
    	if(root == null) {
            return;
        }
        
    	System.out.print(root.key + " ");
        
    	traverseSkewed(root.right);    
        
    }
	
}