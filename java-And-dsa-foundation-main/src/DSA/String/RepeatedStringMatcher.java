package DSA.String;

public class RepeatedStringMatcher {

    public int repeatedStringMatch(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int count =0;
        while (sb.length() < b.length()){
            sb.append(a);
            count++;
        }
        if(sb.toString().contains(b)) return count;
        // edge case
        sb.append(a);
        count++;

        if(sb.toString().contains(b)) return count;

        return -1;
    }
}
