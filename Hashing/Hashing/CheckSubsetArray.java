package Hashing.Hashing;

import java.util.HashMap;
import java.util.HashSet;

/*
 * 
 * Question :- PART 4 (Check if the given array is subset of another array.) : 
    Problem: Check if following given array is subset of another array.
    Assumtion : No duplicates present in the array
 */
public class CheckSubsetArray {
    public static boolean checkSubsetBrute(int[] arr1, int [] arr2){
        boolean result= false;

        for(int i =0; i< arr2.length; i++){
            int element = arr2[i];
            boolean isPresent = false;

            // doing the extra work
            for(int j=0;j< arr1.length; j++){
                if ( element == arr1[j]) {
                    isPresent = true;
                }
            }
            result = isPresent;
        }
        return result;
    }

    public static boolean checkSubsetEffecient(int[] arr1, int [] arr2){
        boolean result= false;
        HashSet<Integer> elementMap = new HashSet();

        for(int i =0; i< arr1.length; i++){
            elementMap.add(arr1[i]);
            
        }

        for(int j=0; j< arr2.length; j++){
            boolean isPresent = false;
            if (elementMap.contains(arr2[j])) {
                isPresent =true;
            }
            result = isPresent;
        }
        System.out.println("RESULT IS====>" + result);
        return result;
    }
    public static void main(String[] args) {
        int[ ] arr = {2,4,7,1,5};
        int[] arr2 = {5,4,2};
       // checkSubsetBrute(arr, arr2);
        checkSubsetEffecient(arr, arr2);
    }
}
