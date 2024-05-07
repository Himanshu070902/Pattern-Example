package Pattern.Pantagone;
/*
output:
1 
2 4 
8 16 32 
64 128 256 512 
1024 2048 4096 8192 16384 
64 128 256 512 
8 16 32 
2 4 
1 
*/
public class Pattern2 {
     public static void main(String[] args) {
        
        int i,j,val=1,pv=0,div=1;
        for(i=1;i<=5;i++){
            pv=val;
            for(j=1;j<=i;j++){
                System.out.print(val+" ");
                val*=2;
                
            }System.out.println("");
            if(i!=5){
                div*=2;
            }
        }
        for(i=1;i<=4;i++){
            val=pv/div;
            pv=val;
            for(j=1;j<=5-i;j++){
                System.out.print(val+" ");
                val*=2;
            }
            div=div/2;
            System.out.println("");
        }
     }
    
}
