/*
 * @lc app=leetcode id=13 lang=java
 *
 * [13] Roman to Integer
 */
// @lc code=start

class Solution {

public enum RomanNumeral {
    I(1),
    V(5),
    X(10),
    L(50),
    C(100),
    D(500),
    M(1000);
    private final int value;
    
    RomanNumeral(final int value) {
        this.value = value;
    }
    public int getValue() { return value; }
}
public int romanToInt(String s) {
    int o = 0;
    for(int i = 0; i < s.length(); i++){
        RomanNumeral rn = RomanNumeral.valueOf(Character.toString(s.charAt(i)));
        boolean doDefault = true;
        RomanNumeral rnn = null; 
        if(i+1 < s.length()){
            rnn = RomanNumeral.valueOf(Character.toString(s.charAt(i+1)));
        }
        switch(rn){
            case I:
                if(rnn == RomanNumeral.V || rnn == RomanNumeral.X){
                    o+= rnn == RomanNumeral.V ? 4 : 9;
                    doDefault=false;  
                }
                break;
            case X:
                if(rnn == RomanNumeral.L || rnn == RomanNumeral.C){
                    o+= rnn == RomanNumeral.L ? 40 : 90;
                    doDefault=false;  
                }             
                break;
            case C:
                if(rnn == RomanNumeral.D || rnn == RomanNumeral.M){
                    o+= rnn == RomanNumeral.D ? 400 : 900;
                    doDefault=false;  
                }             
                break;
        }
        if(doDefault)
            o+=rn.getValue();
        else
            i++;
        
    }
    return o;
            
}
}
// @lc code=end
