import java.util.*;

public class ProductManager {
    public ArrayList<Product> listProduct;

    public ProductManager() {
        listProduct = new ArrayList<>();
    }
    public void addProduct(Product sp){
        listProduct.add(sp);
    }
    public void insertProduct(String id){
        for (int i = 0; i < listProduct.size(); i++) {
            if(listProduct.get(i).getId().equals(id)){
                int choose = 11;
                while (choose != 3){
                    System.out.println("Bạn muốn sửa gì");
                    System.out.println("1. Sửa tên");
                    System.out.println("2. Sửa giá");
                    System.out.println("3. Thoát");
                    Scanner input1 = new Scanner(System.in);
                    choose = input1.nextInt();
                    switch (choose){
                        case 1:
                            System.out.println("Nhập tên mới của sản phẩm mà bạn cần sửa");
                            Scanner input = new Scanner(System.in);
                            String new_ten = input.nextLine();
                            listProduct.get(i).setTenSp(new_ten);
                            break;
                        case 2:
                            System.out.println("Nhập giá mới của sản phẩm");
                            Scanner input2 = new Scanner(System.in);
                            int new_gia = input2.nextInt();
                            listProduct.get(i).setGia(new_gia);
                            break;
                        case 3:
                            System.out.println("Bạn không sửa gì cả");
                            break;
                    }
                }
            }
        }
        System.out.println("Không có sản phẩm nào có id là: " + id);
    }
    public void deleteProduct(String id){
        int index = -1;
        for (int i = 0; i < listProduct.size(); i++) {
            if(listProduct.get(i).getId() == id){
                index = i;
            }
        }
        listProduct.remove(index);
    }
    public Product findProduct(String ten){
        for (int i = 0; i < listProduct.size(); i++) {
            if(listProduct.get(i).getTenSp() == ten){
                return listProduct.get(i);
            }
        }
        return null;
    }
    public void SortProduct(){
        ArrayList<Product> newArr = listProduct;
        PriceComparator priceComparator = new PriceComparator();
        Collections.sort(newArr, priceComparator);
        System.out.println("Sắp xếp theo giá");
        for(Product st : newArr){
            System.out.println(st.toString());
        }
    }

    public void Display(){
        for (Product sp: listProduct ) {
            System.out.println(sp);
        }
    }
}
