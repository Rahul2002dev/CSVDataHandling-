package Advance;

import java.io.*;
import java.util.Scanner;

public class MergeCVSfiles {
    public static void main(String[] args) {
        String sourceFileName = "C:\\Users\\rp950\\OneDrive\\Desktop\\capgemini-bridgelabz\\CSVDataHandling\\src\\Advance\\Data.txt";
        String targetFileName = "C:\\Users\\rp950\\OneDrive\\Desktop\\capgemini-bridgelabz\\CSVDataHandling\\src\\Advance\\Data1.txt";
        try{
            File sourceFile = new File(sourceFileName);
            if(sourceFile.exists()){
                FileInputStream finput = new FileInputStream(sourceFile);
                FileOutputStream foutput = new FileOutputStream(new File(targetFileName) , true);
                foutput.write(finput.readAllBytes());
                foutput.close();
                finput.close();
            }else{
                System.out.println("Source File doesn't exists. ");
            }
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
