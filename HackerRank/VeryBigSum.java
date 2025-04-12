package HackerRank;

import java.util.ArrayList;

public class VeryBigSum {

    public static void calculateSum(long[] givenArray){
        long sum = 0;
        for(int i=0; i< givenArray.length; i++){
            sum = sum + givenArray[i] ;
        }
        System.out.println("THE SUM IS ===>" + sum);
    }

    public static void main(String[] args){

        long [] arr = {1000000001, 1000000002, 1000000003,1000000004,1000000005 };

        calculateSum(arr);

    }
    
}
