package Arrays;

public class SumArrayElements {
    
    public static void sumArrayElements(int[] arr){
        int sum=0;
        int multiplication = 1;
        for(int i=0; i< arr.length; i++){
            sum = sum + arr[i];
            multiplication = multiplication * arr[i];
        }

        System.out.println("Sum of Array Elements is " + sum);
        System.out.println("Multiplication of Array Elements is " + multiplication);

    }


public static void main(String[] args) {

    int[] array = {1,5,6,4,6,8} ;
    sumArrayElements(array);
}
}
