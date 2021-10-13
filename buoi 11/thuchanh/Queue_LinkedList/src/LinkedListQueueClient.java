public class LinkedListQueueClient {
    public static void main(String[] args) {
        MyLinkedListQueue queue = new MyLinkedListQueue();
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        System.out.println("Dequeued item is " + queue.dequeue().key);
        System.out.println("Dequeued item is " + queue.dequeue().key);
        System.out.println("Dequeued item is " + queue.dequeue().key);

    }
}
