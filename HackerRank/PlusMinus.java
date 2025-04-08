package HackerRank;
// Question :-- Find the ratio of positive , negative and zero elements in an array
public class PlusMinus {
    
    public static void calculateRatios(int [] givenArray){
        double positive = 0;
        double negative = 0;
        double zeroes = 0;

        for(int i =0; i< givenArray.length; i++){
            if(givenArray[i] <0 ){
                negative ++;
            }else if(givenArray[i] == 0){
                zeroes++;
            }else{
                positive++;
            }
        }
        double positiveRatio =  positive/givenArray.length;
        double negativeRatio =  negative/givenArray.length;
        double zeroesRatio =  zeroes/givenArray.length;

        System.out.printf("%.6f", positiveRatio);
        System.out.println();
        System.out.printf("%.6f", negativeRatio);
        System.out.println();
        System.out.printf("%.6f", zeroesRatio);
        System.out.println();

    }


    public static void main(String[] args){
        int[] arr = {1,1,-1,-1,0};
        
        calculateRatios(arr);
    }
}
