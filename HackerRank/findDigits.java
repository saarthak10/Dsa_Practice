package HackerRank;
/*
 * Question Link :-  https://www.hackerrank.com/challenges/find-digits/problem?isFullScreen=true
 * 
 * 
 * 
 */
public class findDigits {
    
    public static int findDigits(int n){
        int digitsCount = 0;
        int actualNumber = n;
        int quotient = n;
        while(quotient >0){
           int remainder = quotient%10;
           if(remainder !=0){
               if(actualNumber%remainder == 0){
                digitsCount++;
               } 
           }
           quotient = quotient/10;
        }
        System.out.println("DIGITS COUNT=====>" + digitsCount);
        return digitsCount;

    }

    public static void main(String[] args) {
        findDigits(124);
    }
}
