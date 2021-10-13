import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public List<Integer> readFile(String name) throws IOException {
        List<Integer> numbers = new ArrayList<>();
        try{
            File file = new File(name);
            if(!file.isFile()){
                throw new FileNotFoundException();
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader br = new BufferedReader(fileReader);
            String line = "";
            while ((line = br.readLine()) != null){
                numbers.add(Integer.parseInt(line));
            }
            br.close();


        } catch (FileNotFoundException e) {
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
        return numbers;
    }
    public void writeFile(String filePath, int max){
        try{
            FileWriter writer = new FileWriter(filePath,true);
            BufferedWriter bf = new BufferedWriter(writer);
            bf.write(String.valueOf(max));
            bf.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }


}
