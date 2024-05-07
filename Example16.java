
package Pattern.Pantagone;
/*
        E  
      E D  
    E D C  
  E D C B  
E D C B A  

*/

public class Example16 {
    public static void main(String[] args) {
        int row=5;
        char c='E';
        for (int i = 1; i <=row; i++) {
                       
            for (int j = 1; j <=(row-i); j++) {
                
                 System.out.print(" "+" ");
            }
            for (int k = 1; k <=i; k++) {
                System.out.print( c+" ");
                c--;
                
            }System.out.println(" ");
            c='E';
    
        }
   }
    
}
