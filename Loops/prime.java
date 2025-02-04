public class prime {
    public static void main(String[] args) {
        int n = 17 , i = 1, count =0;

        while(i<=n){
            if(n % i == 0){
             count++;
            }
            i++;
        }
        System.out.println(count == 2);
      
}
}
