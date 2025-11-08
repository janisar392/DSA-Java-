package DSA.Recursion;

import java.util.*;

public class GenerateBinaryStrings {

    public static List<String> generateBinaryStrings(int n) {
        List<String> ans = new ArrayList<>();
        generate(ans, "", n, '0'); // assume prev = '0' for starting
        return ans;
    }

    private static void generate(List<String> ans, String curr, int n, char prev) {
        if (curr.length() == n) {
            ans.add(curr);
            return;
        }

        generate(ans, curr + "0", n, '0');

        if (prev != '1') {
            generate(ans, curr + "1", n, '1');
        }
    }
}
