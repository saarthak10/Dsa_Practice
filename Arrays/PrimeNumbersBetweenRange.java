package Arrays;

public class PrimeNumbersBetweenRange {
    
    public static void primeNumbersBetweenRange(int min, int max){

        for(int j = min; j<= max; j++){

            int num = j;
            int divisibilityCount = 0;
            for(int i=1; i<= num; i++){
                if(num%i == 0){
                    divisibilityCount++;
                }
            }
            if(divisibilityCount == 2){
                System.out.println("Prime Numbers are====> " +  num);
            }
        }
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7, 9,9,6,2,2};
        primeNumbersBetweenRange(11,23);
    }
}
