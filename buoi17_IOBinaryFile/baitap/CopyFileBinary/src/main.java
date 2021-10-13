import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        File sourceFile = new File("C:\\Users\\khanh\\Desktop\\New folder\\buoi17_IOBinaryFile\\baitap\\CopyFileBinary\\sourc\\dau.txt");
        File destFile = new File("C:\\Users\\khanh\\Desktop\\New folder\\buoi17_IOBinaryFile\\baitap\\CopyFileBinary\\target\\dich.txt");
        if(!sourceFile.isFile()){
            System.out.println("Tệp nguồn không tồn tại");
        }
        if(!destFile.isFile()){
            System.out.println("Tệp đích không tồn tại");
        }
        try {
            copyFileUsingStream(sourceFile, destFile);
            System.out.printf("Copy completed");
        } catch (IOException ioe) {
            System.out.printf("Can't copy that file");
            System.out.printf(ioe.getMessage());
        }
        finally {
            System.out.println("File nguồn có số byte là " + sourceFile.length());
            System.out.println("File đích có số byte là " + destFile.length());
        }
    }
    private static void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            int length = 0 ;
            while ((length = is.read()) > 0) {
                os.write((byte) length);
            }
        } finally {
            is.close();
            os.close();
        }
    }
}
