package HackerRank;

import java.util.ArrayList;
import java.util.List;

/*
 * Question Link:-  https://www.hackerrank.com/challenges/circular-array-rotation/problem?isFullScreen=true
 * 
 * ((i+k)%n) where k is the number of rotations
 */
public class CircularArrayRotation {
    
    public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries){
        List<Integer> result = new ArrayList<>();
        int[] rotatedArray = new int[a.size()];
        for(int i=0; i< a.size(); i++){
            int index = (i+k)% a.size();
            rotatedArray[index] = a.get(i);
        }
        
        for(int i=0; i< queries.size();i++){
            result.add(rotatedArray[queries.get(i)]);
        }
    
        return result;

    }

    public static void main(String[] args) {
        ArrayList<Integer> barArray = new ArrayList<>();
        barArray.add(3);
        barArray.add(4);
        barArray.add(5);
        ArrayList<Integer> queries = new ArrayList<>();
        queries.add(1);
        queries.add(2);
        circularArrayRotation(barArray, 2, queries);
    }
}
