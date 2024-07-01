package Hashing;

import java.util.HashMap;
import java.util.Map;

public class Hashing_Problem2 {
     /**
     * 
     * Problem Statement: Given an array of size N. Find the highest and lowest frequency element.
     * 
     */
    public static void countFrequencyHighestAndLowest(int[] input){
        HashMap<Integer, Integer> occurenceResult = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> maxEntry = null;
        for(int i=0; i< input.length;i++){
            // check whether array element is already present or not , if present increment the value of that element key
            // else add the element to the hashmap with key as element and value as 1
            if(occurenceResult.containsKey(input[i])){
                occurenceResult.put(input[i], occurenceResult.get(input[i] )+1);
            }else{
                occurenceResult.put(input[i], 1);
            }
            
        }
        int maxFreq = 0;
        int minFreq = input.length;
        int maxFreqEle = 0;
        int minFreqEle = 0;
        for(Map.Entry<Integer,Integer> entry: occurenceResult.entrySet()){
            int count =entry.getValue();
            int element = entry.getKey();
            if (count > maxFreq) {
                maxFreqEle = element;
                maxFreq = count;
            }

            if(count < minFreq){
                minFreqEle = element;
                minFreq = count;
            }
        }
        System.out.println("The highest frequency element is: " + maxFreqEle);
        System.out.println("The lowest frequency element is: " + minFreqEle);

    }

    public static void countHighestAndLowestBrute( int[] input ){
        boolean[] visited = new boolean[ input.length];
        int minFreq = input.length;
        int maxFreq = 0;
        int minFreqEle = 0;
        int maxFreqEle = 0;
        
        for(int i = 0 ; i<input.length; i++){
            if(visited[i]){
                continue;
            }
            int count = 1;
            for(int j= i+1; j<input.length; j++){
                if(input[i] == input[j]){
                    visited[j] = true;
                    count ++;
                }
            }

            if(count > maxFreq){
                maxFreq = count;
                maxFreqEle = input[i];
            }
            if(count < minFreq){
                minFreq = count;
                minFreqEle = input[i];    
            }


        }
        System.out.println("The highest frequency element is: " + maxFreqEle);
        System.out.println("The lowest frequency element is: " + minFreqEle);


    }

    public static void main(String[] args) {
        int[] p = {1,2,4,2,3,1,4,2,2,3};
        countFrequencyHighestAndLowest(p);
    }
}
