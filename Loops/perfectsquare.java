public class perfectsquare {
   public static void main(String[] args) {
    int n = 49;
  boolean ans = false;
  int i = 1; 
  while(i*i <= n){
    if(i*i == n){
        ans = true;
    }
    i++;
  }
  System.out.println(ans);
   
   } 
}
