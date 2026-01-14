package Patterns.Pattern_2026;

public class Pattern21 {

    public static void printPattern(int n){
        char value = 'A';
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                value +=j;
                System.out.print(value + " ");
            }
            value++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern(4);
    }
}
