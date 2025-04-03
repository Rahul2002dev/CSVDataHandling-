package Advance;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;


class SimpleData {
    String email;
    String phonenumber;

    SimpleData(String email,String phonenumber){
        this.email = email;
        this.phonenumber = phonenumber;
    }

    @Override
    public String toString() {
        return "Email: " + email + ", Phone: " + phonenumber;
    }
}
public class DataToObject {
    public static void main(String[] args) throws Exception {
        String filePath = "C:\\Users\\rp950\\OneDrive\\Desktop\\capgemini-bridgelabz\\CSVDataHandling\\src\\Advance\\Data.txt";


        try(BufferedReader tyr = new BufferedReader(new FileReader(filePath))){
            String line;

            ArrayList<SimpleData> tr = new ArrayList<>();
            while((line = tyr.readLine()) != null){
                String[] sr = line.split(" ");
                String Phone = sr[2];
                String email = sr[1];
                SimpleData data = new SimpleData(email,Phone);
                tr.add(data);
            }


            for(Object obj : tr){
                System.out.println(obj);
            }

        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
    }
}
