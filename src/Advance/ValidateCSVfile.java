package Advance;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateCSVfile {
    public static boolean phoneRegex(String Phone) {
        String phonePattern = "^(\\d{10})$|^(\\d{3}-\\d{3}-\\d{4})$|^(\\(\\d{3}\\)\\d{3}-\\d{4})$";
        return Phone.matches(phonePattern);
    }

    public static boolean  emailRegex(String email) {
        String emailPattern = "(?i)^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,6}$";
        return email.matches(emailPattern);
    }
    public static void main(String[] args) throws Exception{
        String filePath = "C:\\Users\\rp950\\OneDrive\\Desktop\\capgemini-bridgelabz\\CSVDataHandling\\src\\Advance\\Data.txt";


        try(BufferedReader tyr = new BufferedReader(new FileReader(filePath))){
            String line;

            while((line = tyr.readLine()) != null){
                String[] sr = line.split(" ");
                String Phone = sr[2];
                String email = sr[1];



                if(!phoneRegex(Phone) || !emailRegex(email)){
                    System.out.println("Invalid details");
                }else{
                    System.out.println("Valid Details");
                }

                if(!emailRegex(email)){
                    System.out.println("Invalid details");
                }else{
                    System.out.println("Valid Details");
                }
            }

        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }

    }
}
