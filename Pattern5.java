
package Pattern.Pantagone;

/*
        1  
      1 2  
    1 2 3  
  1 2 3 4  
1 2 3 4 5  

*/
public class Pattern5 {
     public static void main(String[] args) {
        int row=5;
        for (int i = 1; i <=row; i++) {           
            
            for (int j = 1; j <=(row-i); j++) {
                
                 System.out.print(" "+" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print(j+" ");
                
            }System.out.println(" ");
            
        }
    }
}
