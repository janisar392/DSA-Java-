package GeeksForGeeks;

public class AddBinary {
    public static String addBinary(String s1 , String s2){
        StringBuilder ans = new StringBuilder();
        int i = s1.length()-1;
        int j = s2.length()-1;
        int carry =0 ;

        while(i >= 0 || j >=0 || carry !=0){
            int bit1 = (i >= 0) ? s1.charAt(i)-'0' :0;
            int bit2 = (j >= 0) ? s2.charAt(j)-'0' :0;

            int sum = bit1+bit2+carry;
            ans.append(sum%2);
            carry = sum / 2 ;
            i--;
            j--;
        }
        String res = ans.reverse().toString();
        int idx =0 ;
        while(idx < res.length()-1 && res.charAt(idx)=='0'){
            idx++;
        }
        return res.substring(idx);
    }
}
