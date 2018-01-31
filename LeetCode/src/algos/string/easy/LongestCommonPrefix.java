package algos.string.easy;

import java.util.HashMap;
import java.util.Map;

public class LongestCommonPrefix
{
	/** Data Structure for TrieNode */
	class TrieNode {
		Map<Character, TrieNode> map;
		boolean isEnd;

		public TrieNode() {
			map = new HashMap<Character, TrieNode>();
			isEnd = false;
		}
	}

	private final TrieNode root;

	/** Initialize your data structure here. */
	public LongestCommonPrefix() {
		root = new TrieNode();
	}

	/** Inserts a word into the trie. */
	public void insert(String word) {
		TrieNode curr = root;

		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			TrieNode node = curr.map.get(ch);

			if (node == null) {
				node = new TrieNode();
				curr.map.put(ch, node);
			}

			curr = node;
		}

		curr.isEnd = true;
         
	}

	

 public String longestCommonPrefix(String[] strs) 
    {
              for(int i=0;i<strs.length;i++)
              {
               if(strs[i].length()==0)
               {
                   return "";
               }   
               insert(strs[i]);
              }
                TrieNode curr = root;
                StringBuilder str = new StringBuilder();
     
                 while(curr.map.size()==1&&curr.isEnd!=true)
                 {      
                      char ch = (Character)curr.map.keySet().toArray()[0];
                      str.append(ch); 
                      curr = (TrieNode)curr.map.values().toArray()[0];
                      
                 }
       return str.toString();
           
    }
}
