class Solution {
    public List<List<Integer>> generate(int numRows) {
        ArrayList<List<Integer>>ans=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            ArrayList<Integer>list=new ArrayList<>();
            for(int j=0;j<=i;j++){
                list.add(ncr(i,j));
            }
            ans.add(list);
        }
        return ans;
    }
    public int ncr(int n,int r){
        int ans=1;
        for(int i=0;i<r;i++){
            ans=ans*(n-i);
            ans=ans/(i+1);
        }
        return ans;
    }
}