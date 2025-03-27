package Arrays;


public class SumOfEvenAndOddElementsArray {
    // Sum of All Even and Odd number using array
    public static void sumOfEvenANdOddEements(int[] givenArray){

        int evenSum = 0;
        int oddSum = 0;

        for(int i=0; i< givenArray.length; i++){
            if(givenArray[i]%2 == 0){
                evenSum = evenSum + givenArray[i];
            }else{
                oddSum = oddSum + givenArray[i];
            }
        }

        System.out.println("Even number Sun is" + evenSum);
        System.out.println("Odd number Sum is" + oddSum);
    }

    public static void main(String[] args){
        int[] arr = { 1,2,4,5,7,9,8};
        sumOfEvenANdOddEements(arr);
    }
}
