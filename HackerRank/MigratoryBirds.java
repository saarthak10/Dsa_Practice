package HackerRank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
 * 
 * Question Link :-  https://www.hackerrank.com/challenges/migratory-birds/problem?isFullScreen=false
 */
public class MigratoryBirds {
    // Method used here using array will not work always , need to sued HashMap for this
    public static int findMostSightedBirdType(List<Integer> givenArray){
        ArrayList<Integer> frequencyArrayList = new ArrayList<Integer>(givenArray.size());
        int[] frequencyArray = new int[givenArray.size()];
        for(int i=0; i< givenArray.size();i++){
        //    frequencyArray.add(givenArray.get(i),frequencyArray.get(givenArray.get(i)) + 1);
            frequencyArray[givenArray.get(i)] = frequencyArray[givenArray.get(i)] + 1;    
        }

        int maxFreq = 0;
        int result =0;
        for(int i=0; i< frequencyArray.length;i++){
            if(frequencyArray[i] > maxFreq){
                maxFreq = frequencyArray[i];
                result = i;
            }
        }
        return result;

    }

    public static int findMostSightedBirdTypeHM(List<Integer> givenArray){
        int result = 0;
        HashMap<Integer,Integer> frequencyMap = new HashMap<>();
        for(int i=0;i< givenArray.size(); i++ ){
            if(frequencyMap.containsKey(givenArray.get(i))){
                frequencyMap.put(givenArray.get(i), frequencyMap.get(givenArray.get(i)) +1);
            }else{
                frequencyMap.put(givenArray.get(i), 1);
            }
        }
        int maxFreq =0;

        for(Integer key: frequencyMap.keySet()){
            int value = frequencyMap.get(key);
            if(value > maxFreq){
                maxFreq = value;
                result= key;
            }
        }

        return result;
    }
    public static void main(String[] args) {
        ArrayList<Integer> barArray = new ArrayList<>();
        barArray.add(1);
        barArray.add(1);
        barArray.add(2);
        barArray.add(2);
        barArray.add(3);

        // findMostSightedBirdType(barArray);  
        findMostSightedBirdTypeHM(barArray);
    }
}
