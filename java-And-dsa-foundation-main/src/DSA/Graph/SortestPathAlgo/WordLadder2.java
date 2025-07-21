package DSA.Graph.SortestPathAlgo;

import java.util.*;

public class WordLadder2 {
    public ArrayList<ArrayList<String>> findSequences(String startWord, String targetWord, String[] wordList) {
        Set<String> wordSet = new HashSet<>(Arrays.asList(wordList));
        ArrayList<ArrayList<String>> result = new ArrayList<>();

        // Step 1: BFS to find the shortest path tree
        Map<String, List<String>> graph = new HashMap<>(); // word → previous words
        Map<String, Integer> levels = new HashMap<>(); // word → level from start

        Queue<String> queue = new LinkedList<>();
        queue.offer(startWord);
        levels.put(startWord, 0);

        int wordLength = startWord.length();

        while (!queue.isEmpty()) {
            String current = queue.poll();
            int currentLevel = levels.get(current);

            // Try changing each character
            for (int i = 0; i < wordLength; i++) {
                char[] chars = current.toCharArray();
                for (char c = 'a'; c <= 'z'; c++) {
                    chars[i] = c;
                    String nextWord = new String(chars);

                    if (wordSet.contains(nextWord)) {
                        // First time visiting or same level (used by other shortest paths)
                        if (!levels.containsKey(nextWord)) {
                            levels.put(nextWord, currentLevel + 1);
                            queue.offer(nextWord);
                        }

                        if (levels.get(nextWord) == currentLevel + 1) {
                            graph.computeIfAbsent(nextWord, k -> new ArrayList<>()).add(current);
                        }
                    }
                }
            }
        }

        // Step 2: Backtrack from target to start using graph
        if (!levels.containsKey(targetWord)) return result; // No path

        LinkedList<String> path = new LinkedList<>();
        dfs(result, path, graph, targetWord, startWord);

        return result;
    }

    private void dfs(List<ArrayList<String>> result, LinkedList<String> path, Map<String, List<String>> graph,
                     String currentWord, String startWord) {
        path.addFirst(currentWord);

        if (currentWord.equals(startWord)) {
            result.add(new ArrayList<>(path)); // Found one path
        } else {
            for (String prev : graph.getOrDefault(currentWord, new ArrayList<>())) {
                dfs(result, path, graph, prev, startWord);
            }
        }

        path.removeFirst(); // Backtrack
    }
}
