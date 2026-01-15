package Patterns.Pattern_2025;

public class Pattern12 {
     /*
     *   
     * 1             1
     * 1 2         2 1
     * 1 2 3     3 2 1
     * 1 2 3 4 4 3 2 1
     *       n=4
     */
    public static void printPattern(int n){ 
        int space = 2*(n-1);
        for(int i = 0; i< n ; i++){
            // Print number
            for(int j = 0; j<=i; j++){
                System.out.print(j +1);
            }
            // Print space
            for(int k = 0; k< space; k++){
                System.out.print(" ");
            }
            // Print number
            for(int l = i; l>= 0; l--){
                System.out.print(l +1);
            }
            space = space -2;
            System.out.println();

        }
    }

    public static void main(String[] args){
        printPattern(5);
    }
}
