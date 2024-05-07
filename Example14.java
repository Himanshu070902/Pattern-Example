
package Pattern.Pantagone;

/*
        5  
      5 4  
    5 4 3  
  5 4 3 2  
5 4 3 2 1  
*/
public class Example14 {
     public static void main(String[] args) {
        int row=5;
        int c=5;
        for (int i = 1; i <=row; i++) {
           
            
            for (int j = 1; j <=(row-i); j++) {
                
                 System.out.print(" "+" ");
            }
            for (int k = 1; k <=i; k++) {
                System.out.print( c+" ");
                c--;
                
            }System.out.println(" ");
            c=5;
        }
    }
    
}
