package Arrays;

public class FirstAndLastIndexOfElement {
    
    public static void findFirstAndLastIndex(int[] givenArray, int targetElement){
        int firstIndex = -1;
        int lastIndex = -1;
        for(int i=0; i<givenArray.length; i++){
            if(targetElement == givenArray[i]){
                firstIndex = i;
                System.out.println("FIRST INDE IS==>" +  i);
                break;
            }
            

        }

        for(int i= givenArray.length -1; i>0; i--){
            if(targetElement == givenArray[i]){
                lastIndex = i;
                System.out.println("LAST INDEX IS==>" +  i);
                break;
            }
        }

    }

    public static void main(String[] args){
        // Note :- Array will be sorted
        int[] arr = {1,2,3,4,5,6,7, 8,8,10};
        findFirstAndLastIndex(arr, 8);   
    }
}
