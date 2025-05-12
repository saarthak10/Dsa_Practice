package HackerRank.challenges;

import java.util.List;

/*
 * 
 * Question Link :- https://www.hackerrank.com/challenges/tutorial-intro/problem?isFullScreen=true
 */
public class Challenge1 {
    
    public static int findIndex(int v, List<Integer> givenArray){
        int result =0;
        
        for(int i=0; i< givenArray.size(); i++){
            if(v == givenArray.get(i)){
                result = i;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        
    }
}
