class MinStack {
    public static class Node {
        public Node next;
        public Node minNext;
        public int val;
        public Node(int v) { this.val = v; }
    }
    private Node stackHead;
    private Node minHead;
    public MinStack() {}
    
    public void push(int val) {
        var node =  new Node(val);
        if(stackHead == null) {
            stackHead = node;
            minHead = node;
            return;
        }

        node.next = stackHead;
        stackHead = node;
        if(val < minHead.val) {
            node.minNext = minHead;
            minHead = node;
        }
    }
    
    public void pop() {
        if(stackHead == null) {
            return;
        }

        if(stackHead == minHead) {
            minHead = minHead.minNext != null ? minHead.minNext : null;
        }
        stackHead = stackHead.next != null ? stackHead.next : null;
    }
    
    public int top() {
        return stackHead != null ? stackHead.val : 0;
    }
    
    public int getMin() {
        return minHead != null ? minHead.val : 0;
    }
}
