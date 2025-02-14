package DSA.Array;

class Arraysexample {

    void searchinArray(){
        int arr[] = { 1,5,12,45,3,14,12,25,14,96,34,24,19,21 ,14 ,21};
        int x = 14 ;

        int ans = -1 ;

        for ( int i = 0 ; i < arr.length ; i++){
            if (arr[i]== x){
                ans = i ;
                break;
            }
        }
        if (ans == -1)
        {
        System.out.println("Answer not found");
        }else {
            System.out.println("Found  " + x + " at index " + ans );
        }

    }



    void MaxOfArray(){
        int[] arr = {5,8,2,3,8,15,18,2,45,13,19} ;
        int ans = 0 ;

        for (int i = 0 ; i < arr.length; i++){
            if ( arr[i] > ans ){
                ans = arr[i];
            }
        }
        System.out.println("Maximum value " + ans);
    }

    void sumOfArray(){
        int[] arr = { 4 ,5 ,2 ,1, 1};
        int sum = 0;
        for (int i = 0 ; i < arr.length ; i++){
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }

    void multiArray(){

        int[][] arr = {{45,56,89},{78,58,2},{28,2,6,},{12,45,78}};

        for (int i = 0 ; i < arr.length ; i++){
            for (int j = 0 ; j< arr[i].length ; j++){
                System.out.println("these value print from 2-D arry in loop : "+ i  +" and "+ j + " :"+arr[i][j]);
            }
        }

        System.out.println(arr[0][0]); //45
        System.out.println(arr[0][1]); //56
        System.out.println(arr[0][2]); //89
        System.out.println(arr[1][2]); //2
        System.out.println(arr[2][2]); //6
    }
    void demoArrays(){
        int[] ages = new int[3];
        float[] weights = new float[3];
        String[] names =new String[3];
        String[] names_1 = {"hello","hi" ,"asslamalikum"} ;
        System.out.println("length of array names_1 is : " + names_1.length);



        ages[0] = 23;
        ages[1] = 56;
        ages[2] = 89;
        for (int i =0 ; i < ages.length ; i++){
            System.out.println("print ages through for loop : "+i+ " is  :" +ages[i]);
        }
           // now from for each loop , in for each loop all  the array will print
         for ( int age : ages){
             System.out.println(" Age print through for each loop "+age);
         }
          // now from while loop
        int i = 0;
         while (i<3){
             System.out.println("Age print through while loop "+ i +":"+ ages[i]);
             i++;
         }



        // weights
        weights[0] =66;
        weights[1] =55;
        weights[2]= 45;

        //string
        names[0] = "janisar" ;
        names[1] = "Akhtar";
        names[2] = "Katihar";
        
        System.out.println("length of ages is "+ages.length);
        System.out.println("length of weights is "+weights.length);
        System.out.println("length of names is "+names.length);

        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);

        System.out.println(weights[0]);
        System.out.println(weights[0]);
        System.out.println(weights[0]);

        System.out.println(names_1[0]);
        System.out.println(names_1[1]);
        System.out.println(names_1[2]);

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);

    }
}
public class Main {
    public static void main(String[] args) {
    Arraysexample obj = new Arraysexample();



        obj.demoArrays();


// below line  System.out.println("from below multi array"); only for understand
        System.out.println(" --------below results from multi array--------");


        obj.multiArray();

        // small questions
       System.out.println("------------------arr ques --------------");


        obj.sumOfArray();

        // question
        System.out.println("-----------------Maximum value -------------");


       obj.MaxOfArray();


        obj.searchinArray();
    }
}

