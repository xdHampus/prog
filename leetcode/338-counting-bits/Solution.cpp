class Solution {
public:
    vector<int> countBits(int n) {
        auto ans = vector<int>(n+1);

        int count = 1;
        int pow = 1;
        while (true)
        {
            for (size_t i = 0; i < pow; i++)
            {
                if(count > n) return ans;
                ans[count] = ans[i]+1;
                count++;
            }
            pow = pow << 1;
        }
    }
};
