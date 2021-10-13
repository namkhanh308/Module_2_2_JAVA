import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductManager list = new ProductManager();
//        Product b = new Product("1","Coca", 110000);
//        Product c = new Product("2","Coca1", 10000);
        int choose = 11;
        while (choose != 0){
            System.out.println("Bạn muốn làm gì ?");
            System.out.println("1. Thêm mới sản phẩm");
            System.out.println("2. Sửa sản phẩm");
            System.out.println("3. Tìm kiếm sản phẩm");
            System.out.println("4. Hiển thị sản phẩm");
            System.out.println("5. Sắp xếp sản phẩm");
            System.out.println("0. Thoát");
            Scanner input1 = new Scanner(System.in);
            choose = input1.nextInt();
            switch (choose){
                case 1:
                    Scanner a = new Scanner(System.in);
                    System.out.println("Mời bạn nhập id của sản phẩm");
                    String idsp = a.nextLine();
                    System.out.println("Mời bạn nhập tên sản phẩm");
                    String tensp = a.nextLine();
                    Scanner b = new Scanner(System.in);
                    System.out.println("Mời bạn nhập giá tiền của sản phẩm");
                    int giasp = b.nextInt();
                    Product product = new Product(idsp,tensp,giasp);
                    list.addProduct(product);
                    System.out.println("Thêm thành công sản phẩm");
                    break;
                case 2:
                    Scanner c = new Scanner(System.in);
                    System.out.println("Mời bạn nhập id sản phẩm cần sửa");
                    String idinsert = c.nextLine();
                    list.insertProduct(idinsert);
                    break;
                case 3:
                    Scanner d = new Scanner(System.in);
                    System.out.println("Mời bạn nhập tên sản phẩm cần sửa");
                    String nameFind = d.nextLine();
                    Product product1 = list.findProduct(nameFind);
                    if(product1 != null){
                        System.out.println(product1);
                    }
                    else {
                        System.out.println("Không có sản phẩm nào");
                    }
                    break;
                case 4:
                    System.out.println("Danh sách sản phẩm là: ");
                    list.Display();
                    break;
                case 5:
                    System.out.println("Danh sách sản phẩm sau khi được sắp xếp theo giá là: ");
                    list.SortProduct();
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }
}
