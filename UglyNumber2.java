/*Write a program to find the n-th ugly number.

Ugly numbers are positive numbers whose prime factors only include 2, 3, 5. 

Example:

Input: n = 10
Output: 12
Explanation: 1, 2, 3, 4, 5, 6, 8, 9, 10, 12 is the sequence of the first 10 ugly numbers.
Note:  

1 is typically treated as an ugly number.
n does not exceed 1690.*/

class Solution {
    public int nthUglyNumber(int n) {
        //DP
        int[] ugly=new int[n];
        ugly[0]=1;
        int count=1;
        int next=0,idx2=0,idx3=0,idx5=0;
        while(count<n){
            int next2=2*ugly[idx2];
            int next3=3*ugly[idx3];
            int next5=5*ugly[idx5];
            next=Math.min(Math.min(next2,next3),next5);
            if(next==next2) idx2++;
            if(next==next3) idx3++;
            if(next==next5) idx5++;
            ugly[count++] = next;
        }
        
        return ugly[n-1];


        //Brute Force
        /*       if(n==0||n==1) return n;
        int count=1;
        int ret=0;
        int val=0;
        for(int i=2;count<=n;i++){
            ret=i;
            val=i;
            while(val%2==0)val/=2;
            while(val%3==0)val/=3;
            while(val%5==0)val/=5;
            if(val==1) count++;
            if(count==n) return ret;
        }
        
        return ret;
      */  
    }
}
