/*
 * @lc app=leetcode id=49 lang=java
 *
 * [49] Group Anagrams
 */
// @lc code=start

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> lls = new ArrayList<>();
        HashMap<String, List<String>> hm = new HashMap<>();
        
        for(int i = 0; i < strs.length; i++){    
            char tA[] = strs[i].toCharArray();
            Arrays.sort(tA);
            String a = new String(tA);
            
            if(hm.containsKey(a)) hm.get(a).add(strs[i]);
            else {
                List<String> ls = new ArrayList<>();
                ls.add(strs[i]); lls.add(ls);
                hm.put(a, ls);
            }
            
        }
        return lls;
    }
}
// @lc code=end

