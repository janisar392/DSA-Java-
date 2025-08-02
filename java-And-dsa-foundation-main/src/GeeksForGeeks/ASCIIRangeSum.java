package GeeksForGeeks;
import java.util.*;
public class ASCIIRangeSum {

    public ArrayList<Integer> asciiRange(String s){

        HashMap<Character,Integer> first = new HashMap<>();
        HashMap<Character, Integer> last = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i =0 ; i< s.length() ; i++){
            char c = s.charAt(i);
            if(!first.containsKey(c)){
                first.put(c, i);
            }
            last.put(c,i);
        }
        for(char c : first.keySet()){
            int st = first.get(c);
            int end = first.get(c);

            if(end > st+1){
                int sum =0 ;
                for(int i = st+1 ; i< end ; i++){
                    sum += (int) s.charAt(i);
                }
                if(sum > 0) ans.add(sum);
            }
        }
        return ans;
    }
}
