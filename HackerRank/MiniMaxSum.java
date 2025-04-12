package HackerRank;

import java.util.List;

public class MiniMaxSum {
    
    public static void getMinMaxSum(List<Integer> givenArray){
        int minSum = 0;
        int maxSum = 0;
        for(int i=0; i<givenArray.size(); i++){
            int currentSum =0;
            currentSum = currentSum + givenArray.get(givenArray.size()-i -1);
            if(currentSum > maxSum){
                maxSum = currentSum;
            }
            if(currentSum < minSum){
                minSum = currentSum;
            }
        }

    }

    public static void main(String[] args) {
        
    }
}
