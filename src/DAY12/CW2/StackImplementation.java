package DAY12.CW2;

class ListNode {
    int data;
    ListNode next;

    ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class StackImplementation {
    private ListNode top;
    private int length;

    public StackImplementation() {
        this.top = null;
        this.length = 0;
    }

    public int size() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void push(int value) {
        ListNode newNode = new ListNode(value);
        newNode.next = top;
        top = newNode;
        length++;
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is Empty");
        }
        int result = top.data;
        top = top.next;
        length--;
        return result;
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is Empty");
        }
        return top.data;
    }
    public static void main(String[] args) {
        StackImplementation stack = new StackImplementation();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.peek());  // 30
        System.out.println("Popped: " + stack.pop());        // 30
        System.out.println("Popped: " + stack.pop());        // 20
        System.out.println("Current top: " + stack.peek());  // 10
        System.out.println("Size: " + stack.size());         // 1
    }
}
