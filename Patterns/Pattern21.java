package Patterns;

public class Pattern21 {
    public static void printPattern(int n){
       
        for(int i = 1; i<=n; i++ ){

            for (int j =1; j <=n; j++){

                if (i == 1 || i == n || j==1 || j== n) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern(5);
    }
        
}
