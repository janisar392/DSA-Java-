package DSA.Graph.MST;
import java.util.*;

public class MergingAccount {

    // User function Template for Java


        static int[] parent;

        static int find(int u) {
            if (parent[u] != u)
                parent[u] = find(parent[u]);
            return parent[u];
        }

        static void union(int u, int v) {
            int pu = find(u);
            int pv = find(v);
            if (pu != pv) {
                parent[pu] = pv;
            }
        }

        public List<List<String>> mergeDetails(List<List<String>> details) {
            int n = details.size();
            parent = new int[n];
            for (int i = 0; i < n; i++) parent[i] = i;

            HashMap<String, Integer> mapMailNode = new HashMap<>();

            // Map emails and union indexes
            for (int i = 0; i < n; i++) {
                for (int j = 1; j < details.get(i).size(); j++) {
                    String mail = details.get(i).get(j);
                    if (!mapMailNode.containsKey(mail)) {
                        mapMailNode.put(mail, i);
                    } else {
                        union(i, mapMailNode.get(mail));
                    }
                }
            }

            // Collect emails under ultimate parent
            ArrayList<String>[] mergeMail = new ArrayList[n];
            for (int i = 0; i < n; i++) mergeMail[i] = new ArrayList<>();

            for (Map.Entry<String, Integer> entry : mapMailNode.entrySet()) {
                String mail = entry.getKey();
                int node = entry.getValue();
                int root = find(node);
                mergeMail[root].add(mail);
            }

            List<List<String>> ans = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (mergeMail[i].isEmpty()) continue;
                Collections.sort(mergeMail[i]);  // Sort emails
                List<String> temp = new ArrayList<>();
                temp.add(details.get(i).get(0));  // Add name
                temp.addAll(mergeMail[i]);        // Add sorted emails
                ans.add(temp);
            }

            return ans;
        }
}
