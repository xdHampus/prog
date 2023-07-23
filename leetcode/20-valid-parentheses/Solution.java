class Solution {

    public boolean isValid(String s) {
        Set<Character> o = Set.of('(','{','[');
        Set<Character> e = Set.of(')','}',']');
        Stack<Character> para = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
        
            if(o.contains(c)){
                para.push(c);
            } else if(e.contains(c)){
                if(para.isEmpty()) return false;
                char l = para.peek();
                if((l=='('&&c!=')')||
                   (l=='{'&&c!='}')||
                   (l=='['&&c!=']'))
                    return false;
                else
                    para.pop();
            }
        }
        
        return para.isEmpty();
    }
}