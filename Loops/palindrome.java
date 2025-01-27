public class palindrome {
    public static void main(String[] args) {
        int n = 121; int rev = 0; 
        int dummy = n;
        while(n != 0){
            int rem = n % 10;
             rev = rev * 10 + rem;
             n = n / 10;
        }
       

        if(dummy == rev){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
