
package Pattern.Pantagone;

import java.util.*;

/*
output

a 
a a 
a a a 
a a a a 
a a a a a 
*/
public class Example8 {
    public static void main(String[] args) {
        int row;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter no ");
        row=sc.nextInt();
       // char k=65;
        char k='a';
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                
                
                System.out.print( k+" ");
            }System.out.println("");
        }
        
        
    }
    
}
