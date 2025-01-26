public class Fibonacci {
    public static void main(String[] args) {
        int feb0 = 0; int n = 10;
        int feb1 = 1; int i = 2;
        int sum = feb0 + feb1;
   while(i<=n){
   sum = feb0 + feb1;
    feb0 = feb1;
    feb1 = sum;
    i++;
   }
   System.out.println(sum);
    }
}


