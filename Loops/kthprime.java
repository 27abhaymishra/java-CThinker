public class kthprime {
    public static void main(String[] args) {
        int n = 1 , k =5;

       while(k > 0){
        int count = 0;
        for(int i =1; i<=n; i++){
            if(n % i == 0){
                count++;
            }
            
        }
        if(count == 2){
            k--;
        }
        n++;
       }
       System.out.println(n-1);
    }
}
