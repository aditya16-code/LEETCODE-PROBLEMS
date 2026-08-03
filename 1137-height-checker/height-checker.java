class Solution {
    public int heightChecker(int[] heights) {
        int count=0;
        int res[]= new int[heights.length];
        for(int i=0;i<heights.length;i++){
            res[i]=heights[i];
        }
         Arrays.sort(res);
        for(int j=0;j<res.length;j++){
            if(res[j]!=heights[j]){
                count++;
            }
        }
        return count;
    }
}