package Patterns.Pattern_2025;

public class Pattern15 {
     /*
     *   
     * A B C D E
     * A B C D
     * A B C
     * A B
     * A
     *       n=5
     */
    public static void printPattern(int n){ 
        
        for(int i = 0; i< n ; i++){
           
            // for(int j =0; j< n-i ; j++){
            //     System.out.print(value + " ");
            //     value++;
            // }
            for(char ch = 'A'; ch <= 'A' + (n-i-1); ch++){
                System.out.print(ch);
            }
            System.out.println();

        }
    }

    public static void main(String[] args){
        printPattern(5);
    }
}
