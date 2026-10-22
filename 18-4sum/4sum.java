class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        HashSet<List<Integer>>set=new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                HashSet<Long>hashset=new HashSet<>();
                for(int k=j+1;k<n;k++){
                    long sum=nums[i]+nums[j];
                    sum+=nums[k];
                    long numsl=target-sum;//nums[i]+nums[j]+nums[k]-target;
                    if(hashset.contains(numsl)){
                        ArrayList<Integer>temp=new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        temp.add((int)numsl);
                        Collections.sort(temp);
                        set.add(temp);
                    }
                    else{hashset.add((long)nums[k]);
                    }

                    }

                }
            }
             return new ArrayList<List<Integer>>(set);
        }
       


    }
