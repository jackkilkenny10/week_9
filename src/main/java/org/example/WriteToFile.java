package org.example;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
public class WriteToFile {

    public static void main(String[] args) {
        String fileName = "File14.txt";
        try (FileWriter writer = new FileWriter(fileName, true)) {

            writer.append("more content test.");

            System.out.println("content successfully written to file.");
        }
        catch (IOException e) {
            System.out.println("An error occurrd while writing to file.");
            e.printStackTrace();
        }
    }
}
