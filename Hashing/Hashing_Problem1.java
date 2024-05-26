package Hashing;

import java.util.HashMap;

public class Hashing_Problem1 {
    /**
     * Problem:-  Find frequency of each element in the array.
     * 
     */
    public static void countFrequency(int[] input){
        HashMap<Integer, Integer> occurenceResult = new HashMap<Integer, Integer>();
        for(int i=0; i< input.length;i++){
            // check whether array element is already present or not , if present increment the value of that element key
            //else add the element to the hashmap with key as element and value as 1
            if(occurenceResult.containsKey(input[i])){
                occurenceResult.put(input[i], occurenceResult.get(input[i] )+1);
            }else{
                occurenceResult.put(input[i], 1);
            }
            
        }
        System.out.println(occurenceResult);
    }
        

    public static void main(String[] args) {
        int[] p = {1,2,4,2,3,1,4};
        countFrequency(p);
    }
}
