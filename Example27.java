
package Pattern.Pantagone;


public class Example27 {
    public static void main(String[] args) {
        
        int row=5;
        for(int i=1;i<=row;i++){
            for(int j=(row-i) ;j>=1;j--){
                System.out.print(" "+" ");
            }
            for(int j=5;j>=row-i+1;j--){
                System.out.print(j+" ");
            }
            for(int j=row-i+2;j<=5;j++){
                System.out.print(j+" ");
            }
            System.out.println(" "+" ");
        }
        for(int i=1;i<row;i++){
            for(int j=i;j>=1;j--){
                System.out.print(" "+" ");
            }
           for(int j=row-i+1 ;j>1;j--){
                System.out.print(j+" ");
           }
             for(int j=5;j<=row-i+2;j--){
                System.out.print(j+" ");
            }
            System.out.println(" "+" ");
        }
    }
}
