
package Pattern.Pantagone;
/*

A 
B C 
D E F 
G H I J 
K L M N O 
P Q R S T U 
V W X Y Z [ \ 

*/
public class Example6 {
    public static void main(String[] args) {
        int row=7;
        char k = 65;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print(k+" ");
                k++;
            }System.out.println("");
        }
    }
}
