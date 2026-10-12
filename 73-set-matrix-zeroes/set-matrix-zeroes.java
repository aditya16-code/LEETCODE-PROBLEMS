class Solution {
    public void setZeroes(int[][] mat) {
        int m=mat[0].length;
        int n=mat.length;
        int col0=1;
        // int col[]=new int[m]->mat[0][..]
        // int row[]=new int[n];->mat[..][0]
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==0){
                    //mark ith row
                    mat[i][0]=0;
                    //mark jth col
                    if(j!=0){
                    mat[0][j]=0;
                    }
                    else{
                    col0=0;
                    }
                }
            }
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(mat[i][j]!=0){
                    //check for 0 in the row and col
                    if(mat[0][j]==0||mat[i][0]==0){
                        mat[i][j]=0;
                    }
                }
            }
        }
        if(mat[0][0]==0){
            for(int i=0;i<m;i++){
                mat[0][i]=0;
            }   
        }
        if(col0==0){
            for(int i=0;i<n;i++){
                mat[i][0]=0;
            } 
        }

    }

}