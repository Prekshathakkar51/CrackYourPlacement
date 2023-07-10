class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        // int[] row = new int[n]; //--> matrix[..][0]
        // Arrays.fill(row,0);

        // int[] col = new int[m];  // --> matrix[0][..]
        // Arrays.fill(col,0);

    int col0 = 1;
        for(int i = 0; i<n;i++){
            for(int j = 0; j<m;j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    if(j !=0){
                        matrix[0][j] = 0;
                    }
                    else{
                        col0 = 0;
                    }
                    
                }
            }
        }

        for(int i = 1; i<n; i++){
            for(int j = 1;j<m; j++){
                if(matrix[i][0]== 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }
// here first we do for j , if we do it for i then it will be wrong
        if(matrix[0][0] == 0){
            for(int j = 0;j<m;j++){
                matrix[0][j] = 0;
            }
        }

        if(col0 == 0){
            for(int i = 0;i<n;i++){
                matrix[i][0] = 0;
            }
            
        }
    }
}