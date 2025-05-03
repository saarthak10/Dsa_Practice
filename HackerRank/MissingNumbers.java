package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/*
 * Question Link :- https://www.hackerrank.com/challenges/missing-numbers/problem?isFullScreen=true
 * 
 * 
 *
 * 
 */
public class MissingNumbers {


     public static List<Integer> missingNumbers(List<Integer> firstArray, List<Integer> secondArray){
        List<Integer> result = new ArrayList<>();
        HashMap<Integer,Integer> firstMap = new HashMap<Integer,Integer>();
        HashMap<Integer,Integer> secondMap = new HashMap<Integer,Integer>();
        Collections.sort(firstArray);
        Collections.sort(secondArray);
         // Extra work no need , just add secondArray values to hasmap and then check from first array
        //   for(int i=0; i< firstArray.size();i++){
      //    if(firstMap.containsKey(firstArray.get(i))){
      //       firstMap.put(firstArray.get(i), firstMap.get(firstArray.get(i)) + 1);
      //    }else{
      //       firstMap.put(firstArray.get(i), 1);
      //    }
      //   }

        for(int i=0; i< secondArray.size();i++){
         if(secondMap.containsKey(secondArray.get(i))){
            secondMap.put(secondArray.get(i), secondMap.get(secondArray.get(i)) + 1);
         }else{
            secondMap.put(secondArray.get(i), 1);
         }
        }

        for(int i=0; i< firstArray.size();i++){
         if(secondMap.containsKey(firstArray.get(i))){
            secondMap.put(firstArray.get(i),secondMap.get(firstArray.get(i)) -1);
         }
        }

        secondMap.forEach((k,v)->{
         if(v == 1){
            result.add(k);
         }
        });
        System.out.println("RESULT===>" + result);
        return result;
     }
    public static void main(String[] args) {
      List<Integer> anotherList = Arrays.asList(203 ,204, 205, 206, 207, 208, 203, 204, 205, 206);
      List<Integer> secondList = Arrays.asList(203 ,204 ,204 ,205 ,206 ,207 ,205 ,208 ,203 ,206 ,205 ,206 ,204);
      ArrayList<Integer> firstArray = new ArrayList<>();
      ArrayList<Integer> secondArray = new ArrayList<>();

      firstArray.addAll(anotherList);
      secondArray.addAll(secondList);

      missingNumbers(firstArray, secondArray);
   
    }
}
