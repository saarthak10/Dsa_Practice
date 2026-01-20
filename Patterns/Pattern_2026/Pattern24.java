package Patterns.Pattern_2026;

public class Pattern24 {
    
    /*
        Pattern for N = 4
         - - - 1
         - - 2 3 2
         - 3 4 5 4 3
         4 5 6 7 6 5 4
    
    */
    public static void printPattern(int n){
        
        for(int i=0;i<n;i++){
            
            // print space
            for(int j=0;j<n-i-1;j++){
                System.out.print("- ");
            }
            
            // print numbers first (i+1) to (2i + 1)
            for(int k= i+1; k<=2*i +1;k++){
                System.out.print(k + " ");
            }

            // print numbers from (2i) to (i+1)
            for(int l=2*i;l >= i+1;l--){
                System.out.print(l + " ");    
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern(4);
    }
}
