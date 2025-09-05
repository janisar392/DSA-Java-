package DSA.Trie;
import java.util.LinkedList;

class TrieNode
{
    char content;
    boolean isEnd;
    int count;
    LinkedList<TrieNode> childList;
    public TrieNode(char c)
    {
        childList = new LinkedList<TrieNode>();
        isEnd = false;
        content = c;
        count = 0;
    }
    public TrieNode subNode(char c)
    {
        if (childList != null)
            for (TrieNode eachChild : childList)
                if (eachChild.content == c)
                    return eachChild;
        return null;
    }
}
public class deleteKey {
    public static void deleteKey(TrieNode root, char[] key) {
        // add code here.
        if(root == null || key.length == 0) return;
        deleteHelper(root , key , 0);
    }

    public static boolean deleteHelper(TrieNode current , char[] key , int index){
        if(index == key.length){
            if(!current.isEnd){
                return false;
            }
            current.isEnd = false;
            current.count--;
            return current.childList.isEmpty();
        }

        char ch = key[index];
        TrieNode child = current.subNode(ch);
        if(child == null){
            return false;
        }

        boolean shouldDeleteChild = deleteHelper(child , key, index+1);

        if(shouldDeleteChild){
            current.childList.remove(child);
        }

        current.count--;
        return current.childList.isEmpty() && !current.isEnd;
    }
}
