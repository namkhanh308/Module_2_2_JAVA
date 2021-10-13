import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class main {
    public static void main(String[] args) {
        String a = "AAA";
        Stack<Character> stack= new Stack<>();
        Queue<Character> queue = new LinkedList<>();
        for (int i = 0; i < a.length(); i++) {
            stack.push(a.charAt(i));
            queue.add(a.charAt(i));
        }
        boolean check = false;
        for (int i = 0; i < a.length(); i++) {
            if(stack.pop() == queue.poll()){
                check = true;
            }
            else {
                check = false;
                break;
            }
        }
        System.out.println(check);
    }
}
