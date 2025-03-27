package Arrays;

import java.text.NumberFormat.Style;

public class MaximumPairSum {
    
    public static void maxPairTwoArrays(int[] givenFirstArray, int[] givenSecondArray){
        int maxSum= 0;
        int firstValue=0;
        int secondValue =0;
        for(int i=0;i<givenFirstArray.length;i++){
            for(int j=0; j<givenSecondArray.length; j++){
                int currentSum = givenFirstArray[i] + givenSecondArray[j];
                if(currentSum > maxSum){
                    maxSum = currentSum;
                    firstValue = givenFirstArray[i];
                    secondValue= givenSecondArray[j];
                }

            }

        }

        System.out.println("MAXIMUM SUM IS ====> " + maxSum);
        System.out.println("PAIR VALUES ARE " + firstValue + ',' + secondValue);
    }


    public static void main(String[] args){
        int[] arr = {1,2,3,4};
        int[] arrTow = {4,5,6,7};
        maxPairTwoArrays(arr, arrTow);
    }
}
