
/*520. Detect Capital

We define the usage of capitals in a word to be right when one of the following cases holds:

All letters in this word are capitals, like "USA".
All letters in this word are not capitals, like "leetcode".
Only the first letter in this word is capital, like "Google".
Given a string word, return true if the usage of capitals in it is right.

 

Example 1:

Input: word = "USA"
Output: true
Example 2:

Input: word = "FlaG"
Output: false
 

Constraints:

1 <= word.length <= 100
word consists of lowercase and uppercase English letters.
==================================================================================*/

class Solution {
    public boolean detectCapitalUse(String word) {
        boolean upp=true;
        boolean low=true;
        for(char c : word.toCharArray()){
            if(Character.isLowerCase(c)) {
                upp=false;
            }
            if(Character.isUpperCase(c)) {
                low=false;
            }
        }

        if(upp||low) return true;

        if(Character.isUpperCase(word.charAt(0))){
            for(int i=1;i<word.length();i++){
                if(Character.isUpperCase(word.charAt(i)))
                    return false;
            }
            return true;
        }

        return false;
    }
}
