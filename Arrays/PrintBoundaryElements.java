package Arrays;

public class PrintBoundaryElements {
    
    public static void printBoundaryElements(){

        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int rows = matrix.length;
        int columns = matrix[0].length;

        System.out.println("Boundary Elements===>");
        for(int i=0; i<rows; i++){

            for(int j =0; j<columns; j++){
                if(i==0 || j==0 || i== rows -1 || j== columns -1){
                    System.out.println(matrix[i][j]);
                }

            }

        }

    }

    public static void main(String[] args){
        
       printBoundaryElements();
    }
}
