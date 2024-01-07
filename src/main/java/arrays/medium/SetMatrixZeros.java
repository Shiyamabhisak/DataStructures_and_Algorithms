package arrays.medium;

public class SetMatrixZeros {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        boolean flag = false;
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(matrix[i][j] == 0){
                    if(j==0)flag=true;
                    else matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        for(int i = m-1;i>0;i--){
            for(int j = n-1;j>0;j--){
                if(matrix[0][j] == 0 || matrix[i][0] == 0)matrix[i][j] = 0;
            }
        }

        if(matrix[0][0] == 0)for(int j = n-1;j>0;j--)matrix[0][j] = 0;

        if(flag)for(int i = m-1;i>=0;i--)matrix[i][0] = 0;
    }
}
