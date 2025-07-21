package DSA.Graph.BFS_DFS_Topo;

import java.util.*;

public class Alien_Dict {
    public String findOrder(String[] words){
        Map<Character, List<Character>> adj = new HashMap<>();
        int[] inDegree = new int[26];
        boolean[] present = new boolean[26];

        for(String word : words){
            for(char ch : word.toCharArray()){
                adj.putIfAbsent(ch,new ArrayList<>());
                present[ch -'a'] = true;
            }
        }
        for(int i=0 ; i< words.length-1 ; i++){
            String w1 = words[i];
            String w2 = words[i+1];
            int minLen = Math.min(w1.length(),w2.length());
            boolean foundOrder = false;

            for(int j =0 ; j < minLen; j++){
                char c1 = w1.charAt(j);
                char c2 = w2.charAt(j);

                if(c1 != c2){
                    adj.get(c1).add(c2);
                    inDegree[c2 - 'a']++;
                    foundOrder = true;
                    break;
                }
            }
            if(! foundOrder && w1.length() > w2.length()){
                return "";
            }
        }
        Queue<Character> q = new LinkedList<>();
        for(char c : adj.keySet()){
            if(inDegree[c-'a'] == 0){
                q.add(c);
            }
        }
        StringBuilder order = new StringBuilder();
        while (!q.isEmpty()){
            char node = q.poll();
            order.append(node);

            for(char ch : adj.get(node)){
                inDegree[ch -'a']--;
                if(inDegree[ch - 'a'] == 0){
                    q.add(ch);
                }
            }
        }

        for(int i =0 ; i< 26 ; i++){
            if(present[i] && order.indexOf((char)(i +'a')+"")==-1){
                return "";
            }
        }
        return order.toString();
    }
}
