class MyCircularQueue {

    private int[] arr;
    private int head, tail, size, capacity;

    public MyCircularQueue(int k) {
        arr = new int[k];
        head = tail = -1;
        size = 0;
        capacity = k;
    }
    
    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }
        if (isEmpty()) {
            head = 0;
        }
        tail++;
        if (tail == capacity) {
            tail = 0;
        }
        arr[tail] = value;
        size++;
        return true;
    }
    
    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }
        if (head == tail) {
            head = tail = -1;
        }
        head++;
        if (head == capacity) {
            head = 0;
        }
        size--;
        return true;
    }
    
    public int Front() {
        if (isEmpty()) {
            return -1;
        }
        return arr[head];
    }
    
    public int Rear() {
        if (isEmpty()) {
            return -1;
        }
        return arr[tail];
    }
    
    public boolean isEmpty() {
        return size==0;
    }
    
    public boolean isFull() {
        return size==capacity;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */