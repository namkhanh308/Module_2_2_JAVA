import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static int findMax(List<Integer> numbers){
        int max = numbers.get(0);
        for (Integer number : numbers) {
            if(number > max){
                max =number;
            }
        }
        return max;
    }

    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\khanh\\Desktop\\New folder\\buoi16_DocGhiFile\\thuchanh\\MaxInFile\\test.txt");
        file.createNewFile();
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("C:\\Users\\khanh\\Desktop\\New folder\\buoi16_DocGhiFile\\thuchanh\\MaxInFile\\test.txt");
        int max = findMax(numbers);
        System.out.println(max);
        readAndWriteFile.writeFile("C:\\Users\\khanh\\Desktop\\New folder\\buoi16_DocGhiFile\\thuchanh\\MaxInFile\\test1.txt", max);
    }
}
