import java.io.*;

public class main {
    public static void main(String[] args) throws IOException {
//        FileOutputStream fileOutputStream = new FileOutputStream("a.txt");
//        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
//        String dmloc = "";
//        byte[] dmloc1 = dmloc.getBytes();
//        int [] a = {1,2,3,4,5};
//        for (int i = 0; i < a.length ; i++) {
//            bufferedOutputStream.write(a[i]);
//        }

//        bufferedOutputStream.flush();
//        fileOutputStream.close();
//        bufferedOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("b.txt");

//        FileOutputStream fileOutputStream = new FileOutputStream("b.txt");
//        DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
        int x ;
//        String a = "";
        while((x = fileInputStream.read())!= -1){
            System.out.println((char) x);
        }
//        fileOutputStream.write(a.getBytes());
//        fileOutputStream.flush();
        fileInputStream.close();
//        fileOutputStream.close();

    }
}
