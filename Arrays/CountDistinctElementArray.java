package Arrays;

import java.util.Arrays;

public class CountDistinctElementArray {

    public static void countDistinctElementsFromArray(int[] givenArray){

        boolean[] visitedArray = new boolean[101];
        Arrays.fill(visitedArray, false);
        int count = 0;
        for(int i=0; i< givenArray.length; i++){
            if(visitedArray[givenArray[i]] == false){
                visitedArray[i] = true;
                count++;
            }else{
                continue;
            }
        }  
        System.out.println("NUMBER FO DISTINCT ELEMENTS ARE====> " + count);      
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7, 9,9,6,2,2};
        countDistinctElementsFromArray(arr);
    }
}