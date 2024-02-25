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

     import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BusinessValidator {

    public static boolean isBusinessNameValid(String[] businessNames) {
        for (String name : businessNames) {
            if (name == null || name.trim().isEmpty()) {
                return false; // Business name should not be null or empty
            }
        }
        return true;
    }

    public static boolean isIdValid(String[] ids) {
        for (String id : ids) {
            if (id == null || id.trim().isEmpty()) {
                return false; // ID should not be null or empty
            }
        }
        return true;
    }

    public static boolean isDateValid(String[] dates) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);

        for (String dateString : dates) {
            try {
                dateFormat.parse(dateString); // Try parsing the date
            } catch (ParseException e) {
                return false; // Invalid date format
            }
        }
        return true;
    }

    public static boolean isIntegerValid(Integer[] integers) {
        for (Integer num : integers) {
            if (num == null) {
                return false; // Integer should not be null
            }
        }
        return true;
    }

    public static boolean isAddressValid(String[] addresses) {
        for (String address : addresses) {
            if (address == null || address.trim().isEmpty()) {
                return false; // Address should not be null or empty
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Example usage
        String[] businessNames = {"ABC Inc.", "XYZ Ltd.", ""};
        String[] ids = {"123", "", "456"};
        String[] dateArray = {"2022-01-01", "invalidDate", "2023-05-10"};
        Integer[] employees = {100, null, 50};
        String[] addresses = {"123 Main St.", "", "456 Broad Ave."};

        // Perform validations
        boolean isBusinessNameValid = isBusinessNameValid(businessNames);
        boolean isIdValid = isIdValid(ids);
        boolean isDateValid = isDateValid(dateArray);
        boolean isEmployeeValid = isIntegerValid(employees);
        boolean isAddressValid = isAddressValid(addresses);

        // Output results
        System.out.println("Business Name Valid: " + isBusinessNameValid);
        System.out.println("ID Valid: " + isIdValid);
        System.out.println("Date Valid: " + isDateValid);
        System.out.println("Employee Valid: " + isEmployeeValid);
        System.out.println("Address Valid: " + isAddressValid); 

        private static void writeJSONToFile(JSONObject jsonObject, String fileName) {
        try (FileWriter fileWriter = new FileWriter(fileName)) {
            fileWriter.write(jsonObject.toString(2)); // Pretty print with 2 spaces indentation
            System.out.println("Data written to " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }
}
}
