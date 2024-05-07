
package Pattern.Pantagone;

/*
output;
A 
B B 
C C C 
D D D D 
E E E E E

*/
public class Example10 {
    public static void main(String[] args) {
        
        int row=5;
         char c = 'A';
        for (int i = 1; i <=row; i++) {
           
            for (int j = 1; j <=i; j++) {
                System.out.print(c+" ");
               
            }
            System.out.println("");
       c++;
        } 
        
    }
    
}
