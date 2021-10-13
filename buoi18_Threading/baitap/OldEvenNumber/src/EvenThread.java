public class EvenThread extends Thread{
    @Override
    public void run() {
        try {
            for (int i = 2; i <= 10; i+=2) {
                System.out.println(this.getName() + " là " + i);
                Thread.sleep(15);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
