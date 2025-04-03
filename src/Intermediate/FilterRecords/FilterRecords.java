package Intermediate.FilterRecords;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FilterRecords {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\rp950\\OneDrive\\Desktop\\capgemini-bridgelabz\\CSVDataHandling\\src\\Intermediate\\FilterRecords\\Data.txt";

        try (BufferedReader re = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = re.readLine()) != null) {
                String[] col = line.split("\\\\s+");



                try {
                    int t = Integer.parseInt(col[0]);

                    if (t > 80) {
                        System.out.println(col[0]);
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid number format in line: " + line);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
