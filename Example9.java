
package Pattern.Pantagone;

import java.util.*;

/*
output 
A 
A B 
A B C 
A B C D 
A B C D E 

*/
public class Example9 {
    public static void main(String[] args) {
        int row;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter no ");
        row=sc.nextInt();
       
       
        for(int i=1;i<=row;i++){
             char c='A';
             
             for(int j=1;j<=i;j++){                
                
                System.out.print( c+" ");
                c++;
            }System.out.println("");
        }
        
        
    }
    
}
