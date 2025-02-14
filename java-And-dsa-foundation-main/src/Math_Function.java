 public class Math_Function {
    public static void main(String[] args) {
        int p=54 , q=42 ,r=46,s=78,k=-45 ;
        int x=p+q*(r-s)*k;
        System.out.println(x);
        System.out.println(++x);
        System.out.println(Math.random());
        System.out.println(Math.random()*100); // (0 to 99)
        System.out.println(Math.sqrt(625));
        System.out.println(Math.abs(-84.4));
        System.out.println(Math.max(4 ,5));
        System.out.println(Math.min(4 ,6));
        System.out.println(4+2+"pqr");
        System.out.println("pqr"+4+2);
        boolean m = false;
        boolean n = false;
        boolean v = true;
        System.out.println(m==n==v);
    }
}
