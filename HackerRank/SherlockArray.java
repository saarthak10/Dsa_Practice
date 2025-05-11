package HackerRank;

import java.util.ArrayList;
import java.util.List;

/*
 * Question Link :-  https://www.hackerrank.com/challenges/sherlock-and-array/problem
 */
public class SherlockArray {
    
    public static String balancedSums(List<Integer> givenArray){
        String result ="NO";
        if(givenArray.size() == 1) return "YES"; 
        
        int totalSum = 0;
        
        for(int i=0; i< givenArray.size(); i++){
            totalSum = totalSum + givenArray.get(i);
        }
        int currentSum=0;
        for(int i=0; i<givenArray.size() - 1; i++){
            currentSum = currentSum + givenArray.get(i);
            if(currentSum == totalSum){
                result = "YES";
                // System.out.println("The Element is ====>" + givenArray.get(i));
                break;
            }
            totalSum = totalSum - givenArray.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
         ArrayList<Integer> barArray = new ArrayList<>();
        barArray.add(5);
        barArray.add(6);
        barArray.add(8);
        barArray.add(11);
        balancedSums(barArray);
    }
}
