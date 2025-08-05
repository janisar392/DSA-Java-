package DSA.DP.LCS;

import java.util.*;

public class printAllLCS {

    public static List<String> allLCS(String s1, String s2) {
        int n = s1.length(), m = s2.length();
        int[][] dp = new int[n + 1][m + 1];

        // Build DP Table
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1))
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                else
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }

        // Memoization map: key = "i#j"
        Map<String, Set<String>> memo = new HashMap<>();
        Set<String> result = backtrack(s1, s2, n, m, dp, memo);

        return new ArrayList<>(new TreeSet<>(result));
    }

    static Set<String> backtrack(String s1, String s2, int i, int j, int[][] dp, Map<String, Set<String>> memo) {
        if (i == 0 || j == 0) {
            Set<String> base = new HashSet<>();
            base.add("");
            return base;
        }

        String key = i + "#" + j;
        if (memo.containsKey(key))
            return memo.get(key);

        Set<String> res = new HashSet<>();

        if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
            Set<String> temp = backtrack(s1, s2, i - 1, j - 1, dp, memo);
            for (String str : temp)
                res.add(str + s1.charAt(i - 1));
        } else {
            if (dp[i - 1][j] == dp[i][j])
                res.addAll(backtrack(s1, s2, i - 1, j, dp, memo));
            if (dp[i][j - 1] == dp[i][j])
                res.addAll(backtrack(s1, s2, i, j - 1, dp, memo));
        }

        memo.put(key, res);
        return res;
    }

    public static void main(String[] args) {
        String s1 = "abaaa", s2 = "baabaca";
        List<String> ans = allLCS(s1, s2);
        for (String str : ans)
            System.out.println(str);
    }
}

