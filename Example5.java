
package Pattern.Pantagone;

/*
output
65 
66 67 
68 69 70 
71 72 73 74 
75 76 77 78 79 

*/
public class Example5 {
    public static void main(String[] args) {
        int row=5;
        int k=65;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print(k+" ");
                k++;
            }System.out.println("");
        }
    }
}
