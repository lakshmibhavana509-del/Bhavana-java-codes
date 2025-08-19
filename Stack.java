class Stack {
    int top = -1;
    int maxSize = 5;
    int[] arr = new int[maxSize];
    void push(int ele) {
        if (top == maxSize - 1) {
            System.out.println("Overflow: Stack is full");
        } else {
            arr[++top] = ele;
            System.out.println(ele + " pushed");
        }
    }
    void pop() {
        if (top == -1) {
            System.out.println("Underflow: Stack is empty");
        } else {
            System.out.println(arr[top--] + " popped");
        }
    }
    void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.display();
        stack.pop();
        stack.display();
    }
}
