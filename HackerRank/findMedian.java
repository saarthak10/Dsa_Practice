package HackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Question Link :-  https://www.hackerrank.com/challenges/find-the-median/problem?isFullScreen=true
 * 
 */
public class findMedian {
    
    public static int getMedian(List<Integer> arr) {
        List<Integer> sortedArray = arr;
        Collections.sort(sortedArray);
        int middleIndex = sortedArray.size()/2;
        int result =sortedArray.get(middleIndex);

        return result;

    }


    public static void main(String[] args) {
         ArrayList<Integer> barArray = new ArrayList<>();
        barArray.add(5);
        barArray.add(3);
        barArray.add(1);
        barArray.add(2);
        barArray.add(4);

        getMedian(barArray);
    }
}
