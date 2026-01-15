package Patterns.Pattern_2025;

public class Pattern20 {
    

    public static void printPattern(int n){
       
     

        // lower half
        int space = 2*(n -1);
       
        for(int i = 1; i<= 2*n -1  ; i++){
            int stars = i;
            if(i> n){
                stars = 2*n - i;
            }   
          
            for(int j=1 ; j<=stars;j++){
                System.out.print("*");
            }
            for(int j =1; j <=space; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=stars; j++){
                System.out.print("*");
            }
            if(i < n){
                space = space -2;
            }else{
                space = space +2;
            }
            System.out.println();
        }
}

public static void main(String[] args) {
    printPattern(5);
}
}
