package com.gl.Transaction.Model;

public class Node {
	
	int key;
	public Node left;
	public Node right;
	
	public Node(int key) {	
		this.key = key;
		left = null;
		right = null;
	}
	
}