public class main {
    public static void main(String[] args) {
        NumberGenerator a = new NumberGenerator("thread 1");
        NumberGenerator b = new NumberGenerator("thread 2");
        Thread thread1 = new Thread(a);
        Thread thread2 = new Thread(b);
        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.MIN_PRIORITY);
        thread1.start();
        thread2.start();
    }
}
