package HackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Quesiton Link:-https://www.hackerrank.com/challenges/closest-numbers/problem?isFullScreen=true
 * 
 * 
 */
public class ClosestNumbers {
    

    public static List<Integer> findClosestNumbers(List<Integer>givenArray){
        List<Integer> result = new ArrayList<>();
        Collections.sort(givenArray);
        for(int i=0; i< givenArray.size()-1;i++){
            int diff = Math.abs(givenArray.get(i) - givenArray.get(i+1));
            
        }
        
        return result;
    }

    public static void main(String[] args) {
        
    }
}
