package Arrays;

public class ReverseNumbersSum {
    
    public static void summationReverseNumber(int min, int max){

        int summation=0;
        for(int i=min; i<=max; i++){
            int num=i;
            int reverseNumber= 0;
            while(num > 0){
                int rev = num% 10;
                reverseNumber = reverseNumber*10 + rev; 
                num = num/10;
            }
            summation = summation + reverseNumber;
            System.out.println("Reversed Number is ===> " +  reverseNumber);
        }
        System.out.println("Summation is===> " + summation);
    }
    public static void main(String[] args){
        summationReverseNumber(21,25);
    }
}
