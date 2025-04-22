package HackerRank;

import java.util.ArrayList;
import java.util.List;

public class ApplesAndOranges {
    

    public static void CountApplesAndOranges(int s, int t, int a, int b, ArrayList<Integer> apples, ArrayList<Integer> oranges ){
        int startPoint = s;
        int endPoint = t;
        int appleTreePosition = a;
        int orangesTreePosition = b;
        int appleCount = 0;
        int orangeCount = 0;
        int appleFallPosition = 0;
        int orangeFallPosition = 0;

        for(int i=0; i< apples.size(); i++){
            appleFallPosition =appleTreePosition + apples.get(i);
            if(appleFallPosition >=startPoint && appleFallPosition<=endPoint){
                appleCount++;
            }
        }
        System.out.print( appleCount);

        for(int i=0;i<oranges.size(); i++){
            orangeFallPosition = orangesTreePosition + oranges.get(i);
            if(orangeFallPosition >=startPoint && orangeFallPosition<=endPoint){
                orangeCount++;
            }
        }
        System.out.print( orangeCount );


    }


    public static void main(String[] args) {
        ArrayList<Integer> appleDistances = new ArrayList<Integer>();
        appleDistances.add(-2);
        appleDistances.add(2);
        appleDistances.add(1);
        ArrayList<Integer> orangeDistances = new ArrayList<Integer>();
        orangeDistances.add(5);
        orangeDistances.add(-6);
        CountApplesAndOranges(7, 11, 5, 15, appleDistances, orangeDistances);
    }
}
