package Arrays;

import java.util.ArrayList;
import java.util.List;

public class CompareTriplets {
    
    public static List<Integer> compareTriplets(List<Integer> a,List<Integer> b){
        ArrayList<Integer> result = new ArrayList<Integer>();
        result.add(0);
        result.add(0);

        for(int i =0; i< a.size(); i++){
            if(a.get(i) > b.get(i)){
              int currentValue = result.get(0);
              result.set(0,currentValue +1);
            }else if (b.get(i) > a.get(i)) {
              int currentValue = result.get(1);
              result.set(1,currentValue +1);
            }else{
                continue;
            }
        }
        System.out.println("RESULT ====>" + result);

        return result;
    }

    public static void main(String[] args){

        ArrayList<Integer> a = new ArrayList<>();
        a.add(13);
        a.add(10);
        a.add(14);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(15);
        b.add(10);
        b.add(16);

        compareTriplets(a, b);

    }
}
