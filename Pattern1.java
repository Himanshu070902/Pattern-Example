
package Pattern.Pantagone;

/*
output 
1 
2 4 
8 16 32 
64 128 256 512 
1024 2048 4096 8192 16384 

*/
public class Pattern1 {
    public static void main(String[] args) {
        
        int i,j,val=1,pv=0,div=1;
        for(i=1;i<=5;i++){
            pv=val;
            for(j=1;j<=i;j++){
                System.out.print(val+" ");
                val*=2;                
            }
            System.out.println("");
                if(i!=5){
                div*=2;
            }
        }
        
    }
    
}
