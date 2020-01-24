//208. Implement Trie (Prefix Tree)
class Trie {

class TrieNode {
    private TrieNode[] links;
    private final int R = 26;
    private boolean isEnd;

    public TrieNode() {
        links = new TrieNode[R];
    }

    public boolean containsKey(char ch) {
        return links[ch - 'a'] != null;
    }

    public TrieNode get(char ch) {
        return links[ch - 'a'];
    }

    public void put(char ch, TrieNode node) {
        links[ch - 'a'] = node;
    }

    public void setEnd() {
        isEnd = true;
    }

    public boolean isEnd() {
        return isEnd;
    }
}

    private TrieNode root;

    public Trie(){
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode ptr = root;
        for (int i = 0; i < word.length(); i++) {
            Character tempCh = word.charAt(i);
            if (ptr.containsKey(tempCh)) {
                ptr = ptr.get(tempCh);
            } else {
                ptr.put(tempCh, new TrieNode());
                ptr = ptr.get(tempCh);
            }
        }
        ptr.setEnd();
    }

    public boolean search(String word) {
        TrieNode ptr = root;
        for (int i = 0; i < word.length(); i++) {
            Character tempCh = word.charAt(i);
            if (!ptr.containsKey(tempCh)) {
                return false;
            } else {
                ptr = ptr.get(tempCh);
            }
        }
        return ptr.isEnd();
    }

    public boolean startsWith(String prefix) {
        TrieNode ptr = root;
        for (int i = 0; i < prefix.length(); i++) {
            Character tempCh = prefix.charAt(i);
            if (!ptr.containsKey(tempCh)) {
                return false;
            } else {
                ptr = ptr.get(tempCh);
            }
        }
        return true;        
    }

}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */ 