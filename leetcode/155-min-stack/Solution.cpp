struct Node {
    int val;
    struct Node* next;
};
struct NodeRef {
    struct Node* ref;
    struct NodeRef* next;
};


class MinStack {
private:
    struct Node* head = NULL;
    struct NodeRef* min = NULL;
public:

    MinStack() {
    }
 
    void push(int val) {
        struct Node* nhead = new Node();
        nhead->val = val;
        nhead->next = head;
        head = nhead;     

        if(min == NULL){
            min = new NodeRef();
            min->ref = nhead;
        } else if(min->ref->val > val){
            struct NodeRef* nmin = new NodeRef();
            nmin->ref = nhead;
            nmin->next = min;
            min = nmin;
        }
    }
    
    void pop() {
        if(head == NULL) return;
        struct Node* ohead = head;
        head = head->next;

        if(min != NULL && min->ref == ohead) {
            struct NodeRef* omin = min;
            min = min->next;
            delete omin;
        }
        
        delete ohead;
    }
    
    int top() {
        return head != NULL ? head->val : 0;
    }
    
    int getMin() {
        return min != NULL ? min->ref->val : 0;
    }

    ~MinStack(){
        while(head != NULL){
            pop();
        }
    }   
};