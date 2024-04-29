package Patterns;


/**
 * PatternOne
 */
public class Pattern1 {
    public void printPattern(){
       for(int i = 0; i<=5 ; i++){
            for(int j = 0; j<=5; j++){

                System.out.print("*");
            }
           System.out.println();
       }
    }
     public static void main(String[] args) {
        Pattern1 obj = new Pattern1();

        obj.printPattern();
     }    
}



