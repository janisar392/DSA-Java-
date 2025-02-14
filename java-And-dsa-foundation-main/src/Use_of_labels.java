public class Use_of_labels {
    public static void main(String[] args) {

        for (int i=0 ; i <= 3 ; i++){
            for (int j=0 ; j<=3 ; j++ ){
                if (i==1 && j ==1)
                    continue;
                System.out.println(i +" "+j);
            }

        }

    }
}
