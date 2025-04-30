package HackerRank;

import java.util.ArrayList;
import java.util.List;

/*
 * 
 * Question Link :-  https://www.hackerrank.com/challenges/migratory-birds/problem?isFullScreen=false
 */
public class MigratoryBirds {
    
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
            System.out.println("FREQUENCY ARRAY===>" + frequencyArray[i] );
            if(frequencyArray[i] > maxFreq){
                maxFreq = frequencyArray[i];
                result = i;
            }
        }
        System.out.println("COUNT RESULT====>" + result);
        return result;

    }

    public static void main(String[] args) {
        ArrayList<Integer> barArray = new ArrayList<>();
        barArray.add(1);
        barArray.add(1);
        barArray.add(2);
        barArray.add(2);
        barArray.add(3);

        findMostSightedBirdType(barArray);  
    }
}
