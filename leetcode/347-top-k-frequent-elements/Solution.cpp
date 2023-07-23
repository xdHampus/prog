class Solution {
public:
    vector<int> topKFrequent(vector<int>& nums, int k) {
        auto elemCounts = map<int,int>();
        for (auto i : nums) 
            elemCounts[i] += 1;

        auto pq = priority_queue<pair<int,int>>();
        for (auto i : elemCounts)
            pq.push({i.second,i.first});
        

        auto result = vector<int>();
        for (size_t i = 0, pqCount = pq.size(); i < k && i < pqCount; i++)
        {
            result.push_back(pq.top().second);
            pq.pop();
        }
        return result;
    }
};

