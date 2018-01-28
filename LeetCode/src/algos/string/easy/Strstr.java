package algos.string.easy;

/*
 Implement strStr().

Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Example 1:

Input: haystack = "hello", needle = "ll"
Output: 2
Example 2:

Input: haystack = "aaaaa", needle = "bba"
Output: -1
 */

public class Strstr 
{
	//Brute - force approach
    public int strStr(String haystack, String needle)
    {
        
        char[] h = haystack.toCharArray();
        char[] n = needle.toCharArray();
        
        int start_h = 0;
        int start_n = 0;
        
         if(needle.isEmpty()||(haystack.isEmpty()&&needle.isEmpty()))
        {
            return 0;
        }
       
         if(haystack.isEmpty())
         {
             return -1;
         }
              
        while(start_h<h.length && start_n<n.length)
        {
            
            if(h[start_h] == n[start_n])
            {
                start_h++;
                start_n++;
            }
            else if(start_n>0)
            {
                start_h = start_h - start_n + 1;
                start_n = 0;
                
            }
            else
            {
                start_h++;
            }
        }
        
        if(start_n!=n.length)
        {
            return -1;
        }
        else
        {
            return start_h-n.length;
        }   
    }
}
