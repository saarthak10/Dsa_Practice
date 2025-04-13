package HackerRank;

import java.util.ArrayList;
import java.util.List;

public class MiniMaxSum {
    // 4 test cases failed as well as n-square time complexity
    public static void getMinMaxSum(List<Integer> givenArray){
        long minSum = Integer.MAX_VALUE;
        long maxSum = Integer.MIN_VALUE;
        for(int i=0; i<givenArray.size(); i++){
            long currentSum =0;
            for(int j=0; j< givenArray.size(); j++){
                if(givenArray.get(i) == givenArray.get(j)){
                    continue;
                }else{
                    currentSum = currentSum + givenArray.get(j);
                }

            }

            if(currentSum> maxSum){
                maxSum = currentSum;
            }
            if(currentSum < minSum){
                minSum = currentSum;
            }
        }

        System.out.println("Min Sum ===>" + minSum);
        System.out.println("MAx SUM====> " + maxSum);

    }


    public static void getMinMaxSumEfficient(List<Integer> givenArray){
        long minElement = givenArray.get(0);
        long maxElement = givenArray.get(0);
        long sum =0;
        for(int i=0; i< givenArray.size(); i++){
            sum = sum + givenArray.get(i);
            if(givenArray.get(i) < minElement){
                minElement = givenArray.get(i);
            }
            if(givenArray.get(i) > maxElement){
                maxElement = givenArray.get(i);
            }

        }
        System.out.println(sum -maxElement);
        System.out.println(sum -minElement);

    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        getMinMaxSum(arr);
    }
}
