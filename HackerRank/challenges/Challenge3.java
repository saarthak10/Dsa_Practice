package HackerRank.challenges;

import java.util.ArrayList;
import java.util.List;

public class Challenge3 {
    
    public static void insertionSort2(List<Integer> givenArray){

        for(int i=0; i< givenArray.size()-1;i++){
            for(int j=i+1;j >0; j--){
                if(givenArray.get(j) < givenArray.get(j-1)){
                    //swap
                    int temp = givenArray.get(j-1);
                    givenArray.set(j-1,givenArray.get(j));
                    givenArray.set(j, temp);
                }else{
                    continue;
                }   

            }
            printArray(givenArray);
            System.out.println();
        }



    }
    
    
    public static void printArray(List<Integer> arr){
        for(int i=0; i< arr.size(); i++){
            System.out.print(arr.get(i) + " ");
        }

    }

  public static void main(String[] args) {
        ArrayList<Integer> barArray = new ArrayList<>();
        barArray.add(1);
        barArray.add(4);
        barArray.add(3);
        barArray.add(5);
        barArray.add(6);
        barArray.add(2);
        
        insertionSort2(barArray);
  }
}
