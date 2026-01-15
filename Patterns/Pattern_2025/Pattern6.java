package Patterns.Pattern_2025;
public class Pattern6 {
     /*
     *  12345
     *  1234
     *  123
     *  12 
     *  1
     */
    public static void printPattern(){
        for(int  i= 5; i>0; i--){
            for(int j = 1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        printPattern();
    }
}
