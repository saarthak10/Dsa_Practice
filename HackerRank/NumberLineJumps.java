package HackerRank;

/*
 * Question Link :- https://www.hackerrank.com/challenges/kangaroo/problem
 * 
 */

public class NumberLineJumps {
    // 13/30 Test cases failed
    public static String willKangaroosMeet(int x1, int y1, int x2, int y2){
        String result = "";
        if(x2> x1){
            if(y2>y1){
                result= "NO";
            }else{
                result = "YES";    
            }
        }
        System.out.println("RESULT +++++>>>>" + result);
        return result;
    }

    public static String willKangaroosMeetEff(int x1, int v1,int x2, int v2){
        if(v1<v2){
            return "NO";
        }

        if(x2-x1 % v1-v2 == 0){
            return "YES";
        }else{
            return "NO";
        }
        
    }

    public static void main(String[] args) {
        // willKangaroosMeet(0,3 , 5, 2);
        willKangaroosMeetEff(0, 3, 5, 2);
    }
}
