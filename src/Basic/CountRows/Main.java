package Basic.CountRows;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\rp950\\OneDrive\\Desktop\\capgemini-bridgelabz\\CSVDataHandling\\src\\Basic\\ReadFIle\\Data.txt";

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){

            String Line;
            int cnt = 0;
            while((Line = reader.readLine()) != null){
                cnt++;
            }

            System.out.println(cnt);
        }catch(Exception e){
            System.out.println(e.fillInStackTrace());
        }
    }
}
