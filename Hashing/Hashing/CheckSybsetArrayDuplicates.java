package Hashing.Hashing;

import java.util.HashMap;

/*
 * PART 5 (Check if a given array is a subset of another array assuming that duplicate 
 * elements can be present in any or both of the given arrays) : 

    Problem: Check if a given array is a subset of another array.
    Duplicate elements can be present.
 * 
 * 
 * 
 */
public class CheckSybsetArrayDuplicates {
    
    /*
     * 1.) Store First array in HashMap with their occurence.
     * 2.) Then iterate the second array, if a particular value is present in the Hashmap and its frequency is not zero, subtract 1 from it
     * if frequency of particular element is zero return false
     * 
     */
    public static boolean checkSubsetBrute(int[] arr1, int [] arr2){
        boolean result= false;
        HashMap<Integer, Integer> firstArrayMap = new HashMap<>();

        for(int i=0; i< arr1.length; i++){
            int currentFrequency = firstArrayMap.getOrDefault(arr1[i], 0);
            firstArrayMap.put(arr1[i], currentFrequency + 1);
        }

        for(int i=0; i< arr2.length; i++){
            if(firstArrayMap.containsKey(arr2[i])){
                if(firstArrayMap.get(arr2[i]) > 0){
                    int currentFrequency = firstArrayMap.get(arr2[i]);
                    firstArrayMap.put(arr1[i], currentFrequency + 1);
                }else{
                    result = false;
                }    
            }else{
                result =false;
            }
        }
        System.out.println("RESULT IS " + result);
        return result;
    }
    public static void main(String[] args) {
        int[] arr1 = {9,3,1,5,2,1};
        int[] arr2 = {9,1,1,1};


        checkSubsetBrute(arr1,arr2);

    }
}
