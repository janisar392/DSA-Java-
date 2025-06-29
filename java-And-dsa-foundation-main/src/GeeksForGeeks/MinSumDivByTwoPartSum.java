package GeeksForGeeks;

import java.util.Arrays;

public class MinSumDivByTwoPartSum {
    public static String minSum(int[] arr){

        Arrays.sort(arr);
        StringBuilder num1 = new StringBuilder();
        StringBuilder num2 = new StringBuilder();

        for(int i =0 ; i< arr.length ; i++){
            if( i % 2== 0){
                num1.append(arr[i]);   // even
            }
            else{
                num2.append(arr[i]);   // odd
            }
        }
        return addString(num1.toString() , num2.toString());
    }

    public static String addString(String num1 , String num2){
        StringBuilder ans = new StringBuilder();

        int i = num1.length()-1 ,j = num2.length()-1 , carry =0 ;

        while(i >= 0 || j >= 0 || carry!=0){
            int x = (i >=0) ? num1.charAt(i--) -'0' : 0 ;
            int y = (j >=0) ? num2.charAt(j--) -'0' : 0 ;
            int sum = x + y + carry;
            ans.append(sum % 10);
            carry = sum/10;
        }

        while(ans.length() > 1 && ans.charAt(ans.length()-1)=='0'){
            ans.deleteCharAt(ans.length()-1);
        }
        return ans.reverse().toString();
    }
}
