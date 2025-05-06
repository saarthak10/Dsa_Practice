package HackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/*
 * Quesiton Link:-https://www.hackerrank.com/challenges/closest-numbers/problem?isFullScreen=true
 * 
 * 
 */
public class ClosestNumbers {
    

    public static List<Integer> findClosestNumbers(List<Integer>givenArray){
        List<Integer> result = new ArrayList<>();
        HashMap<Integer,Integer> differenceMap = new HashMap<>();
        Collections.sort(givenArray);
        int min_difference = Integer.MAX_VALUE;        
        for(int i=0; i< givenArray.size()-1;i++){
            int difference =Math.abs(givenArray.get(i) - givenArray.get(i+1)); 
            differenceMap.put(i, difference);
            min_difference = Math.min(min_difference, difference);
            
        }

        for(int key : differenceMap.keySet()){
            if(differenceMap.get(key) == min_difference){
                result.add(givenArray.get(key));
                result.add(givenArray.get(key + 1));
            }
        }
        System.out.println("RESULT IS ===> " + result);

        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> barArray = new ArrayList<>();
        barArray.add(-5);
        barArray.add(15);
        barArray.add(25);
        barArray.add(71);
        barArray.add(63);

        
        findClosestNumbers(barArray);
    }
}
