public class Product {
    private String id;
    private String TenSp;
    private int Gia;

    public Product() {
    }

    public Product(String id, String tenSp, int gia) {
        this.id = id;
        TenSp = tenSp;
        Gia = gia;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenSp() {
        return TenSp;
    }

    public void setTenSp(String tenSp) {
        TenSp = tenSp;
    }

    public int getGia() {
        return Gia;
    }

    public void setGia(int gia) {
        Gia = gia;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", TenSp='" + TenSp + '\'' +
                ", Gia=" + Gia +
                '}';
    }
}
