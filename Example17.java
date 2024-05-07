
package Pattern.Pantagone;
/*
1 
1 2 
1 2 4 
1 2 4 8 
1 2 4 8 16 
1 2 4 8 
1 2 4 
1 2 
1 
*/

public class Example17 {
    public static void main(String[] args) {
        int rows=5;
    
        for (int i = 0; i < rows; i++) {
            int num = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(num+ " ");
                num *= 2;
            }
            System.out.println();
        }

        for (int i = rows - 2; i >= 0; i--) {
            int num = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num *= 2;
            }
            System.out.println("");
    }
  }
}


