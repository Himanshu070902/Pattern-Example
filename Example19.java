
package Pattern.Pantagone;

/*
        A  
      A B  
    A B C  
  A B C D  
A B C D E  
*/
public class Example19 {
    public static void main(String[] args) {
        int row=5;
       
        for (int i = 1; i <=row; i++) {
                   char c='A';     
            for (int j = 1; j <=(row-i); j++) {
                
                 System.out.print(" "+" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print( c+" ");
                c++;
                
            }
            System.out.println(" ");
        
            }
   }
      
    
}
