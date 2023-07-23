/*
 * @lc app=leetcode id=17 lang=java
 *
 * [17] Letter Combinations of a Phone Number
 */
// @lc code=start

class Solution {

    private static final char[][] digitChars = {
        {'a', 'b', 'c'},
        {'d', 'e', 'f'},
        {'g', 'h', 'i'},
        {'j', 'k', 'l'},
        {'m', 'n', 'o'},
        {'p', 'q', 'r', 's'},
        {'t', 'u', 'v'},
        {'w', 'x', 'y', 'z'}
    };

    private void sub(List<String> res, String digits, int index, String cur){
        if(index < 0) {
            res.add(cur); return; 
        }

        char curchar = digits.charAt(index);
        for(char c : digitChars[Character.getNumericValue(curchar)-2]){
            sub(res, digits, index-1, c+cur);
        }
    }

    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if(digits.isBlank()) return res;
        sub(res,digits,digits.length()-1,"");
        return res;
    }
}
// @lc code=end
