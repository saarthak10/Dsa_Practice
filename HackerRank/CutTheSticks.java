package HackerRank;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import javax.xml.transform.Result;

/*
 * 
 * Question Link :- https://www.hackerrank.com/challenges/cut-the-sticks/problem?isFullScreen=true
 */

 /*
  *Step 1.) Sort the array
  * Step2.) count the shortest sticks in the list and discard them
    Step3.)
  */
public class CutTheSticks {
        public static List<Integer> cutTheSticks(List<Integer> arr) {
            ArrayList<Integer> result = new ArrayList<>(6);
            Collections.sort(arr);
            int count =0;
            int current_stick = arr.get(0);
            int totalSticks = arr.size();
            result.add(totalSticks);
          
           for(int i=0; i< arr.size();i++){
                if(arr.get(i) == current_stick){
                    count++;
                }else{
                    totalSticks -= count;
                    current_stick = arr.get(i);
                    count = 1;
                    System.out.println(totalSticks);
                    result.add(totalSticks);
                }
           }
           System.out.println("RESULT ARRAY===>" + result);
            return result;
        }


    public static void main(String[] args) {

        ArrayList<Integer> barArray = new ArrayList<>();
        barArray.add(5);
        barArray.add(4);
        barArray.add(4);
        barArray.add(2);
        barArray.add(2);
        barArray.add(8);

        cutTheSticks(barArray);

    }   
}
