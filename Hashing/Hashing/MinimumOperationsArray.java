package Hashing.Hashing;

/*
 * Question:- Part 6: Minimum operations to make all elements equal in an array.
 * 
 * 
 */
public class MinimumOperationsArray {
    /*
     * Approach:- 1.) We will select one  target element from the array and convert all other elements to the target element.
     * 2.) We will select the element the is having the highest frequency. Suppose the highest occurence of the element is k 
     * then we would nedd n-k operations to convert all elements to target element.
     * 
     */
    public static int findMinimumOperationToMakeArrayElementsEqualBrute(int[] givenArray){
        int maxFreq = 0;
        for(int i=0;i< givenArray.length; i++){
            int currentFrequency =1;
            for(int j =0; j< givenArray.length; j++){
                if(i==j) continue;
                if(givenArray[i] == givenArray[j]){
                    currentFrequency++;
                }

            }
            if(currentFrequency > maxFreq){
                maxFreq = currentFrequency;
            }
        }
        int minimumOperations = givenArray.length - maxFreq;
        System.out.println("Minimum Operations Required are " + minimumOperations);
        return minimumOperations;
    }

    /*
     * 1.) In efficient solution we can use hashMap to store frequency of all elements.
     * 2.) Then return minimum operations using arraySize - maxFrequency
     */
    public static int findMinimumOpsEfficient(int[] givenArray){
        
        
        return 0;
    }

    public static void main(String[] args) {
            int arr[] = {1,2,3,4};
            findMinimumOperationToMakeArrayElementsEqualBrute(arr);
    }
}
