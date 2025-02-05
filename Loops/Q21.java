public class Q21 {
    public static void main(String[] args) {
        int n = 234 , m = 32,x=m;
        int digit = 0; int rev = 0;
        //calculting last digit
        // while(m>0){
        //     digit++;
        //     m/=10;
        // }
        // n =(int)Math.pow(10,digit)*n + x;
        // int dummy = n;
       
        // System.out.println(dummy);
        while(m>0){
            rev = 10 * rev + (m % 10);
            m /=10;
        }
        while(rev > 0){
            n = 10 * n + (rev % 10);
            rev /=10;
        }
        while(rev  0){
            int rem = n % 10;
             rev = rev * 10 + rem;
             n = n / 10;
        }
      int dummy = n;

        System.out.println(dummy);
       

    }
}
