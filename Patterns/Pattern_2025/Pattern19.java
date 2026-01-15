package Patterns.Pattern_2025;

public class Pattern19 {

    /*
     *            ******
     *            **  **
     *            *    *
                  *    *
                  **  **
                  ****** 
     *          n= 3
     */

    public static void printPattern(int n){
            int initSpace = 0;
          // upper half done
            for(int i =0; i< n ; i++){
                // star
                for(int j=1; j <= n -i ; j++){
                    System.out.print("*");
                }
                // space
                for(int j=0 ; j<initSpace; j++){
                    System.out.print(" ");
                }
                // star
                for(int j=1; j <= n -i ; j++){
                    System.out.print("*");
                }
                initSpace = initSpace +2;
                System.out.println();
            }

            // lower half
            int space = 2*(n-1);
            for(int i = 0; i< n  ; i++){
                // Print number
                for(int j = 0; j<=i; j++){
                    System.out.print("*");
                }
                // Print space
                for(int k = 0; k< space; k++){
                    System.out.print(" ");
                }
                // Print number
                for(int l = i; l>= 0; l--){
                    System.out.print('*');
                }
                space = space -2;
                System.out.println();
    
            }
    }
    public static void main(String[] args) {
        printPattern(5);
    }
    
}
