/*Given a non-empty array of integers, return the k most frequent elements.

Example 1:

Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]
Example 2:

Input: nums = [1], k = 1
Output: [1]
Note:

You may assume k is always valid, 1 ≤ k ≤ number of unique elements.
Your algorithm's time complexity must be better than O(n log n), where n is the array's size.
It's guaranteed that the answer is unique, in other words the set of the top k frequent elements is unique.
You can return the answer in any order.*/

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> counts=new HashMap<>();
        for(int num:nums){
            counts.merge(num,1,Integer::sum);
        }
        
        //Using Sorting (nlogn)
        /*return counts.entrySet().stream()
            .sorted((e1,e2)->Integer.compare(e2.getValue(),e1.getValue()))
            .limit(k).map(e->e.getKey()).collect(Collectors.toList());*/
        
        //Using PQ(nlogk)
        PriorityQueue<Integer> heap=new PriorityQueue((a1,a2)->counts.get(a1)-counts.get(a2));
        for(int key:counts.keySet()){
            heap.add(key);
            if(heap.size()>k){
                heap.poll();
            }
        }
        
        
        List<Integer> topke = new ArrayList();
        topke.addAll(heap);
        Collections.reverse(topke);
        int[] ret = new int[topke.size()];
        for(int i=0;i<topke.size();i++){
            ret[i] = topke.get(i);
        }
        return ret;
    }
}
