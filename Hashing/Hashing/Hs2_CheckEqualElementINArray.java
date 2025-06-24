package Hashing.Hashing;

import java.util.HashMap;

/*
 * Question: CHeck if there are any two equal elements in an array at a distance less than or equal to k
 * 
 */
public class Hs2_CheckEqualElementINArray {
    
    public static boolean checkEqualElementsBrute(int[] givenArray, int k){
        boolean result = false;
        for(int i=0;i< givenArray.length;i++){
            // We can keep a distance variable and check with element equality for result
            // Efficient way we know j-i <= k when elements are equal , thus we can say j<= i+k
           // int distance =0;
            for(int j=i+1; j< givenArray.length && j<= i+k;j++){
                if(givenArray[i] == givenArray[j] ){ // && distance <= k
                    result = true;
        
                }
             //   distance++;
            }
            
        }

        System.out.println("EISTS OR NOT===>" + result);
        return result;
    }

     public static boolean checkEqualElementsEfficient(int[] givenArray, int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        boolean result = false;
        for(int i=0; i< givenArray.length;i++){
            if(map.containsKey(givenArray[i])){
                int distance = i - map.get(givenArray[i]);
                
                if (distance > k) {

                    map.put(givenArray[i], i);
                }else{                  
                    result=true;
                    System.out.println("Yes element Exists====>" + result);
                    return result;
                }
                // if(i -map.get(givenArray[i]) <= k){
                //     System.out.println("Yes element Exists====>");
                //     result=true;
                // }else{
                //     map.put(givenArray[i], i);
                // }
            }else{
                map.put(givenArray[i], i);
            }

        }
        return result;
     }

    public static void main(String[] args) {
        int [] arr = {3,1,2,3,2};
        checkEqualElementsEfficient(arr, 1);
    }
}
