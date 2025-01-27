public class lcm {
    public static void main(String[] args) {
        int a = 18 , b = 10; 
        int i = Math.min(a, b); 
       
        while(i>=0){
            if(a % i == 0 && b % i == 0){
               
           System.out.println((a*b)/i);
        break;
               
            }
            i--;
        }
        
    }
}
