package HackerRank;

import java.util.ArrayList;
import java.util.List;

public class SubarrayDivisions {
    
    public static int countElligibleSubArrays(List<Integer> givenArray,int m, int d){

        int divisionsCount = 0;
        for(int i=0; i< givenArray.size(); i++){
            int sum=0;
            int length_count = 0;
            for(int j=i; j< j+m;j++){
                if(j >= givenArray.size() || sum == d){
                    break;
                }
                sum = sum + givenArray.get(j);
                length_count++;
            }
            if (sum == d && length_count == m) {
                divisionsCount++;
            }
        }
        System.out.println("DIVISIONS COUNT =====>"+ divisionsCount);
        return divisionsCount;
    }

    public static void main(String[] args) {
        ArrayList<Integer> barArray = new ArrayList<>();
        barArray.add(1);
        barArray.add(2);
        barArray.add(1);
        barArray.add(3);
        barArray.add(2);
        countElligibleSubArrays(barArray,2,3);
    }
}
