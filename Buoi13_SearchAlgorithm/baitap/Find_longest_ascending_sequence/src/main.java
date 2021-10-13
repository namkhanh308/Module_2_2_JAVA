import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        ArrayList<Character> arr = new ArrayList<Character>();
        char min = input.charAt(0);
        int indexMin = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) < min) {
                min = input.charAt(i);
                indexMin = i;
            }
        }
        System.out.println(indexMin);
        arr.add(min);
        for (int i = 0; i < input.length(); i++) {
            System.out.println(input.charAt(i) + ": " + (int) input.charAt(i));
        }

        char temp = min;
        for (int i = indexMin + 1; i < input.length(); i++) {
            if (input.charAt(i) > temp) {
                temp = input.charAt(i);
                arr.add(temp);
            }
        }
        System.out.println(arr);
    }
}


