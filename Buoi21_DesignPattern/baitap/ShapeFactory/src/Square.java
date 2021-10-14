public class Square implements Shape{
    private int a;

    public Square(int a) {
        this.a = a;
    }

    @Override
    public void draw() {
        System.out.println("Vẽ hình vuông");
    }
}
