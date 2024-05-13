package Patterns;

public class Pattern17 {

    /*
     *         A
     *       A B A
     *     A B C B A
     *   A B C D C B A
     *  n=4
     */
    
    public static void printPattern(int n){
        
        for(int i = 0; i<n; i++){
                //space
                for(int j = 0; j< n-i -1; j++){
                    System.out.print(" ");
                }
                //letter
                char value = 'A';
                int breakpoint = (2*i +1)/2;
                for(int k=0; k < 2*i +1; k++){
                    System.out.print(value);
                    if(k < breakpoint){
                        value ++;
                    }else{
                        value --;
                    }
                    
                }
                //space
                for(int j = 0; j< n-i -1; j++){
                    System.out.print(" ");
                }    

                System.out.println();

        }

    }
    
    
    public static void main(String[] args) {
        printPattern(4);
    }
}
