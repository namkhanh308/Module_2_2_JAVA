import java.util.Stack;

public class main {
    public static void  main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int num = 11;
        test(num,stack);
        String a = "";
        while (stack.size() != 0){
            a +=stack.pop();
        }
        System.out.println(a);
    }
    public static void test(int num, Stack<Integer> stack){
        int a = num / 2;
        stack.push(num % 2);
        if(a == 0){
            return;
        }
        else {
            test(a,stack);
        }
    }
}

