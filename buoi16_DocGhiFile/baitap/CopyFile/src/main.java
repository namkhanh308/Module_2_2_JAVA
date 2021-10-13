import java.io.*;
import java.nio.charset.StandardCharsets;

public class main {
    public static void Copy(String source,String target) throws IOException {
        FileInputStream fileInputStream = null;
        BufferedInputStream br = null;
        FileOutputStream fileOutputStream = null;
        BufferedOutputStream bw = null;
        try{
            fileInputStream = new FileInputStream(source);
            fileOutputStream = new FileOutputStream(target);
            br = new BufferedInputStream(fileInputStream);
            bw = new BufferedOutputStream(fileOutputStream);
            int i = 0 ;
            String temp = "";
            while ((i = br.read()) != -1){
                System.out.println(i);
                temp += (char)i;
            }
            System.out.println(temp);
            byte b []  = temp.getBytes();
            bw.write(b);
            bw.flush();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            fileInputStream.close();
            fileOutputStream.close();
            br.close();
            bw.close();
        }
    }

    public static void main(String[] args) throws IOException {
        String source = "C:\\Users\\khanh\\Desktop\\New folder\\buoi16_DocGhiFile\\baitap\\CopyFile\\source.txt";
        String target = "C:\\Users\\khanh\\Desktop\\New folder\\buoi16_DocGhiFile\\baitap\\CopyFile\\target.txt";
        File SourceFile = new File(source);
        File TargetFile = new File(target);
        if(!SourceFile.isFile()){
            System.err.println("Tệp nguồn hiện không có");
            SourceFile.createNewFile();
        }
        else {
            System.out.println("Tệp nguồn đã tồn tại");
        }
        if(!TargetFile.isFile()){
            System.err.println("Tệp đích hiện không có");
            TargetFile.createNewFile();
        }
        else {
            System.out.println("Tệp đích đã tồn tại");
        }
        Copy(source,target);
    }
}
