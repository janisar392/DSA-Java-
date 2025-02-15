package DSA.String;

public class PalindromicSubString {

    public static boolean isPalindrome(String str){
        int i = 0;
        int j = str.length()-1;
        while (i<=j){
            if(str.charAt(i)!=str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {

        String str = "abc";
        int count =0;

        for(int i = 0 ; i< str.length();i++){
            for(int j= i+1 ; j<str.length()+1 ; j++){
                if(isPalindrome(str.substring(i,j))==true){
                    System.out.print(str.substring(i,j)+" ");
                    count++;
                }
            }
        }
        System.out.println("\n Total subString is :"+count);
    }
}
