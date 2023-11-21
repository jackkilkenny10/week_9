package org.example;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class PrintApp {

    public static void main(String[] args) {

        Scanner FileName = new Scanner(System.in);
        System.out.println("Enter File Name");
        String fileName = FileName.nextLine();

        File myFile = new File(fileName);
        String data = "Test File String2";

        try {
            Scanner fileScanner = new Scanner(myFile);
            System.out.println("Contents of the file:");
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                System.out.println(line);
            }
        }
        catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }

    }

}