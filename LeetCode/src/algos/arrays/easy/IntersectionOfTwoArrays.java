package algos.arrays.easy;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfTwoArrays
{
	  public static int[] intersect(int[] nums1, int[] nums2) {
	        
	        List<Integer> list = new ArrayList<Integer>();
	        List<Integer> result = new ArrayList<Integer>();
	        
	        
	       for(int i=0;i<nums1.length;i++)
	       {
	               list.add(nums1[i]);
	       }
	        
	        for(int j=0;j<nums2.length;j++)
	        {
	            if(list.contains(nums2[j]))
	            {
	                result.add(nums2[j]);
	            }
	        }
	       int[] arr = new int[result.size()];
	        
	        for(int i=0;i<result.size();i++)
	        {
	            arr[i] = result.get(i);
	        }
	        
	        return arr;
	    }
	  
	  public static void main(String[] args) 
	  {
		  int[] nums1 =  {1};
		  int[] nums2 = {1};
		  
		  intersect(nums1,nums2);
	  }
}
