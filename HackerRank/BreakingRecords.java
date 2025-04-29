
package HackerRank;

import java.util.ArrayList;
import java.util.List;

/*
 * 
 * Question Link:- https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem?isFullScreen=true
 */
class BreakingRecords {

    public static List<Integer> breakingRecords(List<Integer> givenScores){
        ArrayList<Integer> result = new ArrayList<>();
        int maxCount = 0;
        int minCount = 0;
        int maxRecord = givenScores.get(0);
        int minRecord = givenScores.get(0);
        for(int i=1; i< givenScores.size(); i++){
            if(givenScores.get(i)> maxRecord){
                maxRecord = givenScores.get(i);
                maxCount++;
            }

            if(givenScores.get(i) <  minRecord){
                minRecord = givenScores.get(i);
                minCount++;
            }
        }

        result.add(maxCount);
        result.add(minCount);
        return result;

    } 



    public static void main(String[] args) {
        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(10);
        scores.add(5);
        scores.add(20);
        scores.add(20);
        scores.add(4);
        scores.add(5);
        scores.add(2);
        scores.add(25);
        scores.add(1);

        breakingRecords(scores);
    }
    
}