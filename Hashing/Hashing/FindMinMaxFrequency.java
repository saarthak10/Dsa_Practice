package Hashing.Hashing;

import java.util.HashMap;

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
            int count =1;
            
            for(int j=i; j< givenArray.length;j++){
                if (givenArray[i] == givenArray[j]) {
                    count++;
                }
            }
            if (count> maxCount) {
                maxCount = count;
                maxElement = givenArray[i];
            }
             if (count < minCount) {
                minCount = count;
                minElement = givenArray[i];
            }
        }
        System.out.println("Maximum Frequent Element is===>" + maxElement);
        System.out.println("Minimum Frequent Element is===>" + minElement);

    
    }

    public static void findMinMaxFrequencyEfficient(int[] givenArray){

        int maxFreq =0;
        int maxElement=0;
        int minFreq = Integer.MAX_VALUE;
        int minElement = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i< givenArray.length;i++){
            int currentFrequency = map.getOrDefault(givenArray[i],0);
            map.put(givenArray[i],currentFrequency+1);

            if (maxFreq < map.get(givenArray[i])) {
                maxFreq = map.get(givenArray[i]);
                maxElement = givenArray[i];
            }
            if (minFreq > map.get(givenArray[i])) {
                minFreq = map.get(givenArray[i]);
                minElement = givenArray[i];
            }
        }
          System.out.println("Maximum Frequent Element is===>" + map);
        // System.out.println("Minimum Frequent Element is===>" + minElement);
    }
    public static void main(String[] args) {
        int[] arr = {3,2,3,2,4,3};
        FindMinMaxFrequencyBrute(arr);
        findMinMaxFrequencyEfficient(arr);
    }
}
