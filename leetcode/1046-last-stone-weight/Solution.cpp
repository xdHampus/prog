class Solution {
public:
    int lastStoneWeight(vector<int>& stones) {


        priority_queue<int> pq;
        for(int i : stones){
            pq.push(i);
        }   
        int r = pq.top();
        while(pq.size() > 1){
            int a = pq.top();
            pq.pop();
            int n = abs(a-pq.top());
            pq.pop();
            r = n; pq.push(n);
        }

        return r;

    }
};