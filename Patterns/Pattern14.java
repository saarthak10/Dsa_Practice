package Patterns;

public class Pattern14 {
     /*
     *   
     * A
     * A B
     * A B C
     * A B C D
     * A B C D E
     *       n=5
     */
    public static void printPattern(int n){ 
        
        for(int i = 1; i<= n ; i++){
            char value = 'A';
            for(int j =1; j<=i; j++){
                System.out.print(value + " ");
                value++;
            }
            System.out.println();

        }
    }

    public static void main(String[] args){
        printPattern(5);
    }
}
