package Arrays;

import java.util.Arrays;

/*
 * 1.) Need to create a visited Array
 * 
 * 
 * 
 * 
 */
public class CountFrequencyEachElement {
    
    public static void findFrequencyOfElements(int[] givenArray){
        boolean [] visited = new boolean[givenArray.length];
            Arrays.fill(visited, false);
        
        for(int i=0; i< givenArray.length;i++){
            int count=0;
            if(visited[i] == false){
              visited[i] =true;
                count++;
            }
        }
    }

    public static void main(String[] args){
        
        int[] arr = {2,3,2,5,4,3,6};
        findFrequencyOfElements(arr);   
    }
}
