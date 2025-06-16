package Hashing.Hashing;

import java.util.HashMap;
import java.util.Map;

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
        int maxFrequency = 0;
        HashMap<Integer,Integer> frequencyMap = new HashMap<>();
        for(int i=0; i< givenArray.length; i++){
            int currentFrequency = frequencyMap.getOrDefault(givenArray[i], 0);
            frequencyMap.put(givenArray[i], currentFrequency + 1);
        }

        for(Map.Entry<Integer, Integer> entry: frequencyMap.entrySet() ){
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
            }

        }
        int minimumOperations = givenArray.length - maxFrequency;
        System.out.println("Minimum Operations Required are " + minimumOperations);

        
        return minimumOperations;
    }

    public static void main(String[] args) {
            int arr[] = {1,2,3,4};
            int arr1[] = {1 , 2, 1, 4, 3, 1};
            findMinimumOperationToMakeArrayElementsEqualBrute(arr1);
            findMinimumOpsEfficient(arr1);
    }
}
