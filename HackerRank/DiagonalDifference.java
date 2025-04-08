package HackerRank;
// Find the absolute difference between diagonals of 2D array
public class DiagonalDifference {
    
    public static int caluclateDifferrence(int [][] givenMatrix){
        int difference =0;
        int rows = givenMatrix.length;
        int columns = givenMatrix[0].length;
        int rightDiagonalSum = 0;
        int leftDiagonalSum = 0;
        for(int i=0; i< rows; i++){
            for(int j =0; j<columns ; j++){
                if(i==j){
                    rightDiagonalSum = rightDiagonalSum + givenMatrix[i][j];
                }
                if( i + j == rows -1){
                    leftDiagonalSum = leftDiagonalSum + givenMatrix[i][j];
                }

            }
        }
        difference = Math.abs(leftDiagonalSum - rightDiagonalSum);

        return difference;
    }
    
    public static void main(String[] args){
        int[][] matrix = {{1,2,3},{4,5,6},{9,8,9}};
        
        caluclateDifferrence(matrix);

    }
}
