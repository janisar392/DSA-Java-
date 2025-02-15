package DSA.String;

public class palindrome {
    public static void main(String[] args) {

        String str ="abaaba";
        int i =0;
        int j=str.length()-1;
        boolean flag = true;

        while(i<=j){
            if(str.charAt(i)!= str.charAt(j)) {
                flag = false;
                break;
            }
            i++;
            j--;
        }
        if(flag==true){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a Palindrome");
        }

    }
}
