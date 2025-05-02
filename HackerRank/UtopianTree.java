package HackerRank;

/*
 * 
 * Question Link :- https://www.hackerrank.com/challenges/utopian-tree/problem?isFullScreen=true
 */
public class UtopianTree {
    
    public static int utopianTree(int n){
        int result =0;
        int height  = 0;
        for(int i=0; i<=n; i++ ){
            if(i%2 == 0){
                height++;
            }else if(i%2 == 1){
                height = 2*height;

            }
        }
        result =height;

        return result;
    }

    public static void main(String[] args) {
        utopianTree(4);
    }
}
