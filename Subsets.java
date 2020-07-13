/*Given a set of distinct integers, nums, return all possible subsets (the power set).

Note: The solution set must not contain duplicate subsets.

Example:

Input: nums = [1,2,3]
Output:
[
  [3],
  [1],
  [2],
  [1,2,3],
  [1,3],
  [2,3],
  [1,2],
  []
]*/

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        res.add(new ArrayList<Integer>());
        for(int i=0;i<nums.length;i++){
            int size = res.size();
            for(int j=0;j<size;j++){
                res.add(new ArrayList<Integer>(res.get(j)));
                res.get(res.size()-1).add(nums[i]);
            }
        }
        return res;
    }
}
