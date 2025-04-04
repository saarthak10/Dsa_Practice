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
                for(int j = i+1; j< givenArray.length;j++){
                    if(givenArray[i] == givenArray[j]){
                        visited[j] = true;
                        count++;
                    }
                }
                System.out.println(givenArray[i]+"->"+count);

            }else{
                continue;
            }
        }
    }

    public static void main(String[] args){
        
        int[] arr = {2,3,2,5,5,5,5,4,3,6};
        findFrequencyOfElements(arr);   
    }
}
