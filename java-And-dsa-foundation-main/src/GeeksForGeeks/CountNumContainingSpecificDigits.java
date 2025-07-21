package GeeksForGeeks;

public class CountNumContainingSpecificDigits {
    public int countValid(int n, int[] arr) {
        boolean[] isRequired = new boolean[10];
        for(int num : arr){
            isRequired[num] = true;
        }
        int allowedDigit =0 ;
        int allowedDigitEx0 = 0;

        for(int i =0 ; i<= 9 ; i++){
            if(!isRequired[i]){
                allowedDigit++;
                if(i != 0){
                    allowedDigitEx0++;
                }
            }
        }
        int totalDigit = (int) (9 * Math.pow(10,n-1));

        int invalidCount =0;
        if(allowedDigitEx0 > 0){
            invalidCount = (int) (allowedDigitEx0 * Math.pow(allowedDigit ,n-1));
        }
        return totalDigit - invalidCount;
    }
}
