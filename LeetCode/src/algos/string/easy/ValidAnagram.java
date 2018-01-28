package algos.string.easy;

import java.util.HashMap;
import java.util.Map;

/*
Given two strings s and t, write a function to determine if t is an anagram of s.

For example,
s = "anagram", t = "nagaram", return true.
s = "rat", t = "car", return false.

Note:
You may assume the string contains only lowercase alphabets.

Follow up:
What if the inputs contain unicode characters? How would you adapt your solution 
to such case?
*/

public class ValidAnagram 
{
	// For lowecase Alphabets
	 public boolean isAnagram(String s, String t) {
	        
	        char[] alphabets = new char[26] ;
	        
	        char[] str1 = s.toCharArray();
	        char[] str2 = t.toCharArray();
	        
	        for(int i=0;i<str1.length;i++)
	        {
	            alphabets[str1[i] - 'a'] ++;
	        }
	        
	        for(int i=0;i<str2.length;i++)
	        {
	            alphabets[str2[i] - 'a']--;
	        }
	        
	        for(int i=0;i<26;i++)
	        {
	            if(alphabets[i]!=0){return false;}
	        }
	        
	       return true;
	        
	    }
	 
	 //To handle unicode characters - I have used Map
	 
	 public boolean isAnagramUniCode(String s, String t) {
		 
		Map<Character,Integer> hashmap = new HashMap<Character,Integer>();
		char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();
        
        for(int i=0;i<str1.length;i++)
        {
           if(hashmap.get(str1[i])==null) 
           {
        	   hashmap.put(str1[i], 1);
           }
           else 
           {
        	     int temp = hashmap.get(str1[i]);
        	     temp++;
        	     hashmap.put(str1[i], temp);         
           }
        }
		
        for(int i=0;i<str2.length;i++)
        {
           if(hashmap.get(str2[i])==null) 
           {
        	   	return false;
           }
           else 
           {
        	     int temp = hashmap.get(str1[i]);
        	     temp--;
        	     if(temp == 0) 
        	     {
        	    	 hashmap.remove(str2[i]);
        	     }
        	     else {
        	     hashmap.put(str1[i], temp);     }    
           }
        }
        
        if(hashmap.size()>0) 
        {
        	return false;
        }
        
		return true;
	  
		 
	 }
	  
	 
}
