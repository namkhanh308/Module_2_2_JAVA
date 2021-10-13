import java.util.Arrays;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size:");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values:");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.print("Your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
        System.out.println("\nBegin sort processing...");
        insertionSortByStep(list);
        System.out.println("Kết quả sau khi sắp xếp là: ");
        System.out.println(Arrays.toString(list));
    }
    public static void insertionSortByStep(int[] list){
        boolean check = false;
        for (int i = 0; i < list.length ; i++) {
            int pos = i;
            int x = list[i];
            while (pos > 0 && x < list[i-1] ){
                System.out.println("Gán phần tử tại vị trí "+ pos + " = " + list[pos-1]);
                list[pos] = list[pos-1];
                pos--;
                check = true;
            }
            list[pos] = x;
            if(check == true){
                System.out.println("Gán phần tử tại vị trí "+ pos + " = " + x);
                System.out.println("Kết quả sau khóa "+ i  + " là: " + Arrays.toString(list));
            }
            else {
                System.out.println("Khóa " + i +" không có sự thay đổi");
            }
            check = false;
        }
    }
}
