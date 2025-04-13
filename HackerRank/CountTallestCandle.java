package HackerRank;

import java.util.ArrayList;
import java.util.List;

public class CountTallestCandle {
    
    public static int countTallestCandles(List<Integer> givenArray){
        int count =0;
        int max = 0;
        for(int i=0; i< givenArray.size(); i++){
            if(givenArray.get(i) > max){
                max = givenArray.get(i);
            }

        }

        for(int i=0; i< givenArray.size(); i++){
            if(givenArray.get(i) == max){
                count++;
            }
        }
        return count;
    }

    // Test cases fail in this method
    public static int countTallestAnotherMethod(List<Integer> givenArray){
        int count = 0;
        int max = 0;
        for(int i=0; i< givenArray.size(); i++){
            if(givenArray.get(i) > max ){
                max = givenArray.get(i);
            }

            if(max == givenArray.get(i)){
                count++;
                
            }
        }
        return count;
    }
    public static void main(String[] args) {
            ArrayList<Integer> arr = new ArrayList<>();
            arr.add(4);
            arr.add(4);
            arr.add(1);
            arr.add(3);

           // countTallestCandles(arr);
           countTallestAnotherMethod(arr);

    }
}
