package algos.binarytree.easy;

import java.util.Stack;

public class InorderTraversal 
{
  //Visit Left, Root, Right
 	
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
  public void inorderTraversalR(BinaryTreeNode root) 
  {
	  if(root!=null) 
	  {
	  inorderTraversalR(root.left);
	  System.out.println(root.val);
	  inorderTraversalR(root.right);
	  }
	   
  }	
	
 //Iterative Implementation	
  public void inorderTraversalI(BinaryTreeNode root) 
  {
	  Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
	  stack.add(root);
	  BinaryTreeNode curr = stack.peek(); 
		
	  while(!stack.isEmpty()) 
	  {
		    if(curr.left!=null) 
		  {
			  stack.add(curr.left);
			  curr = curr.left;
		  }
		  else 
		  {
			  curr = stack.pop();
			  System.out.println(curr.val);
			  if(curr.right!=null) 
			  {
				  stack.add(curr.right);
				  curr = curr.right;
			  }	  
			  
		  }
	  }
	  

  }	
  
  public static void main(String[] args) 
  {
	  InorderTraversal inorderTraversal = new InorderTraversal();
	  BinaryTreeNode root = inorderTraversal.new BinaryTreeNode(1);
	  root.left =  inorderTraversal.new BinaryTreeNode(2);
	  root.right =  inorderTraversal.new BinaryTreeNode(3);
	  root.left.left =  inorderTraversal.new BinaryTreeNode(4);
	  root.left.right =  inorderTraversal.new BinaryTreeNode(5);
	  root.right.left =  inorderTraversal.new BinaryTreeNode(6);
	  root.right.right =  inorderTraversal.new BinaryTreeNode(7);
	  System.out.println("Inorder Traversal using recursion:");
	  inorderTraversal.inorderTraversalR(root);
	  System.out.println("\nInorder Traversal using iteration:");
	  inorderTraversal.inorderTraversalR(root);
  }
	

}
