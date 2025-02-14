public class Calculate {
    public  double performCalculation(double Num_01,double Num_02, char Operator) throws Exception {
        double result=0;
        switch (Operator){
            case '+' :
                result = Num_01 + Num_02 ;
                break;
            case '-' :
                result = Num_01 - Num_02 ;
                break;
            case '*' :
                result = Num_01 * Num_02;
                break;
            case  '/':
                result = Num_01 / Num_02;
                break;
            default:
               throw  new Exception("Invalid Operation");
        }



        return  result;
    }

    public void showMessage(){
        System.out.println("Hello India");
    }
}
