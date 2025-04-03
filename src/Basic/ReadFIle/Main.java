package Basic.ReadFIle;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\rp950\\OneDrive\\Desktop\\capgemini-bridgelabz\\CSVDataHandling\\src\\Basic\\ReadFIle\\Data.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(filePath))){

            String line;

            while((line = br.readLine()) != null){
                String[] col = line.split(" ");
                System.out.print(col[0] + col[1]);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
