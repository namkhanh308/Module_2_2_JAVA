import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        String path = "C:\\Users\\khanh\\Desktop\\New folder\\buoi16_IOBinaryFile\\thuchanh\\StudentsList\\temp\\temp.txt";
        students.add(new Student(1, "Đỗ Nam Khánh", "Hà Nội"));
        students.add(new Student(2, "Nguyễn Minh Quân", "Hà Nội"));
        students.add(new Student(3, "Đặng Huy Hoà", "Đà Nẵng"));
        students.add(new Student(4, "Nguyễn Khánh Tùng", "Hà Nội"));
        students.add(new Student(5, "Nguyễn Khắc Nhật", "Hà Nội"));
        writeToFile(path,students);
        List<Student> studentList = readDataFromFile(path);
        for (Student student :studentList ) {
            System.out.println(student);
        }
    }
    public static void writeToFile(String path, List<Student> students){
          ObjectOutputStream objectOutputStream = null;
          File file = new File(path);
          FileOutputStream fileOutputStream = null;
          try{
              fileOutputStream = new FileOutputStream(file);
              objectOutputStream = new ObjectOutputStream(fileOutputStream);
              objectOutputStream.writeObject(students);
              objectOutputStream.close();
              fileOutputStream.flush();
          }
          catch (Exception e){
              e.printStackTrace();
          }

    }
    public static List<Student> readDataFromFile(String path){
        List<Student> students = new ArrayList<>();
        ObjectInputStream objectInputStream = null;
        File file = new File(path);
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            objectInputStream = new ObjectInputStream(fileInputStream);
            students = (List<Student>) objectInputStream.readObject();
            fileInputStream.close();
            objectInputStream.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return students;
    }
}
