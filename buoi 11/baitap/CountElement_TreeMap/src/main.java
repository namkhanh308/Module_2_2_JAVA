import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class main {
    public static void main(String[] args) {
        TreeMap<Character,Integer> list= new TreeMap<>();
        String chuoi = "acDda";
        String chuoimoi = chuoi.toLowerCase();
        char[] charArray = chuoimoi.toCharArray();
        System.out.println(Arrays.toString(charArray));
        for (char x: charArray){
            if(Contains(list,x)){
                list.put(x,list.get(x)+1);
            }
            else {
                list.put(x,1);
            }

        }
        Set<Character> keySet = list.keySet();
        for (Character key : keySet) {
            System.out.println(key + " - " + list.get(key));
        }
    }

    public static boolean Contains(TreeMap<Character, Integer> list,char a) {
        Set<Character> keySet = list.keySet();
        for (Character key : keySet) {
            if(key.equals(a)){
                return true;
            }
        }
        return false;
    }
}
