public class sumOfdigit {
    public static void main(String[] args) {
        int n = 142; int sum = 0;
        while(n != 0){
            int rem = n % 10;
             sum +=rem;
           n =  n / 10;
        }
       if(sum % 7 == 0){
        System.out.println("true");
       }else{
        System.out.println("Flase");
       }
    }
}
