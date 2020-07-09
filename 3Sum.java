/*Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

Note:

The solution set must not contain duplicate triplets.

Example:

Given array nums = [-1, 0, 1, 2, -1, -4],

A solution set is:
[
  [-1, 0, 1],
  [-1, -1, 2]
]*/


class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> res = new ArrayList();
        if(nums==null||nums.length==0) return res;
        Arrays.sort(nums);
        for (int i=0;i<nums.length;++i){
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
            if(nums[i]+nums[left]+nums[right]==0){
                List<Integer> inres = new ArrayList();
                inres.add(nums[i]);
                inres.add(nums[left]);
                inres.add(nums[right]);
                res.add(inres);
                 while(i<nums.length-1 && nums[i]==nums[i+1]){
                ++i;
            }
            int leftValue=nums[left];
            int rightValue=nums[right];
             while(left<nums.length && nums[left]==leftValue){
                ++left;
            }
            
            while(right>left && nums[right]==rightValue){
                --right;
            }
        }
           
        else if (nums[i]+nums[left]+nums[right]<0){
            ++left;
        }
            
            else --right;
        
    
        }
        }
          return res;
        }
    
}
