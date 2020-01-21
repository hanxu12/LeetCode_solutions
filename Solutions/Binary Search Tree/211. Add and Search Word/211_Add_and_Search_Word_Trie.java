class WordDictionary {
	TrieNode root;
	public class TrieNode {
		TrieNode[] link;
		private boolean isEnd;

		public TrieNode() {
			link = new TrieNode[26];
			isEnd = false;
		}

		public boolean containsKey(char ch) {
			return link[ch - 'a'] != null;
		}

		public TrieNode get(char ch) {
			return link[ch - 'a'];
		}

		public void put(char ch, TrieNode node) {
			link[ch - 'a'] = node;
		}

		public void setEnd() {
			isEnd = true;
		}

		public boolean checkEnd() {
			return isEnd;
		}
	}
    /** Initialize your data structure here. */
    public WordDictionary() {
        root = new TrieNode();
    }
    
    /** Adds a word into the data structure. */
    public void addWord(String word) {
        TrieNode ptr = root;
        for (int i = 0; i < word.length(); i++) {
        	char ch = word.charAt(i);
        	if (!ptr.containsKey(ch)) {
        		ptr.put(ch, new TrieNode());
        	} 
        	ptr = ptr.get(ch);
        }
        ptr.setEnd();
    }
    
    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    public boolean search(String word) {
    	if (word == null || word.length() == 0) {
    		return false;
    	}
    	return dfs(word, root, 0);
    }

    public boolean dfs(String word, TrieNode node, int index) {
    	if (index == word.length()) {
    		return node.checkEnd();
    	}
    	char ch = word.charAt(index);
    	if (ch == '.') {
    		for (int i = 0; i < 26; i++) {
    			if (node.link[i] != null) {
    				if (dfs(word, node.link[i], index + 1)) {
    					return true;
    				}
    			}
    		}
    		return false;
    	} else {
    		if (node.link[ch - 'a'] != null) {
    			if (dfs(word, node.get(ch), index + 1)) {
    				return true;
    			}
    		}
    		return false;
    		//return node.link[ch - 'a'] != null && dfs(word, node.get(ch), index + 1);
    	}
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */