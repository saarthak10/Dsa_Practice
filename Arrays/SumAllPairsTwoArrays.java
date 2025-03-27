package Arrays;


/// Question : Sum of All pairs between two arrays
public class SumAllPairsTwoArrays {
    
    public static void sumAllPairs(int[] givenFirstArray, int[] givenSecondArray){
        int sumOfAllPairs = 0;
        for(int i=0; i< givenFirstArray.length; i++){
            for(int j=0; j<givenSecondArray.length; j++){
                sumOfAllPairs = sumOfAllPairs + givenFirstArray[i] + givenSecondArray[j];
            }
        }
        System.out.println("SUM OF ALL PAIRS BETWEEN ARRAYS ===> " + sumOfAllPairs);
    }


    public static void main(String[] args){
        int[] arr = {1,2,3};
        int[] arrTow = {4,5,6};
        sumAllPairs(arr, arrTow);
    }
}
