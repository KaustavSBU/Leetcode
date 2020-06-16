/* Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
*/



class Solution {
    public int[] twoSum(int[] nums, int target) {
// Brute Force
/*        int num[]=nums;
        int index[];
        index=new int[2];
        int tar=target;
        for(int i=0;i<num.length;i++)
        {
            for (int j=0;j<num.length && j!=i;j++)
            {
                if (num[i]+num[j]==tar)
                {
                    index[0]=j;
                    index[1]=i;
                }
            }*/
// 1 Pass
            if(nums.length==0 || nums==null)return new int[] {-1,-1};
            Map<Integer,Integer> twosum = new HashMap();
            int[] ret = new int[2];
            for(int i=0;i<nums.length;i++){
                int complement=target-nums[i];
                if(twosum.containsKey(complement)){
                    ret[0]=twosum.get(complement);
                    ret[1]=i;
                    return ret;
                }
                twosum.put(nums[i],i);
            }
             return ret;
    }
}
