class CNMatrixSymmetric {
   /* public static boolean isMatrixSymmetric(int[][] matrix) {

        boolean flag = false;
        // Write your code here.
        int[][] transposeMatrix = new int[matrix.length][matrix.length];
        //To find transpose of given matrix
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<=i;j++){
               transposeMatrix[i][j] = matrix[j][i];                  
            }
        System.out.println();
    }

    //check corresponding elements of both matrix and their order
    for(int p=0;p<matrix.length;p++){
        for(int q=0;q<p;q++){

            //for transpose matrix 
            for(int r=0;r<transposeMatrix.length;r++){
                for(int s=0;s<r;s++){
                    if(matrix[p][q] == transposeMatrix[r][s]){

                        flag = true;
                    }
                    else{

                        flag =  false;
                    }
            }
      
            }
        }
    }

     return flag;
}*/

public static boolean isMatrixSymmetric(int[][] matrix) {
    int rows = matrix.length;
    int cols = matrix[0].length;

    if (rows != cols) {
        // A non-square matrix cannot be symmetric
        return false;
    }

    // Check if the transpose of the matrix is equal to the original matrix
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            if (matrix[i][j] != matrix[j][i]) {
                return false;
            }
        }
    }

    return true;
}


    public static void main(String[] args){

        int[][] matrix = {
            {1,2},
            {2,3},
            {3,5}
        };

        System.out.print(isMatrixSymmetric(matrix));

    }

    
}