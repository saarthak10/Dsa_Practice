package Patterns;

public class Pattern7 {
    /*
     *           *
     *         * * *
     *       * * * * *
     *     * * * * * * *
     *   * * * * * * * * *
     */
    public static void printPattern(int n){
        
        // 1.) No of Rows = 5
        for( int i =0; i<n; i++){
            // loop for printing space
            for(int j=0;j < n-i -1 ; j++){
                System.out.print("a");
            }

            for(int k = 0 ; k < 2*i +1; k++){
                System.out.print("*");
            }

            for(int l= 0;l< n-i-1; l++){
                System.out.print("o");
            }
            System.out.println();
        }     
    }

    public static void main(String[] args){
        printPattern(6);
    }
}
