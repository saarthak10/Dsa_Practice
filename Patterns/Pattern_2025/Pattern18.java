package Patterns.Pattern_2025;

public class Pattern18 {

    public static void printPattern(int n){
        /*
         *      E
         *      D E
         *      C D E
         *      B C D E
         *      A B C D E
         * n=5
         */
        char value = 'E';
        for (int i= 0; i<n; i++){
           char printLetter = value;
            for(int j = 0; j<=i; j++){
                System.out.print(printLetter + " ");
                printLetter ++;
            }
            value--;
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printPattern(5);
    }
}
