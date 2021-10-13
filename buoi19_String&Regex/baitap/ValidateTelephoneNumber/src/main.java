import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class main {
    public static void main(String[] args) {
        while (true){
            System.out.println("Mời bạn nhập vào tên lớp: ");
            Scanner scanner = new Scanner(System.in);
            String text = scanner.nextLine();
            Pattern pattern = Pattern.compile("^\\(\\d{2}\\)-\\(0{1}\\d{9}\\)$");
            Matcher matcher = pattern.matcher(text);
            if((matcher.find())){
                System.out.println("Số điện thoại đúng r");
                break;
            }
            else{
                System.out.println("Số điện thoại sai r");
            }
        }
    }
}
