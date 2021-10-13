import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Nam",20, "HN");
        Student student2 = new Student("Hung",21, "HN");
        Student student3 = new Student("Ha",22, "HN");
        HashMap<Integer,Student> studentMap = new HashMap<>();
        studentMap.put(1,student1);
        studentMap.put(2,student2);
        studentMap.put(3,student3);
        studentMap.put(4,student1);
        System.out.println(studentMap);
        Set<Integer> key = studentMap.keySet();
        for (int key1 : key) {
            System.out.println(studentMap.get(key1));
        }
        for(Map.Entry<Integer, Student> student : studentMap.entrySet()){
            System.out.println(student.toString());
        }
        Iterator itr = studentMap.keySet().iterator();
        while(itr.hasNext()){
            System.out.println(studentMap.get(itr.next()));
        }
        Set<Student> students = new HashSet<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        for (Student student: students ) {
            System.out.println(student);
        }
    }
}
