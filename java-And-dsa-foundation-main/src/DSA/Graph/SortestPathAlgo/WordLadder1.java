package DSA.Graph.SortestPathAlgo;

import java.util.*;
import java.util.HashSet;

public class WordLadder1 {

    public int wordLadderLength(String startWord, String targetWord, String[] wordList) {

        Set<String> wordSet = new HashSet<>(Arrays.asList(wordList));
        if(!wordSet.contains(targetWord)) return 0;

        Queue<String> queue = new LinkedList<>();
        queue.add(startWord);

        int level =1;
        while (!queue.isEmpty()){
            int size = queue.size();
            for(int i =0 ; i< size ; i++){
                String curr = queue.poll();
                if(curr.equals(targetWord)) return level;

                for(int j =0 ; j < curr.length() ; j++){
                    char[] chars = curr.toCharArray();
                    for(char c ='a' ; c <= 'z' ; c++){
                        chars[j] =c;
                        String nextWord = new String(chars);
                        if(wordSet.contains(nextWord)){
                            queue.add(nextWord);
                            wordSet.remove(nextWord);
                        }
                    }
                }
            }
            level++;
        }
        return 0;
    }
}
