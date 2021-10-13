import java.io.*;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) throws IOException {
        ArrayList<Country> countries = new ArrayList<>();
        try{
            File file = new File("test.csv");
            System.out.println(file.isFile());
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String a ;
            while ((a = bufferedReader.readLine()) != null) {
                    splitCountry(a,countries);
            }
            displayCountry(countries);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void displayCountry(ArrayList<Country> countries) {
        for (Country country: countries) {
            System.out.println(country);
        }
    }

    public static void splitCountry(String line, ArrayList<Country> countries){
        if(line != null){
            String list [] = line.split(",");
            Country country = new Country(list[0],list[1],list[2]);
            countries.add(country);
        }
    }
}

