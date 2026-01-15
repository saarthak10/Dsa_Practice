package Patterns.Pattern_2025;

public class Pattern9 {
     /*
     *           *
     *         * * *
     *       * * * * *
     *     * * * * * * *
     *   * * * * * * * * *
     *   * * * * * * * * * 
     *     * * * * * * *
     *       * * * * *
     *         * * *
     *           *    
     */
    public static void printPattern(int n){

        for( int i =0; i<n; i++){
            // loop for printing space
            for(int j=0;j < n-i -1 ; j++){
                System.out.print(" ");
            }

            for(int k = 0 ; k < 2*i +1; k++){
                System.out.print("*");
            }

            for(int l= 0;l< n-i-1; l++){
                System.out.print(" ");
            }
            System.out.println();
        }  
        
        for(int i = 0 ; i < n; i++){
            //space
           for(int j=0 ; j< i; j++){
             System.out.print(" ");
           }
           // star
           for(int j=0; j< 2*n - (2*i +1); j++){
                System.out.print("*");
           }

           //space
           for(int j=0 ; j< i; j++){
             System.out.print(" ");
           }
            System.out.println();
        }
       
    }
    public static void main(String[] args){
        printPattern(5);
    }
}
