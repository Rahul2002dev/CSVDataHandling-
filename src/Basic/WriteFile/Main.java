package Basic.WriteFile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Exception {
        String filePath = "C:\\Users\\rp950\\OneDrive\\Desktop\\capgemini-bridgelabz\\CSVDataHandling\\src\\Basic\\WriteFile\\Data.txt";


        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))){

            writer.write("id , Name , departmant , Salary\n");
            writer.write("23, Rahul , cse , 3\n");
            writer.write("45 , patel , vdr , 2\n");
            writer.write("56 , kumar, bft ,1\n");

            writer.close();
            System.out.println("file Written succcessfull");


        }catch (IOException e){
            System.out.print(e.fillInStackTrace());
        }
    }
}
