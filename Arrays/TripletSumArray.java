package Arrays;

public class TripletSumArray {
    
    public static void tripletSum(int[] givenArray){
        int tripletSum = 0;
        for(int i=0;i<givenArray.length - 2; i++){

            for(int j=i+1; j<givenArray.length - 1; j++){

                for(int k= j+1; k<givenArray.length;k++){
                    tripletSum = tripletSum + givenArray[i] + givenArray[j] + givenArray[k];
                }
            }
        }
        System.out.println("TRIPLET SUM IS ====> " +  tripletSum);
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4};
        tripletSum(arr);
    }
}
