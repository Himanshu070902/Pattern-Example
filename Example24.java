
package Pattern.Pantagone;

/*
1 2 3 4 5 4 3 2 1  
  1 2 3 4 3 2 1  
    1 2 3 2 1  
      1 2 1  
        1  
*/
public class Example24 {
    public static void main(String[] args) {
         int row=5;  
        
           
        for(int i=row; i>=1;i--){
            
            for(int j=1;j<=(row-i);j++){
                System.out.print(" "+" ");
            }           
            
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");            
            }
            for(int j=(i-1);j>=1;j--){
                System.out.print(j+" ");
            }
            System.out.println(" ");
          
        }
    }
    }
    

