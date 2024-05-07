
package Pattern.Pantagone;

/*
        A  
      B A  
    C B A  
  D C B A  
E D C B A 

*/
public class Example22 {
    public static void main(String[] args) {
        int row=5;
        
        int k=65;
       // int k = 64+i;
        
        for(int i=1;i<=row;i++){
            
            for(int j=1;j<=(row-i);j++){
                System.out.print(" "+" ");
            }
            char c=(char)k;
            
            for(int j=1;j<=i;j++){
                System.out.print(c+" ");
                c--;
            }
            System.out.println(" ");
            k++;
        }
    }
     
    
}
