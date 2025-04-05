package Arrays;

public class PrintMatrixZForm {
    
    public static void printZForm(){
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{4,5,6,7},{6,7,8,9}};
        int rows = matrix.length;
        int columns = matrix[0].length;
        System.out.println("ELEMENTS IN Z_FORM");
        for(int i=0 ;i<rows; i++){
            for(int j =0 ; j< columns; j++){
                if(i==0 || i== rows-1 || i+j == rows-1){
                    System.out.println(matrix[i][j]);
                }
            }
        }
    }
    
    public static void main(String[] args){
        
        printZForm();
     }
}
