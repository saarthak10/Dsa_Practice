package HackerRank.challenges;

import java.util.ArrayList;
import java.util.List;

public class Challenge4 {
    public static int insertionSort2(List<Integer> givenArray){
        int result=0;
        for(int i=0; i< givenArray.size()-1;i++){
            for(int j=i+1;j >0; j--){
                if(givenArray.get(j) < givenArray.get(j-1)){
                    //swap
                    int temp = givenArray.get(j-1);
                    givenArray.set(j-1,givenArray.get(j));
                    givenArray.set(j, temp);
                    result++;
                }else{
                    continue;
                }   

            }
        }
        System.out.println("RESULT IS====>" + result);
        return result;

    }
    

    public static void main(String[] args) {
        ArrayList<Integer> barArray = new ArrayList<>();
        barArray.add(2);
        barArray.add(1);
        barArray.add(3);
        barArray.add(1);
        barArray.add(2);
        
        insertionSort2(barArray);
    }
}
