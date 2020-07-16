/*Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

Example 1:
Input: "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
Note: In the string, each word is separated by single space and there will not be any extra space in the string.*/


class Solution {
    public String reverseWords(String s) {
       int i = 0;
       int n = s.length();
       String res = "";
        while(i<n){
            while(i<n && s.charAt(i)==' ') i++;
            if(i>=n) break;
            int j=i+1;
            while(j<n && s.charAt(j)!=' ') j++;
            String word = new StringBuilder(s.substring(i,j)).reverse().toString();
            if(res.length()==0) res = word;
            else res = res + " " + word ;
            i=j+1;
        }
        
        return res;
    }
}
