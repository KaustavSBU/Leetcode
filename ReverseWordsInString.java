/*Given an input string, reverse the string word by word.

 

Example 1:

Input: "the sky is blue"
Output: "blue is sky the"
Example 2:

Input: "  hello world!  "
Output: "world! hello"
Explanation: Your reversed string should not contain leading or trailing spaces.
Example 3:

Input: "a good   example"
Output: "example good a"
Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
 

Note:

A word is defined as a sequence of non-space characters.
Input string may contain leading or trailing spaces. However, your reversed string should not contain leading or trailing spaces.
You need to reduce multiple spaces between two words to a single space in the reversed string.
 

Follow up:

For C programmers, try to solve it in-place in O(1) extra space.*/

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
            String word = s.substring(i,j);
            if(res.length()==0) res = word;
            else res = word + " " + res;
            i=j+1;
        }
        
        return res;
    }
}