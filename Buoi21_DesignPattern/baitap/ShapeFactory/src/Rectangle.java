public class Rectangle implements Shape{
    private int chieuDai;
    private int chieuRong;
    Rectangle(int chieuDai , int chieuRong){
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }
    @Override
    public void draw() {
        System.out.println("Vẽ hình chữ nhật");
    }
}
