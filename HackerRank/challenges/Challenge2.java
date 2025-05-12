package HackerRank.challenges;

import java.util.ArrayList;
import java.util.List;

/*
 * 
 * Question Link:- https://www.hackerrank.com/challenges/insertionsort1/problem?h_r=next-challenge&h_v=zen&isFullScreen=true
 */
public class Challenge2 {
    
    public static void insertionSort1(int n, List<Integer> arr) {
        // Write your code here
        int lastValue = arr.get(n-1);
        for(int i=n-1;i> 0; i--){
            if(arr.get(i)< lastValue){
                arr.add(i, lastValue);
                System.out.println("INSIDE IF" +arr);
            }else{
                arr.add( i-1, arr.get(i));
                System.out.println("INSIDE ELSE" +arr);

            }
        }
    }

    public static void main(String[] args) {
         ArrayList<Integer> barArray = new ArrayList<>();
        barArray.add(1);
        barArray.add(2);
        barArray.add(4);
        barArray.add(5);
        barArray.add(3);
        insertionSort1(5, barArray);
    }
}
