package com.inputoutput;

import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class InputOutputDemo {
    public static void main(String[] args) {
        File employeeInfoFile = new File("C:\\InputoutputIO\\EmployeeInfo.txt");
        InputOutputDemo demo = new InputOutputDemo();
        demo.writeToFile(employeeInfoFile);
    }
    public void writeToFile(File fileToWrite){
        PrintWriter employeeInfoWriter = null;
        try{
            employeeInfoWriter = new PrintWriter(fileToWrite);
            employeeInfoWriter.println("The name of the employee is Harris.");
            employeeInfoWriter.println("The name of the employee's department  is Tech-Design.");
            employeeInfoWriter.println("The hourly salary of the employee is rupees 2000 per hour.");
        }
        catch (FileNotFoundException e){
            System.out.println("The given file was not found on the local disc,"+fileToWrite.getName());
            throw new RuntimeException(e);
        }
        finally {
            employeeInfoWriter.close();
        }
    }
}
