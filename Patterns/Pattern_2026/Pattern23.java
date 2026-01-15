package Patterns.Pattern_2026;

public class Pattern23 {
    /*
        n=4
        Print following pattern
        - - - 1
        - - 1 2
        - 1 2 3
        1 2 3 4
    */
    public static void printPattern(int n){
        for(int i=0;i<n;i++){
           for(int j=0;j<= n-i-1;j++){
                System.out.print(" ");
           }
           for(int k= 1;k <= i+1;k++){
                System.out.print(k);
           }
           System.out.println();
        }
    }

    /*
        Pattern for N = 4
        4444
        333
        22
        1
    
    */
    public static void printNextPattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=n-i-1;j++){
                System.out.print(n-i);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // printPattern(4);
        printNextPattern(4);
    }
}
