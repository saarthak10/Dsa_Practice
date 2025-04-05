package Arrays;

public class TransposeMatrix {
    
    public static void transposeMatrix(){
        int [][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int rows = matrix.length;
        int columns = matrix[0].length;
        int [][] transposed = new int[rows][columns];

        for(int i=0; i< rows; i++){
            for(int j=0; j< columns; j++){

                transposed[i][j] = matrix[j][i];
                System.out.print(transposed[i][j] + " ");
            }
            System.out.println();
        }

    }


    public static void reverseRowsMatrix(){
        int [][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int rows = matrix.length;
        int columns = matrix[0].length;
        int [][] reverse = new int[rows][columns];
        System.out.println();
        for(int i=0; i < rows; i++){
            for(int j=0; j< columns; j++){
                reverse[i][j]  = matrix[i][columns -1 -j];
                System.out.print(reverse[i][j] + " "); 
            }
            System.out.println();
        }
    
    
    }
    public static void main(String[] args){
        
        reverseRowsMatrix();
     }
}
