package Hashing.Hashing;

import java.util.Arrays;

/*
 * Question:- You are given an array of size “n” ; 
 * you are also given “Q” queries for each of the query 
 * please tell how many times a given number occurs in the array.
 */
public class CountQueryOccurence {
    
    public static void findFrequencyOfElements(int[] givenArray, int[] queries){
        
        for(int i=0; i< queries.length;i++){
            int count=0;
            for(int j=0; j< givenArray.length; j++){
                if (givenArray[j] == queries[i]) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
    /*
     * Example constraints all numbers in given array will be between 0-50
     * and each query will also be a number b/w 0-50
     */
    public static void findFrequencyImproved(int[] givenArray, int[] queries){
        int[] hashArray = new int[51];

        for(int i=0; i< givenArray.length; i++){
            hashArray[givenArray[i]] = hashArray[givenArray[i]] + 1; 
        }

        for(int j=0; j< queries.length;j++){
            System.out.println(hashArray[queries[j]]);
        }

    }

    public static void main(String[] args){
        
        int[] arr = {2,3,2,5,5,5,5,4,3,6};
        int[] queries = {2,5,3,4};

        findFrequencyOfElements(arr, queries);   
    }
}
