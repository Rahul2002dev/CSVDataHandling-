package Intermediate.FilterRecords;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;

public class SearchRecord {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\rp950\\OneDrive\\Desktop\\capgemini-bridgelabz\\CSVDataHandling\\src\\Intermediate\\FilterRecords\\Data.txt";

        boolean flag = false;
        try (BufferedReader re = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = re.readLine()) != null) {
                String[] col = line.split("\\s+");

                for(String cols : col){
                    if(cols.equalsIgnoreCase("rahul")){
                        flag = true;
                        break;
                    }
                }

            }

            if(flag){
                System.out.println("yes rahul is present");
            }else{
                System.out.print("no rahul is not present");
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
