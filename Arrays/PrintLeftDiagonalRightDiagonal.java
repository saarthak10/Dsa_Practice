package Arrays;

public class PrintLeftDiagonalRightDiagonal {
    /*
     * 
     * Left Diagonal === when i==j
     * 
     * Right Diagonal i=j === arr.length -1
     * 
     */
    public static void printLeftDiagonalRightDiagonal(){
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

        int row = matrix.length;
        int columns = matrix[0].length;
        System.out.println("PRINT LEFT DIAGONAL ELEMENTS====>");
        
        for(int i=0; i< row; i++){
            for(int j=0; j < columns; j++){
                if(i==j){
                    System.out.println(matrix[i][j]);
                }
                
            }
        }
        System.out.println("PRINT RIGHT DIAGONAL ELEMENTS====>");
        for(int i=0; i< row; i++){
            for(int j=0; j < columns; j++){
                // To avoid duplicates as 5 occurs in both we can add a condition i.e
                if(i+j == row-1 && i!= j){
                    System.out.println(matrix[i][j]);
                }
                
            }
        }
    }


    public static void main(String[] args){
        
        printLeftDiagonalRightDiagonal();
    }
}
