package HackerRank;
/*
 * 
 * Question Link:- https://www.simplilearn.com/tutorials/css-tutorial/css-interview-questions
 */
public class CountingValleys {
    
    public static int countHikedValleys(int steps, String path){
        char[] pathArray = path.toCharArray();
        int valleyCount =0;
        int level = 0;
        for(int i=0;i< pathArray.length; i++){
            if(pathArray[i] == 'D'){
                if(level == 0){
                    valleyCount++;
                }
                    // Decrease level
                    level = level -1;
                
            }else if(pathArray[i] == 'U'){
                // Increase level
                level++;
            }
        }
        return valleyCount;
    }

    public static void main(String[] args) {
        countHikedValleys(8, "UDDDUDUU");
    }
}
