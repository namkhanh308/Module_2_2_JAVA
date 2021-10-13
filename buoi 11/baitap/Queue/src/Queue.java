import java.sql.SQLOutput;

public class Queue {
    private Node front;
    private Node rear;

    public Queue() {
        this.front = null;
        this.rear = null;
    }

    public void enqueue(int key) {
        Node temp = new Node(key);
        if (front == null) {
            front = rear = temp;
        } else {
            this.rear.link = temp;
        }
        this.rear = temp;
        this.rear.link = front;
    }

    public void DisplayQueue() {
        Node temp = front;
        while (temp.link != front) {
            System.out.println(temp.data);
            temp = temp.link;
        }
        System.out.println(temp);
    }

    public int deQueue() {
        if (front == null) {
            return 0;
        } else if (front == rear) {
            Node a = front;
            front = null;
            rear = null;
            return a.data;
        } else {
            Node a = front;
            front = front.link;
            rear.link = front;
            return a.data;
        }
    }
}

