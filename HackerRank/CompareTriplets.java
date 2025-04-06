 package HackerRank;

import java.util.ArrayList;
import java.util.List;

public class CompareTriplets {

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b){
         
        ArrayList<Integer> result = new ArrayList<Integer>();

        for(int i=0; i< a.size(); i++){
            if(a.get(i) > b.get(i)){
                if(result.size() == 0){
                    result.add(0,1);
                }else{
                    result.add(0, result.get(0) + 1);
                }
            }else if (b.get(i) > a.get(i)) {
                System.out.println("ELEMENTS ALREADY IN THE ARRAY" + result);
                if(result.size() == 0){
                    result.add(1,1);
                }else if( result.size() == i){
                    result.add(1,1);
                }else{
                    result.add(1, result.get(1) + 1);
                    
                }
            }else{
                continue;
            }
        }

        System.out.println("RETURNED ARRAY" + result);
        return result;

    }

    public static void main(String[] args){
        ArrayList<Integer> a = new ArrayList<>();
        a.add(12);
        a.add(13);
        a.add(16);

        ArrayList<Integer> b = new ArrayList<>();
        b.add(10);
        b.add(13);
        b.add(16);

        compareTriplets(a, b);
      
     }
    
}