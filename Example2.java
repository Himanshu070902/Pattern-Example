
package Pattern.Pantagone;


/*
output 
* * * * *  
* * * * *  
* * * * *  
* * * * *  
* * * * *  

*/

import java.util.*;


public class Example2 {
    public static void main(String[] args) {
        
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of starts ");
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
            {
                System.out.print("* ");
            }System.out.println(" ");
        }
        
                
    }
}
