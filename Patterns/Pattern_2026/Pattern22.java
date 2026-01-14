package Patterns.Pattern_2026;

public class Pattern22 {
    public static void printPattern(int n){
        char value = 'E';
        for(int i=0;i<n;i++){
            char printValue = value;
            for(int j=0;j<=i;j++){
                System.out.print(printValue + " ");
                printValue +=1;
            }
            value -=1;
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printPattern(5);
    }
}
