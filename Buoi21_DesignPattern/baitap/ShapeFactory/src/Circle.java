public class Circle implements Shape{
    private int r;
    Circle(int r){
        this.r = r;
    }
    @Override
    public void draw() {
        System.out.println("Vẽ Hình Tròn");
    }
}
