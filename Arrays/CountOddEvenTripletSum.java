package Arrays;

public class CountOddEvenTripletSum {
    
    public static void countOddEvenTriplet(int[] givenArray){
        int tripletSum = 0;
        int evenCount = 0;
        int oddCount = 0;
        for(int i=0;i<givenArray.length - 2; i++){

            for(int j=i+1; j<givenArray.length - 1; j++){

                for(int k= j+1; k<givenArray.length;k++){
                    
                    int currentTripletSum=givenArray[i] + givenArray[j] + givenArray[k];
                    if(currentTripletSum % 2 ==0){
                        evenCount++;
                    }else{
                        oddCount++;
                    }
                }
            }
        }
        System.out.println("ODD COUNT IS ====> " +  oddCount);
        System.out.println("EVEN COUNT IS ====> " +  evenCount);

    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7};
        countOddEvenTriplet(arr);
    }
}
