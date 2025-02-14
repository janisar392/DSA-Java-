public class LogicalOperation {
    public static void main(String[] args) {
        int p=20, q=15, r=9;

//        && operaator


        System.out.println(p > q && q > r );
        System.out.println(p > q && q < r );
        System.out.println(p < q && q < r );


//        || operator

        System.out.println(p > q || q > r );
        System.out.println(p > q || q < r );
        System.out.println(p < q || q < r );

//        ! operator

        System.out.println(!(p > q));
        System.out.println(!(p < q ));

    }
}
