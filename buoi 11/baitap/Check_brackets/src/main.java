import java.util.Stack;
public class main {
    public static void main(String[] args) {
        Stack<Character> bStack = new Stack<>();
        String d = "s * (s – a) * (s – b * (s – c))";
        boolean check = isCheck(bStack, d);
        System.out.println(check);
        System.out.println(bStack);
    }
    private static boolean isCheck(Stack<Character> bStack, String d) {
        boolean check = true;
        for (int i = 0; i < d.length(); i++) {
            if(d.charAt(i) == '('){
                bStack.push(d.charAt(i));
            }
            else if(d.charAt(i) == ')'){
                if(bStack.isEmpty()){
                    check = false;
                    break;
                }
                else {
                    char left = bStack.pop();
                    if(left == '(' || d.charAt(i) == ')'){
                        check = true;
                    }
                    else {
                        check = false;
                    }
                }
            }
        }
        check = isCheckFinal(bStack, check);
        return check;
    }

    private static boolean isCheckFinal(Stack<Character> bStack, boolean check) {
        if(check == true && bStack.size() == 0){
            check = true;
        }
        else {
            check = false;
        }
        return check;
    }
}
