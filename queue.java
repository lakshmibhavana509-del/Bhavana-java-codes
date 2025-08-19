class Queue {
    int front, rear, size;
    int capacity = 5;
    int[] arr = new int[capacity];
    Queue() {
        front = 0;
        rear = -1;
        size = 0;
    }
    void enqueue(int ele) {
        if (size == capacity) {
            System.out.println("Queue Overflow");
            return;
        }
        rear = (rear + 1) % capacity;  
        arr[rear] = ele;
        size++;
        System.out.println(ele + " enqueued");
    }
    void dequeue(){
        if (size == 0) {
            System.out.println("Queue Underflow");
            return;
        }
        int removed = arr[front];
        front = (front + 1) % capacity;  
        size--;
        System.out.println(removed + " dequeued");
    }
    void display() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % capacity;
            System.out.print(arr[index] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(90);
        q.enqueue(100);
        q.enqueue(50);
        q.enqueue(80);
        q.display();
        q.dequeue();
        q.display();
        q.enqueue(1010);
        q.enqueue(601);
        q.display();
        q.enqueue(701);
    }
}
