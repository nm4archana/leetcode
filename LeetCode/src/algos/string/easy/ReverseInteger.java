package algos.string.easy;

/*
Given a 32-bit signed integer, reverse digits of an integer.
Example 1:

Input: 123
Output:  321
Example 2:

Input: -123
Output: -321
Example 3:

Input: 120
Output: 21
Note:
Assume we are dealing with an environment which could only hold integers within 
the 32-bit signed integer range. For the purpose of this problem, assume that 
your function returns 0 when the reversed integer overflows.

*/

public class ReverseInteger {
	public int reverse(int m) 
    {
        
        long res = 0;
        
        while(m!= 0)
        {
            res = res * 10 + (m%10);
            
            if(res > Integer.MAX_VALUE || res < Integer.MIN_VALUE)
            {
                return 0;
            }
            
            m = m/10;
        }
        
        return (int)res;
    }
}
