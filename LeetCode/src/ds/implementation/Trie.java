package ds.implementation;

import java.util.HashMap;
import java.util.Map;

public class Trie {

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
	public Trie() {
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

	/** Returns if the word is in the trie. */
	public boolean search(String word) {
		TrieNode curr = root;

		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			TrieNode node = curr.map.get(ch);

			if (node == null) {
				return false;
			}

			curr = node;
		}

		if (curr.isEnd) {
			return true;
		}
		return false;
	}

	/**
	 * Returns if there is any word in the trie that starts with the given prefix.
	 */
	public boolean startsWith(String prefix) {
		TrieNode curr = root;

		for (int i = 0; i < prefix.length(); i++) {
			char ch = prefix.charAt(i);
			TrieNode node = curr.map.get(ch);

			if (node == null) {
				return false;
			}

			curr = node;
		}

		return true;
	}

	/** Delete the word in trie */
	public void deleteWord(String word) {
		TrieNode curr = root;
     
		for (int i = 0; i < word.length(); i++) 
		{
			char ch = word.charAt(i);
			TrieNode node = curr.map.get(ch);
			curr = node;
		}
			curr.isEnd = false;

	}

	public static void main(String[] args) {

		Trie obj = new Trie();
		obj.insert("Archana");
		obj.insert("Sarath");
		boolean param_2 = obj.search("Sarath");
		boolean param_3 = obj.startsWith("Ar");

		System.out.println(param_2);
		System.out.println(param_3);

	}
}
