package Hashing.Hashing;

import java.util.HashMap;

/*
 * Question:- Check if the following given array contains duplicate elements within k distance from each other.
 * 
 * 
 */
public class CheckDuplicatesWithinDistance {
    /*
     * Brute Force Approach : Run two loops first loop captures the each element and run the second loop 
     * for i+k times to check whether duplicate exists or not
     * 
     * 
     */

    public static boolean checkDuplicatesExistBrute(int k, int[] givenArray){
        boolean result = false;
        for(int i=0; i< givenArray.length;i++){

            for(int j=i+1; j< i+k && j< givenArray.length; j++){
                if(givenArray[i] == givenArray[j] ){
                    if(j-i <=k){

                        result = true;
                        return result;
                    }

                }
            }
        }

        return result;
    }

    /*
     * Efficient Approach : -
     * 1.) Use Hashmap to store all elements as key and their index in the array as value.
     * 2.) Check whether the element is already present while looping through the array.
     * 3.) If already present get its value from the map and subtract it from the current index of the array , if the subtraction is greater than k update theindex in the map, if less than equal to k return true. 
     * 4.) If element is not present in the map add it to the map with its index.
     */

     public static boolean checkDuplicatesExistEff(int k, int[] givenArray){
        boolean result = false;
        HashMap<Integer, Integer> elementMap = new HashMap();

        for(int i=0; i< givenArray.length;i++){
            if (elementMap.containsKey(givenArray[i])) {
                int distance = i - elementMap.get(givenArray[i]);
                if(distance > k){
                    elementMap.put(givenArray[i], i);
                }else{
                    result = true;
                    System.out.println("RESULT IS " + result);
                    return result;
                }
            }else{
                elementMap.put(givenArray[i], i);
            }
            
        }
        System.out.println("RESULT IS OUTSIDE" + result);
        return result;
    }

    public static void main(String[] args) {
        int k=1;
        int[] arr = {1,2,3,1,4,5};
        int [] arr2 = {3,1,2,3,2};

        checkDuplicatesExistEff(k, arr2);
    }
}
