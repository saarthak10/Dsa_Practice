package Patterns.Pattern_2025;

public class Pattern5 {
     /*
     *   *****
     *   ****
     *   ***
     *   ** 
     *   *
     */
    public static void printPattern(){
        for(int  i= 5; i>0; i--){
            for(int j = 0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        printPattern();
    }
}
