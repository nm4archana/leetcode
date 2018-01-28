package algos.string.easy;

/*
Write a function that takes a string as input and returns the string reversed.

Example:
Given s = "hello", return "olleh".
 */

public class ReverseString {
	 public String reverseString(String st) 
	    {
	       int start = 0;
	       int end = st.length() - 1;
	        char[] s = st.toCharArray();
	        while(start<end)
	        {
	            char temp = s[start];
	            s[start] =  s[end];
	            s[end] = temp;
	            
	            start ++;
	            end --;
	        }
	        
	        return  new String(s) ;
	    }
}
