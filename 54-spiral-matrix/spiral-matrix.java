class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer>list=new ArrayList<>();
        int r=matrix.length;
        int c=matrix[0].length;
        int left=0;
        int top=0;
        int right=c-1;
        int bottom=r-1;
        while(top<=bottom&&left<=right){
        //right
        for(int i=left;i<=right;i++){
            list.add(matrix[top][i]);
        }
        top++;
        //bottom
        for(int i=top;i<=bottom;i++){
            list.add(matrix[i][right]);
        }
        right--;
        
        //left
        if(top<=bottom){
        for(int i=right;i>=left;i--){
            list.add(matrix[bottom][i]);
        }
        bottom--;}
        //top
        if(left<=right){
        for(int i=bottom;i>=top;i--){
            list.add(matrix[i][left]);
        }
        left++;
        }}
        return list;
    }
}