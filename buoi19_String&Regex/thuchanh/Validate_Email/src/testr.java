import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class testr {
    public static void main(String[] args) {
        String text = "30-8-2000";
        String text1 = "ab123@gmail.com";
        Pattern pattern = Pattern.compile("^[a-z[0-9]]+@\\w+\\.\\w+$");
        Matcher matcher = pattern.matcher(text1);
        System.out.println(matcher.find());
        if(matcher.find()){
            System.out.println("Oke");
        }
    }
}
