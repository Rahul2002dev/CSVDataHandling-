package Advance;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrintDupicateCSV {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\rp950\\OneDrive\\Desktop\\capgemini-bridgelabz\\CSVDataHandling\\src\\Advance\\Data1.txt";


        try (BufferedReader re = new BufferedReader(new FileReader(filePath))) {
            String line;

            Map<String, Integer> employeeMap = new HashMap<>();
            while ((line = re.readLine()) != null) {
                String[] trm = line.split(" ");

                if(employeeMap.containsKey(trm[0])){
                    System.out.println("duplicate data is : "+trm[0]);;
                    employeeMap.put(trm[0],(employeeMap.get(trm[0])+1));
                }else{
                    employeeMap.put(trm[0], 1);
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

    }
}

