package DSA.HashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestString {
    class Solution {
        public String longestString(String[] words) {
            Arrays.sort(words); // Sort lexicographically
            Set<String> built = new HashSet<>();
            String res = "";

            for (String word : words) {
                if (word.length() == 1 || built.contains(word.substring(0, word.length() - 1))) {
                    built.add(word);
                    if (word.length() > res.length() ||
                            (word.length() == res.length() && word.compareTo(res) < 0)) {
                        res = word;
                    }
                }
            }

            return res;
        }
    }

}
