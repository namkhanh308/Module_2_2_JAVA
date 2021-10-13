public class Main {
    public static void main(String[] args) {
        Queue a = new Queue();
        a.enqueue(10);
        a.enqueue(20);
        System.out.println(a.deQueue());
        System.out.println(a.deQueue());
    }
}