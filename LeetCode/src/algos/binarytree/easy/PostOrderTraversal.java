package algos.binarytree.easy;


public class PostOrderTraversal 
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
	 public void postorderTraversalR(BinaryTreeNode root) 
	  {
		  if(root!=null) 
		  {
		  postorderTraversalR(root.left);
		  postorderTraversalR(root.right);
		  System.out.println(root.val);
		  }
		   
	  }
	 
	 
	//Iterative Implementation	
	 public void postorderTraversalI(BinaryTreeNode root) 
	  {
	      //Yet to implement
	  }
	 
	 
	 public static void main(String[] args) 
	  {
		  PostOrderTraversal postorderTraversal = new PostOrderTraversal();
		  BinaryTreeNode root = postorderTraversal.new BinaryTreeNode(1);
		  root.left =  postorderTraversal.new BinaryTreeNode(2);
		  root.right =  postorderTraversal.new BinaryTreeNode(3);
		  root.left.left =  postorderTraversal.new BinaryTreeNode(4);
		  root.left.right =  postorderTraversal.new BinaryTreeNode(5);
		  root.right.left =  postorderTraversal.new BinaryTreeNode(6);
		  root.right.right =  postorderTraversal.new BinaryTreeNode(7);
		  System.out.println("PreOrder Traversal using recursion:");
		  postorderTraversal.postorderTraversalR(root);
		  System.out.println("\nPreOrder Traversal using iteration:");
		  postorderTraversal.postorderTraversalI(root);
	  }
}
