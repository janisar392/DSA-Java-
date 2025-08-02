package GeeksForGeeks;

import java.util.HashMap;

public class CountBalanced {

    public int countBalanced(String[] arr){
        int ans =0;
        int n = arr.length;
        int vowel =0;
        int consonant =0;
        HashMap<Integer, Integer> diffMap = new HashMap<>();

        for(int i =0 ; i< arr.length ; i++){
            for(char c : arr[i].toCharArray()){
                if(isVowel(c)){
                    vowel++;
                }else{
                    consonant++;
                }
            }
            int diff = vowel-consonant;
            ans += diffMap.getOrDefault(diff,0);
            diffMap.put(diff,diffMap.getOrDefault(diff,0)+1);
        }
        return ans;
    }

    public static boolean isVowel(char c){
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') return true;
        return false;
    }
}
