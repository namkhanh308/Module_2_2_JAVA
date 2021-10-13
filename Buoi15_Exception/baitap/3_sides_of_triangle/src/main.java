import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            double c = scanner.nextDouble();
            if(a <= 0 || b <= 0 || c<= 0){
                IllegalTriangleException temp = new IllegalTriangleException();
                temp.printStackTrace();
            }
            else if ((a + b > c) || (a + c > b) || (b + c > a)) {
                System.out.println("Đây là tam giác !");
            }else {
                IllegalTriangleException temp = new IllegalTriangleException();
                temp.printStackTrace();
            }
        }
        catch (Exception e){
            System.out.println("Xảy ra ngoại lệ: Bạn đã nhập sai dữ liệu");
        }
    }

}

