public class main{
    public static void main(String[] args) {
        OddThread oddThread = new OddThread();
        oddThread.start();
        try {
            oddThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        EvenThread evenThread = new EvenThread();
        evenThread.start();
    }

}
