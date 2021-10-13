public class NumberGenerator implements Runnable{
    private String name;

    public NumberGenerator(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try{
            for (int i = 1; i <= 10; i++) {
                System.out.println("Số thứ " + i + " của " + this.getName() + " là " + i );
                Thread.sleep(500);

            }
            System.out.println("Mã hasCode là: " + this.hashCode());
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    
}
