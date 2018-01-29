package algos.binarytree.easy;

import java.util.Stack;

public class PreOrderTraversal 
{
	private class BinaryTreeNode
	{
		int val;
		BinaryTreeNode left;
		BinaryTreeNode right;
		
		public BinaryTreeNode(int val) 
		{
			this.val = val;
			left = null;
			right = null;
		}
	}
 
	//Recursive Implementation
	 public void preorderTraversalR(BinaryTreeNode root) 
	  {
		  if(root!=null) 
		  {
		  System.out.println(root.val);
		  preorderTraversalR(root.left);
		  preorderTraversalR(root.right);
		  }
		   
	  }
	 
	 
	//Iterative Implementation	
	 public void preorderTraversalI(BinaryTreeNode root) 
	  {
	      Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
	      stack.add(root);
	      BinaryTreeNode curr = stack.peek();
	      System.out.println(curr.val);
 		 
	      while(!stack.isEmpty()) 
	      {
	    	  	    	 
	    	  if(curr.left!=null) 
	    	  { 
	    	     curr = curr.left;
	    	     System.out.println(curr.val);
	    		 stack.add(curr);
	    	  }
	    	  else 
	    	  {
	    		  curr = stack.pop();
	    		  if(curr.right!=null) 
	    		  {
	    		  curr = curr.right;
	    		  System.out.println(curr.val);
	    		  stack.add(curr);
	    		  
	    		  }
	    	  }
	    	  

	      }
		 
	  }
	 
	 
	 public static void main(String[] args) 
	  {
		  PreOrderTraversal preorderTraversal = new PreOrderTraversal();
		  BinaryTreeNode root = preorderTraversal.new BinaryTreeNode(1);
		  root.left =  preorderTraversal.new BinaryTreeNode(2);
		  root.right =  preorderTraversal.new BinaryTreeNode(3);
		  root.left.left =  preorderTraversal.new BinaryTreeNode(4);
		  root.left.right =  preorderTraversal.new BinaryTreeNode(5);
		  root.right.left =  preorderTraversal.new BinaryTreeNode(6);
		  root.right.right =  preorderTraversal.new BinaryTreeNode(7);
		  System.out.println("PreOrder Traversal using recursion:");
		  preorderTraversal.preorderTraversalR(root);
		  System.out.println("\nPreOrder Traversal using iteration:");
		  preorderTraversal.preorderTraversalI(root);
	  }
	
}
