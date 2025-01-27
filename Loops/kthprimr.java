public class kthprimr {
    public static void main(String[] args) {
       int   k =10;

       for(int j = 1; j<=k; j++){
          int count = 0;
        for(int i =1; i<=j; i++){
            if(j % i == 0){
                count++;
            }
            
        }
        if(count == 2){
            System.out.print(j + " ");
            
        }
       }
       }
       
    }

