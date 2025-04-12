package HackerRank;

public class Staircase {

   public static void printStaircase(int n){

    for(int i=0; i< n; i++){
        for(int j=1; j<= n-i -1; j++){
            System.out.print(" ");
        }
        for(int k=0; k<=i; k++){
            System.out.print("#");
        }
        System.out.println();
    }

   }
   
   
    public static void main(String[] args){

        printStaircase(5);

    }
}