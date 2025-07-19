package GeeksForGeeks;

public class VowelCount {
    public static int countVowel(String s){

        int[] volFreq = new int[5];

        for(char ch : s.toCharArray()){
            if(ch =='a') volFreq[0]++;
            else if( ch == 'e') volFreq[1]++;
            else if( ch == 'i') volFreq[2]++;
            else if( ch == 'o') volFreq[3]++;
            else if( ch == 'u') volFreq[4]++;
        }

        int uniqueVowel = 0;
        int totalSelection = 1;
        for(int freq : volFreq){
            if(freq > 0){
                uniqueVowel++;
                totalSelection *= freq;
            }
        }
        if(uniqueVowel ==0 ) return 0;
        return totalSelection * factorial(uniqueVowel);
    }

    public static int factorial(int n){
        if(n ==0 || n==1) return 1;
        return factorial(n-1) * n;
    }
}
