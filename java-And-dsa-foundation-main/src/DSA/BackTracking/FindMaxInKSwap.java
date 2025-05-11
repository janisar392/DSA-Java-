package DSA.BackTracking;

public class FindMaxInKSwap {
    static String max= "";

    public static String findMaximumNum(String str , int k){
        max = str;
        findMaximumHelper(str.toCharArray() , k , 0);
        return max;
    }

    private static void findMaximumHelper(char[] chars , int k , int idx){
        if(k == 0 || idx == chars.length) return;

        char maxDigit = chars[idx];
        for(int i = idx+1 ; i< chars.length ;i++){
            if(chars[i] > maxDigit){
                maxDigit = chars[i];
            }
        }
        if(maxDigit != chars[idx]){
            k--;
        }

        for(int i = chars.length-1 ; i>= idx; i--){
            if(chars[i] == maxDigit){
                swap(chars , idx , i);
                String curr = new String(chars);
                if(curr.compareTo(max) > 0){
                    max =curr;
                }
                findMaximumHelper(chars , k , idx+1);

                swap(chars, idx, i);
            }
        }
    }
    private static void swap(char[] chars , int i , int j){
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}
