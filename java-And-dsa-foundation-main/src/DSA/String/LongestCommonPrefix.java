package DSA.String;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] str){
        String prefix = str[0];

        for(int i =0 ; i < str.length ;i++){
            while(str[i].indexOf(prefix)!= 0){
                prefix = prefix.substring(0,prefix.length()-1);

                if(prefix.isEmpty()){
                    return "";
                }
            }
        }
        return prefix;
    }
}
