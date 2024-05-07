
package Pattern.Pantagone;

/*  this is output 
A  
B C  
D E F  
G H I J  
K L M N O

*/

public class Example7 {
    public static void main(String[] args) {
        int row=5;
        int k=65;
        for(int i=1;i<=row;i++){
            for(int j=1; j<=i;j++){
                char c=(char)k;
                
                System.out.print(c+" ");
                k++;
            }System.out.println(" ");
        }
    }
    
}
