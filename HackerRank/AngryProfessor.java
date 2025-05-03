package HackerRank;

import java.util.ArrayList;
import java.util.List;

/*
 * 
 * Question Link:-https://www.hackerrank.com/challenges/angry-professor/problem?isFullScreen=true
 */
public class AngryProfessor {

    public static String angryProfessor(int k, List<Integer> arr){
        int count=0;
      for(int i=0;i<arr.size();i++){
          if(arr.get(i)<=0){
              count++;
          }
      }
      if(count>=k){
         
          return "NO";
      }else{
         
            return "YES";
        }

    }


    public static void main(String[] args) {
        ArrayList<Integer> arrivalTimes = new ArrayList();

        arrivalTimes.add(0);
        arrivalTimes.add(-1);
        arrivalTimes.add(2);
        arrivalTimes.add(1);

        angryProfessor(2, arrivalTimes);
 
    }
    
}