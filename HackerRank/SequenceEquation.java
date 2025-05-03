package HackerRank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/*
 * Question Link:-  https://www.hackerrank.com/challenges/permutation-equation/problem?isFullScreen=true
 * 
 * Solution Steps:- 
 * Step1.) Store the values of the given array in hashmap with its index as values
 * Step2.) Again traverse from 1 to n and find map.get(map.get(i))
 * 
 */
public class SequenceEquation {
    
    public static List<Integer> permutationEquation(List<Integer> p){
        ArrayList<Integer> result = new ArrayList<>(); 
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=1; i<= p.size();i++){
            map.put(p.get(i-1),i);
        }
        System.out.println("MAP CREATED +++==>>>" + map);
        for(int i =1; i<= p.size(); i++){
            int x = map.get(i);
            int y = map.get(x);
            System.out.println("RESULT VALUE EACH TIME====>" + y);
            result.add(y);
        }
    

        
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> barArray = new ArrayList<>();
        barArray.add(2);
        barArray.add(3);
        barArray.add(1);
       permutationEquation(barArray);
    }
}
