package Patterns;

public class Pattern2 {
    public static void printPattern(){
        for(int i=0; i< 5; i++){
              for(int j=0 ; j <=i; j++){
                System.out.print("*");
              }  
              System.out.println();
        }
    }
    public static void main(String[] args){
        printPattern();
    }
}
