package Arrays;

public class SumAllPairs {
    
    public static void sumAllPairs(int[] givenArray){
        int sumOfAllPairs = 0;
        for(int i = 0; i< givenArray.length; i++){
            for(int j=i+1; j<givenArray.length; j++){
                sumOfAllPairs = sumOfAllPairs + givenArray[i] + givenArray[j]; 
            }
        }    
        System.out.println("SUM OF ALL PARIS IS====> "+ sumOfAllPairs);
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        int[] arr1 = {1};
        sumAllPairs(arr);
    }
}
