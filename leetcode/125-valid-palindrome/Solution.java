class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        int n2 = n/2;
        int i = 0; int j = 0;
        while((i < n2 || j < n2) && (i < n && j < n)){
            char a = Character.toLowerCase(s.charAt(i));
            char b = Character.toLowerCase(s.charAt(n-1-j));
            if(!((a >= 'a' && a <= 'z') || (a >= '0' && a <= '9'))){
                i++; continue;
            }
            if(!((b >= 'a' && b <= 'z') || (b >= '0' && b <= '9'))){
                j++; continue;
            }

            if(a != b){
                return false;
            }   
            
            i++; j++;
        }
        
        return true;
    }
    
}