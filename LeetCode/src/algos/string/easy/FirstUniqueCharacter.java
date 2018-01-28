package algos.string.easy;

/*
Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode",
return 2.
Note: You may assume the string contain only lowercase letters.
 */

public class FirstUniqueCharacter {
	public int firstUniqChar(String s) 
    {
      char[] alphabets = new char[26];
        
      char[] str = s.toCharArray();
        
      for(int i=0;i<str.length;i++)
      {
          alphabets[str[i]- 'a']++;
      }
        
       for(int i=0;i<str.length;i++)
      {
         if(alphabets[str[i] - 'a'] == 1)
         {
             return i;
         }
      }
        
        return -1;
    }
}
