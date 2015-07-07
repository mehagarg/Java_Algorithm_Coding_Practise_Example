package dataStructure;

import java.util.HashMap;


//http://www.programcreek.com/2014/05/leetcode-implement-trie-prefix-tree-java/



public class ImplementTrieNode_Prefix_Tree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public class TrieNode{
		char c;
		boolean isLeaf;
		HashMap<Character, TrieNode> children = new HashMap<Character, TrieNode>();
		
		public TrieNode() {}
		
		public TrieNode(char c){
			this.c = c;
		}
	}
	
	public class TrieMethods{
		private TrieNode root;
		
		public TrieMethods(){
			root = new TrieNode();
		}
		
		public void insert(String word){
			HashMap<Character, TrieNode> children = root.children;
			for(int i=0; i<word.length(); i++){
				char c = word.charAt(i);
				TrieNode t;
				
				if(children.containsKey(c)){
					t = children.get(c);
				} else{
					t = new TrieNode(c);
					children.put(c, t);
				}
				
				children = t.children;
				
				if(i == word.length() -1){
					t.isLeaf = true;
				}
			}
			
			
		}
		
		
		
		public TrieNode searchNode(String word){
			HashMap<Character, TrieNode> children = root.children;
			TrieNode t = null;
			for(int i=0; i<word.length(); i++){
				char c = word.charAt(i);
				if(children.containsKey(c)){
					t = children.get(c);
					children = t.children;
				} else{
					return  null;
				}
			}
			return t;
		}
		
		public boolean search(String word){
			TrieNode t = searchNode(word);
			if(t!= null && t.isLeaf){
				return true;
			}
			else 
				return false;
		}
		
		 public boolean startsWith(String prefix) {
		        if(searchNode(prefix) == null) 
		            return false;
		        else
		            return true;
		    }
		
	}

}
