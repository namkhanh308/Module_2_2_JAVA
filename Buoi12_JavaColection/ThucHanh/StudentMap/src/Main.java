import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Smith", 30);
        hashMap.put("Anderson", 31);
        hashMap.put("Lewis", 29);
        hashMap.put("Cook", 29);
        System.out.println("Display entries in HashMap");
        System.out.println(hashMap + "\n");
//        Iterator<String> itr = hashMap.keySet().iterator();
//        while (itr.hasNext()){
//            if(itr.next() == "Cook"){
//                hashMap.put("Cook",100);
//            }
//        }
//        Iterator<String> itr1 = hashMap.keySet().iterator();
//        while (itr1.hasNext()){
//            System.out.println(hashMap.get(itr1.next()));
//        }
        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);
//        Set<String> key = treeMap.keySet();
//        for (String k: key) {
//            System.out.println(treeMap.put(k,111));
//        }
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook", 29);
        System.out.println(linkedHashMap);
        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Lewis"));

    }
}
