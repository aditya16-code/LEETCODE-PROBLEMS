class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
    for(int i=0;i<nums.length;i++){

        int currnum=Math.abs(nums[i]);
        int idx=currnum-1;

        if(nums[idx]<0)
        continue;
        nums[idx]=-1*nums[idx];

        }
        List<Integer>res=new ArrayList<>();
        for(int j=0;j<nums.length;j++){
            if(nums[j]>0){
                res.add(j+1);
            }
        }
        return res;

    }
}
// class Solution {
//     public List<Integer> findDisappearedNumbers(int[] nums) {
//         Set<Integer>set=new HashSet<>();
//         for(int i=0;i<nums.length;i++){
//             set.add(nums[i]);
//         }
//         List <Integer>res=new ArrayList<>();
//         for(int j=1;j<=nums.length;j++){
//             if(!set.contains(j)){
//               res.add(j);
//             }
//         }
//         return res;
//     }
// }