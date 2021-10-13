import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class main {
    public static void main(String[] args) {
        while (true){
            System.out.println("Mời bạn nhập vào tên lớp: ");
            Scanner scanner = new Scanner(System.in);
            String text = scanner.nextLine();
            Pattern pattern = Pattern.compile("^[A|C|P]{1}\\d{4}[G|H|I|K|L|M]{1}$");
            Matcher matcher = pattern.matcher(text);
//            System.out.println(matcher.matches());
            if((matcher.find())){
                System.out.println("Tên lớp đúng r");
                break;
            }
            else{
                System.out.println("Tên lớp sai r");
            }
        }
    }
}
