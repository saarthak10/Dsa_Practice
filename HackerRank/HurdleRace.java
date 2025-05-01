package HackerRank;

import java.util.ArrayList;
import java.util.List;


/*
 * Question Link :- https://www.hackerrank.com/challenges/the-hurdle-race/problem?isFullScreen=true
 */
public class HurdleRace {
    
    public static int countPotionDoses(int k, List<Integer> height){
        int result =0;
        int largestHurdle = 0;

        for(int i=0; i< height.size(); i++){
            if(height.get(i) > largestHurdle){
                largestHurdle = height.get(i);
            }
        }
        if(largestHurdle > k){
            result = largestHurdle -k;
        }
        System.out.println("RESULT IS ===>"+ result);
        return result;
    }

    public static void main(String[] args) {
         ArrayList<Integer> barArray = new ArrayList<>();
        barArray.add(1);
        barArray.add(6);
        barArray.add(3);
        barArray.add(5);
        barArray.add(2);
        countPotionDoses(4,barArray);
    }
}
