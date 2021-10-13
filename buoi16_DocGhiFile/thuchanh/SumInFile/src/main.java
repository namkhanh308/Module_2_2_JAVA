import java.io.*;
import java.util.Scanner;

public class main {

    public void readFileText(String filePath) {
        try{
            File file = new File(filePath);
            if(!file.isFile()){
                throw new FileNotFoundException();
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader br = new BufferedReader(fileReader);
            String line;
            int sum = 0;
            while((line = br.readLine()) != null){
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();
            System.out.println("Tổng = " + sum);
        }
        catch (Exception e){
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
    }

    public static void main(String[] args) throws IOException {
        File file = new File("C:/Users/khanh/Desktop/New folder/buoi16_DocGhiFile/thuchanh/SumInFile/test.txt");
        file.createNewFile();
        System.out.println("Nhập đường dẫn file: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        main readFileEx = new main();
        readFileEx.readFileText(path);
    }
}