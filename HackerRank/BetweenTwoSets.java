package HackerRank;

import java.util.ArrayList;
import java.util.List;

public class BetweenTwoSets {
    
    public static int findHcf(int a, int b){
        if (b == 0) {
            return a;
        }
        return findHcf(b,a% b);
    }

    public static int findLcm(int a , int b){

        if(a==0 || b==0){
            return 0;
        }

        return Math.abs(a*b)/findHcf(a, b);
    }


    public static int findNumbersCount(List<Integer> arrayOne, List<Integer> arrayTwo ){
        int result =0;
        int lcm = arrayOne.get(0);
        for(Integer num: arrayOne){
            lcm = findLcm(lcm, num);
        }
        int hcf = arrayTwo.get(0);
        for(Integer num: arrayTwo){
            hcf = findHcf(hcf,num);
        }



        int multiple =0;
        while(multiple < hcf){
            multiple = multiple + lcm;
            if(hcf % multiple == 0){
                result++;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        ArrayList<Integer> arrayOne = new ArrayList<>();
        arrayOne.add(2);
        arrayOne.add(6);
        ArrayList<Integer> arrayTwo = new ArrayList<>();
        arrayTwo.add(24);
        arrayTwo.add(36);
        findNumbersCount(arrayOne, arrayTwo);
    }
}
