package Arrays;

public class SumOfEvenOddIndices {
    
    public static void sumOfEvenOddIndices(int[]  givenArray){
        int evenIndicesSum = 0;
        int oddIndicesSum = 0;
        for(int i=0; i< givenArray.length; i++){
            if(i %2 ==0){
                evenIndicesSum = evenIndicesSum + givenArray[i];
            }else{
                oddIndicesSum = oddIndicesSum + givenArray[i];
            }
        }
        System.out.println("Even Indices Sum " + evenIndicesSum);
        System.out.println("Odd Indices Sum " + oddIndicesSum);
    }

    public static void main(String[] args){
        int[] arr = {1,2,4,5,6,7,8};
        sumOfEvenOddIndices(arr);

    }
}
