/*The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

Given two integers x and y, calculate the Hamming distance.

Note:
0 ≤ x, y < 231.

Example:

Input: x = 1, y = 4

Output: 2

Explanation:
1   (0 0 0 1)
4   (0 1 0 0)
       ↑   ↑

The above arrows point to positions where the corresponding bits are different.*/

class Solution {
    public int hammingDistance(int x, int y) {
        //Brian Kernighan's Bit Counting
        int xor = x^y;
        int res=0;
        while(xor!=0){
            res++;
            xor=xor&(xor-1);
        }
        return res;
        
        
        //Worst Brute Force
        /*char[] a = String.format("%32s", Integer.toBinaryString(x)).replace(" ", "0").toCharArray();
        char[] b = String.format("%32s", Integer.toBinaryString(y)).replace(" ", "0").toCharArray();
        System.out.println(a);
        System.out.println(b);
        
        int count=0;
        for(int i=0;i<a.length;i++){
            if(a[i]!=b[i]) count++;
        }
        
        return count;*/
        
    }
}
