public class OptimizedPrimeFactorization extends Thread {
    @Override
    public void run() {
        int count = 0;
        for (int i = 2; i < 100; i++) {
            count = i;
            boolean check = true;
            int squareRoot = (int) Math.sqrt(i);
            for (int j = 2; j <= squareRoot; j++) {
                if(i % j == 0){
                    check = false;
                }
            }
            if(check == true){
                System.out.println(this.getName() + " : " + i);
                count++;
            }
            if(count == 97){
                System.out.println(this.getName() + " hoàn thành");
            }
//            try {
//                Thread.sleep(1000);;
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }

    }

}
