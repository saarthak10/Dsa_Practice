package Patterns.Pattern_2025;

public class SquarePattern {
    

    public static void printSquare(int n){
      
        for(int i=0; i< n; i++){
           int valueToPrint = 2*i + 1;
            
            for(int j=0; j< n; j++){
                System.out.print(valueToPrint + " ");
                valueToPrint = valueToPrint + 2;
                if(valueToPrint > 2*n -1){
                    valueToPrint = 1;
                    
                }
            }
            System.out.println();
        }
        
    }
    


public static void main(String[] args) {
    printSquare(5);
}
}
