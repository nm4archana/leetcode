package algos.binarytree.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class LevelOrderTraversal 
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
	
	public ArrayList<ArrayList<Integer>> levelOrderTraversal(BinaryTreeNode root) 
	{
		if(root == null) 
		{
		  return null;	
		}
		
		Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
		queue.add(root);
		
		int count = queue.size();
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> tempRes = new ArrayList<Integer>();
		
		while(!queue.isEmpty()) 
		{
			
			BinaryTreeNode curr = queue.poll();
			tempRes.add(curr.val);
			
			count = count-1;
			
			if(curr.left!=null) 
			{
				queue.add(curr.left);
			}
			
			if(curr.right!=null) 
			{
				queue.add(curr.right);
			}
		
			if(count == 0) 
			{
				count = queue.size();
				res.add(tempRes);
				tempRes = new ArrayList<Integer>();
			}		
		}
		
		return res;
	}
	
	public static void main(String arfs[]) 
	{
	  LevelOrderTraversal levelorderTraversal = new LevelOrderTraversal();
	  BinaryTreeNode root = levelorderTraversal.new BinaryTreeNode(1);
	  root.left =  levelorderTraversal.new BinaryTreeNode(2);
	  root.right =  levelorderTraversal.new BinaryTreeNode(3);
	  root.left.left =  levelorderTraversal.new BinaryTreeNode(4);
	  root.left.right =  levelorderTraversal.new BinaryTreeNode(5);
	  root.right.left =  levelorderTraversal.new BinaryTreeNode(6);
	  root.right.right =  levelorderTraversal.new BinaryTreeNode(7);
	  
	  System.out.println("Level Order Traversal\n");
	  ArrayList<ArrayList<Integer>> res =  levelorderTraversal.levelOrderTraversal(root);
	  
	  for(int i=0;i<res.size();i++) 
	  {
		  System.out.println("Level "+(i+1));
		  ArrayList<Integer> tempRes = res.get(i);
		  System.out.println(tempRes+"\n");
		 
           
	  }
	  
		
	}
}
