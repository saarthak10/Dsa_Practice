package Hashing.Hashing;

import java.util.HashMap;
import java.util.Map;

/*
 * 
 * Question: - Given an array , find the maximum and minimum frequency elements.
 * 
 */
public class FindMinMaxFrequency {
    
    public static void FindMinMaxFrequencyBrute(int[] givenArray){
        int maxCount = 0;
        int maxElement = 0;
        int minElement = 0;
        int minCount = Integer.MAX_VALUE;
        for(int i=0; i< givenArray.length; i++){
            int count =0;
            
            for(int j=0; j< givenArray.length;j++){
                if (givenArray[i] == givenArray[j]) {
                    count++;
                }
            }
            if (maxCount < count) {
                maxCount = count;
                maxElement = givenArray[i];
            }
             if (minCount > count) {
                minCount = count;
                minElement = givenArray[i];
            }
        }
        System.out.println("Maximum Frequent Element is===>" + maxElement);
        System.out.println("Minimum Frequent Element is===>" + minElement);

    
    }

    public static void findMinMaxFrequencyEfficient(int[] givenArray){

        int maxFreq =Integer.MIN_VALUE;
        int maxElement=0;
        int minFreq = Integer.MAX_VALUE;
        int minElement = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i< givenArray.length;i++){
            int currentFrequency = map.getOrDefault(givenArray[i],0);
            map.put(givenArray[i],currentFrequency+1);
        }
        
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            
            if (maxFreq < entry.getValue()) {
                maxFreq = entry.getValue();
                maxElement = entry.getKey();
            }
            if (minFreq > entry.getValue()) {
                minFreq = entry.getValue();
                minElement = entry.getKey();
            }

        }
        System.out.println("Maximum Frequent Element is===>" + maxElement);
        System.out.println("Minimum Frequent Element is===>" + minElement);
    }
    public static void main(String[] args) {
        int[] arr = {3,2,3,2,4,3};
        findMinMaxFrequencyEfficient(arr);
    }
}
