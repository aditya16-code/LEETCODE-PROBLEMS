class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer>list=new ArrayList<>();
        long ans=1;
        list.add((int)ans);
        for(int col=1;col<=rowIndex;col++){
            ans=ans*(rowIndex-col+1);
            ans=ans/col;
            list.add((int)ans);
        }
        return list;
    }
}