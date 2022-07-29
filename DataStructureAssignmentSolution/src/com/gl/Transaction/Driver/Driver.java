package com.gl.Transaction.Driver;

import com.gl.Transaction.Model.Model;
import com.gl.Transaction.Model.Node;

public class Driver {
	
	public static void main(String[] args) {
		
		Model tree = new Model();
		
		tree.node = new Node(50);
		tree.node.left = new Node(30);
		tree.node.right = new Node(60);
		tree.node.left.left = new Node(10);
		tree.node.right.left= new Node(55);
		
		tree.btToSkewed(tree.node);
		tree.traverseSkewed(tree.headNode);
		
	}

}