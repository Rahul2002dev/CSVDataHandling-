package Intermediate.FilterRecords;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class SortCSVfiles {

    public static void main(String[] args) {
        String filePath = "C:\\Users\\rp950\\OneDrive\\Desktop\\capgemini-bridgelabz\\CSVDataHandling\\src\\Intermediate\\FilterRecords\\Data.txt";


        try (BufferedReader re = new BufferedReader(new FileReader(filePath))) {
            String line;

            Map<String, Integer> employeeMap = new HashMap<>();
            while ((line = re.readLine()) != null) {
                String[] trm = line.split(" ");
                for(String tr : trm){
                    int secn = Integer.parseInt(trm[1]);
                    employeeMap.put(trm[0],secn);
                }
            }

            List<Map.Entry<String, Integer>> list = new ArrayList<>(employeeMap.entrySet());
            list.sort(Map.Entry.comparingByValue());
            list.forEach((fruit)->System.out.println(fruit.getKey() + " -> " + fruit.getValue()));
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
