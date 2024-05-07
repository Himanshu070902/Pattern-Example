
package Pattern.Pantagone;
/*
        A  
      A B  
    A B C  
  A B C D  
A B C D E  
*/

public class Example15 {
    public static void main(String[] args) {
        int row=5;
        char c='A';
        for (int i = 1; i <=row; i++) {
           
            
            for (int j = 1; j <=(row-i); j++) {
                
                 System.out.print(" "+" ");
            }
            for (int k = 1; k <=i; k++) {
                System.out.print( c+" ");
                c++;
                
            }System.out.println(" ");
           c='A';
    
}
    }
}