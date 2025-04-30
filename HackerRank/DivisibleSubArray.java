package HackerRank;

import java.util.ArrayList;
import java.util.List;
/*
 * 
 * Question LINk:- https://www.hackerrank.com/challenges/divisible-sum-pairs/problem
 */
public class DivisibleSubArray {
    
    public static int divisibleSubArrayCount(List<Integer> givenArray, int k){
        int count =0;
        
        for(int i=0; i< givenArray.size();i++){
            for(int j=0;j< givenArray.size(); j++){
                if(i< j && (givenArray.get(i) + givenArray.get(j))%k == 0){
                    count++;
                }
            }
        }
        System.out.println("PAIRS COUNT====>"+ count);
        
        
        return count;
    }

    public static void main(String[] args) {
         ArrayList<Integer> barArray = new ArrayList<>();
        barArray.add(1);
        barArray.add(2);
        barArray.add(3);
        barArray.add(4);
        barArray.add(5);
        barArray.add(6);
        divisibleSubArrayCount(barArray, 5);
    }
}
