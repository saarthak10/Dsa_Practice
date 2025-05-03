package HackerRank;
/*
 * 
 * Question Link:-  https://www.hackerrank.com/challenges/beautiful-days-at-the-movies/problem?isFullScreen=true
 * 
 * Abeautiful Number is a number in which i- reverse(i) is divisble by k.
 */
public class BeautifulDays {

    public static int findReverse(int n){
       int reverse =0;
        while(n!=0){
            reverse = reverse*10 + n%10;
            n= n/10;
       }
        return reverse; 
    }
    public static int beautifulDays(int i, int j, int k){
        int beautifulNumberCount = 0;
        for(int startDay = i;startDay<=j; startDay++ ){
            int reverse = findReverse(startDay);
            int difference = startDay - reverse;
            if(difference%k==0){
                beautifulNumberCount++;
            }
        }
        System.out.println("NUMBER COUNT====>" + beautifulNumberCount);
        return beautifulNumberCount;
    }

    public static void main(String[] args) {
        beautifulDays(20, 23, 6);
    }
}
