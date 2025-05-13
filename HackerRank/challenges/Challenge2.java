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
        for(int i=n-2;i>= 0; i--){
            if(arr.get(i)< lastValue){
                arr.set(i+1, lastValue);
                printArray(arr);
                break;
            }else{
                arr.set( i +1, arr.get(i));
                printArray(arr);

            }
            System.out.println();
        }
    }

    public static void printArray(List<Integer> arr){
        for(int i=0; i< arr.size(); i++){
            System.out.print(arr.get(i) + " ");
        }

    }

    public static void main(String[] args) {
         ArrayList<Integer> barArray = new ArrayList<>();
        barArray.add(2);
        barArray.add(4);
        barArray.add(6);
        barArray.add(8);
        barArray.add(3);
        insertionSort1(5, barArray);
    }
}
