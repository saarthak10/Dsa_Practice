package HackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * 
 * Question link :-  https://www.hackerrank.com/challenges/mark-and-toys/problem?isFullScreen=true
 */
public class MarkToys {
    
    public static int maximumToys(List<Integer> prices, int k){
        Collections.sort(prices);
        int count = 0;
        int sum =0;
        for(int i=0; i< prices.size(); i++){

            if(sum + prices.get(i) <= k){
                sum+=prices.get(i);
                count++;
            }else{
                break;
            }
        }
          
        return count;
    }

    public static void main(String[] args) {

        ArrayList<Integer> barArray = new ArrayList<>();
        barArray.add(1);
        barArray.add(12);
        barArray.add(5);
        barArray.add(111);
        barArray.add(200);
        barArray.add(1000);
        barArray.add(10);
        // barArray.add(1);
        // barArray.add(2);
        // barArray.add(3);
        // barArray.add(4);
        maximumToys(barArray, 50);
    }
}
