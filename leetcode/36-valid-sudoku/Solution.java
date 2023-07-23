/*
 * @lc app=leetcode id=36 lang=java
 *
 * [36] Valid Sudoku
 */
// @lc code=start

class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> data = new HashSet<>();

        for(int col = 0; col < 9; col++){
            for(int row = 0; row < 9; row++){ 
                char cur = board[col][row];
                if(cur == '.') continue;
                if(
                    existsInSet('c'+Integer.toString(col),cur,data) ||
                    existsInSet('r'+Integer.toString(row),cur,data) ||
                    existsInSet('s'+Integer.toString(col/3)+Integer.toString(row/3),cur,data)) 
                    return false;
            }
        }
        return true;
    }
    public boolean existsInSet(String s, char c, HashSet<String> set){
        s += c;
        if(!set.contains(s)){ 
            set.add(s);
            return false;
        }
        return true;
    }
}
// @lc code=end
