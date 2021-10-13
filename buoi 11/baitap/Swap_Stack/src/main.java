import java.util.Arrays;
import java.util.Stack;

public class main {
    public static void main(String[] args) {
        Stack<Integer> ListInterger = new Stack<Integer>();
        int [] listInt = new int[3];
        ListInterger.push(1);
        ListInterger.push(3);
        ListInterger.push(4);
        listInt[0] = ListInterger.pop();
        listInt[1] = ListInterger.pop();
        listInt[2] = ListInterger.pop();
        System.out.println(Arrays.toString(listInt));

        Stack<Character> wStack = new Stack<>();
        String word = "ABC";
        char [] mword = new char[3];
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            wStack.push(c);
        }
        for (int i = 0; i < word.length(); i++) {
            mword[i] = wStack.pop();
        }
        System.out.println(Arrays.toString(mword));
    }
}
