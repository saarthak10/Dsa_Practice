package HackerRank;

/*
 * 
 * Question Link:-  https://www.hackerrank.com/challenges/drawing-book/problem?isFullScreen=true
 */
public class DrawingBook {

    public static int pageFlipCount(int n, int p){
        int result=0;
        int totalFlip = n/2;
        int totalFlipFront = p/2;
        int totalFlipBack = totalFlip - totalFlipFront;

        result = Math.min(totalFlipFront, totalFlipBack);
 

        return result;
    }


    public static void main(String[] args) {
        pageFlipCount(6, 2);
    }
}