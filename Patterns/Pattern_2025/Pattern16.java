package Patterns.Pattern_2025;

public class Pattern16 {

    /*
     * 
     *  A
     *  B B
     *  C C C
     *  D D D D
     *  E E E E E
     */
    
    public static void printPattern(int n){
        char value = 'A';
        for(int i = 0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print(value);
            }
            value++;
            System.out.println();

        }

    }
    
    
    public static void main(String[] args) {
        printPattern(5);
    }
}
