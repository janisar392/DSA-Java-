package DSA.Recursion;

import java.util.TreeSet;

public class StringSubsequenceGame {

    static TreeSet<String> allPossibleSubsequences(String s) {
        TreeSet<String> ans = new TreeSet<>();
        generate(ans, 0, s, new StringBuilder());
        return ans;
    }

    private static void generate(TreeSet<String> ans, int i, String s, StringBuilder curr) {
        // Base case
        if (i == s.length()) {
            if (curr.length() > 0) {
                String str = curr.toString();
                if (isVowel(str.charAt(0)) && !isVowel(str.charAt(str.length() - 1))) {
                    ans.add(str);
                }
            }
            return;
        }

        // include s[i]
        curr.append(s.charAt(i));
        generate(ans, i + 1, s, curr);
        curr.deleteCharAt(curr.length() - 1);

        // exclude s[i]
        generate(ans, i + 1, s, curr);
    }

    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
