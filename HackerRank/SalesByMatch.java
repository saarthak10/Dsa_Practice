package HackerRank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
* 
 * Question Link :-  https://www.hackerrank.com/challenges/sock-merchant/problem?isFullScreen=true
 */
public class SalesByMatch {
    
    public static int countSocksPairs(int n, List<Integer> givenArray){
        int count =0;
        // int[] frequencyArray = new int[];
        HashMap<Integer,Integer> frequencyHashMap = new HashMap<>();
        for(int i=0; i< givenArray.size(); i++){
            if(frequencyHashMap.containsKey(givenArray.get(i))){
                frequencyHashMap.put(givenArray.get(i), frequencyHashMap.get(givenArray.get(i)) + 1);

            }else{
                frequencyHashMap.put(givenArray.get(i), 1 );
            }
        }

        for(Integer key : frequencyHashMap.keySet()){
            if(frequencyHashMap.get(key) != null){
                count = count + frequencyHashMap.get(key)/2;
            }
        }

      
        System.out.println("COUNT===>" + count);
        return count;
    }

    public static void main(String[] args) {
         ArrayList<Integer> barArray = new ArrayList<>();
        barArray.add(1);
        barArray.add(2);
        barArray.add(1);
        barArray.add(2);
        barArray.add(1);
        barArray.add(3);
        barArray.add(2);
        countSocksPairs(7, barArray);
    }
}
