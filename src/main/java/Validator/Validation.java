package Validator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Scanner;

public class Validation {

    String[] businessName;
    String[] idNumber;
    Date[] businessCreated;
    Date[] businessApplication;
    String[] businessAddress;
    Date[] businessCertification;
    int[] numEmployees; 
    boolean firstTimePresent = true;
    boolean notFirstTime = true;
    boolean businessNamePresent = true;
    boolean idNumPresent = true;
    boolean businessCreatedPresent = true;
    boolean businessApplicationPresent = true;
    boolean businessAddressPresent = true;
    boolean businessCertificationPresent = true;
    boolean businessNumEmployeesPresent = true;  
    

    public Validation() throws FileNotFoundException {

        Scanner fileScan = new Scanner(new File("businessInfo"));
        while (fileScan.hasNext()) {
            String line = fileScan.next();
            Scanner lineScan = new Scanner(line);

            String businessName = lineScan.next();
            String idNum = lineScan.next();
            String businessCreated = lineScan.next("yyyy-mm-dd");
            String businessApplication = lineScan.next("yyyy-mm-dd");
            String businessAddress = lineScan.next();
            String businessCertified = lineScan.next("yyyy-mm-dd");
            int numEmployees = lineScan.nextInt(); 
           

            if (idNum.length().equals(10)) {
                
            } 
            if (businessName.isBlank()) {
                System.out.println("Please enter a valid Business Name");
            }else if (businessName.) {
                
            }
 
            

        }

        PrintWriter pw = new PrintWriter(new File("businessInfo.json"));
    }
}
