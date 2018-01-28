package algos.string.easy;

/*
 Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

For example,
"A man, a plan, a canal: Panama" is a palindrome.
"race a car" is not a palindrome.

Note:
Have you consider that the string might be empty? This is a good question to ask during an interview.

For the purpose of this problem, we define empty string as valid palindrome.
 */


public class ValidPalindrome {
	public boolean isPalindrome(String s) {
        if(s == null)
        {
            return true;
        }
        
        char[] str = s.toCharArray();
        
        int start = 0;
        int end = str.length - 1;
        
        while(start<end)
        {
             if(!Character.isLetterOrDigit(str[start]))
             {
                 start ++ ;
                 continue;
             }
            if(!Character.isLetterOrDigit(str[end]))
             {
                 end -- ;
                 continue;
             }
            
            if(Character.toLowerCase(str[start]) != Character.toLowerCase(str[end]))
            {
                return false;
            }
                
            start ++ ;
            end --;
        }
            return true;
    }
}
