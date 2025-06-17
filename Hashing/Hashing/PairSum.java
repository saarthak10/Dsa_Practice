package Hashing.Hashing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/*
 * 
 * Question:Find out the pair from array whose sum forms the number 'x' when both the numbers of the pair are added
 * 
 */
public class PairSum {
    
    public static List findPairBrute(int targetElement, int[] givenArray){
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0; i< givenArray.length-1;i++){
            int element = givenArray[i];
            for(int j=i+1;j<givenArray.length;j++){
                if(element+ givenArray[j] == targetElement){
                    result.add(element);
                    result.add(givenArray[j]);
                }
            }

        }
        if (result.size() == 0) {
            result.add(0);
        }
        System.out.println("THE PAIR IS " + result);

        return result;
    }
    /*
     * We will use a set for this question, we will loop the array and keep storing each element in the set. In the same loop we will do the following : 
        1.) We will subtract each array[i] from the target element.
        2.) After subtraction we will check that the result of the above operation is present in the set already or not, if present add the elements to the resulting pair as it is true.
        3.) If the result is not present in the set then add that element to the set and continue to the next iteration 
     */
    public static List findPairEff(int targetElement, int[] givenArray){
        ArrayList<Integer> result = new ArrayList<>();
        HashSet<Integer> elementSet = new HashSet();
        for(int i=0; i< givenArray.length;i++){
            int peekElement = targetElement - givenArray[i];
            if(elementSet.contains(peekElement)){
                result.add(peekElement);
                result.add(givenArray[i]);
            }

            elementSet.add(givenArray[i]);
        }
        
        System.out.println("THE PAIR IS " + result);

        return result;

    }

    public static void main(String[] args) {
        int[] arr1 = {0, -1, 2, -3, 1};
        int x = -2;

        findPairEff(x, arr1);


    }
}
