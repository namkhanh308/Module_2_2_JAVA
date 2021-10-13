import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws IOException {
        String path = "text.txt";
        File file = new File(path);
        List<Product> productsFirst = new ArrayList<>();
        int choose = -1;
        while (choose != 0 ){
            System.out.println("1. Hiển thị thông tin trong danh sách");
            System.out.println("2. Thêm sản phẩm vào danh sách");
            System.out.println("3. Tìm kiếm thông tin của sản phầm");
            System.out.println("4. Xóa sản phẩm khỏi danh sách");
            if(file.isFile()){
                productsFirst = readToFile(path);
            }
            else{
                file.createNewFile();
            }
            Scanner scanner = new Scanner(System.in);
            choose = scanner.nextInt();
            switch (choose){
                case 1:
                    displayProduct(productsFirst);
                    break;
                case 2:
                    addProduct(path,productsFirst);
                    break;
                case 3:
                    findProduct(productsFirst);
                    break;
                case 4:
                    deleteProduct(path, productsFirst);
                    break;
                case 0:
                    System.exit(1);
            }
        }



    }

    private static void deleteProduct(String path, List<Product> productsFirst) {
        System.out.println("Chức năng xóa sản phẩm");
        System.out.println("Nhập id sản phẩm bạn muốn xóa");
        Scanner scanner1 = new Scanner(System.in);
        String id = scanner1.nextLine();
        int index = -1;
        for (int i = 0; i < productsFirst.size() ; i++) {
            if(productsFirst.get(i).getId().equals(id)){
                index = i;
            }
        }
        productsFirst.remove(index);
        writeToFile(path, productsFirst);
    }

    private static void findProduct(List<Product> productsFirst) {
        System.out.println("Chức năng tìm kiếm thông tin sản phẩm");
        System.out.println("Mời bạn nhập vào id của sản phầm bạn cần tìm kiếm");
        Scanner scanner2 = new Scanner(System.in);
        String input = scanner2.nextLine();
        for (Product product : productsFirst) {
            if(product.getId().equals(input)){
                System.out.println(product);
            }
        }
    }

    private static void addProduct(String path, List<Product> productsFirst) {
        System.out.println("Chức năng thêm mới sản phẩm: ");
        System.out.println("Mời bạn nhập vào id của sản phẩm");
        Scanner scanner1 = new Scanner(System.in);
        String id = scanner1.nextLine();
        System.out.println("Mời bạn nhập vào tên của sản phẩm");
        String name = scanner1.nextLine();
        System.out.println("Mời bạn nhập vào nhà sản xuất của sản phẩm");
        String manufacturer = scanner1.nextLine();
        System.out.println("Mời bạn nhập vào mô tả của sản phẩm");
        String description = scanner1.nextLine();
        productsFirst.add(new Product(id,name,manufacturer,description));
        writeToFile(path, productsFirst);
    }

    private static void displayProduct(List<Product> productsFirst) {
        System.out.println("Chức năng hiển thị sản phẩm");
        if(productsFirst.size()==0){
            System.out.println("Không có sản phẩm nào");
        }
        else {
            for (Product product : productsFirst) {
                System.out.println(product);
            }
        }
    }

    public static void writeToFile(String path , List<Product> products){
        File file = new File(path);
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try{
            fileOutputStream = new FileOutputStream(file);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(products);
            fileOutputStream.flush();
            objectOutputStream.close();
            fileOutputStream.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public static List<Product> readToFile(String path){
        File file = new File(path);
        if(file.length() == 0){
            return new ArrayList<>();
        }
        List<Product> products = new ArrayList<>();
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try{
            fileInputStream = new FileInputStream(file);
            objectInputStream = new ObjectInputStream(fileInputStream);
            products = (List<Product>) objectInputStream.readObject();
            fileInputStream.close();
            objectInputStream.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return products;
    }


}
