package org.example;
import java.io.IOException;
 import java.io.FileWriter;
 import java.io.PrintWriter;
public class PrintWriterAppend {

    public static void main(String[] args) {

        String fileName = "File14.txt";

        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName, true))) {

            writer.println("This line will be appended.");
            writer.printf("Appended formatted content: %d %s %n", 42, "example");

            System.out.println("content successfully written to file");
        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }

    }

