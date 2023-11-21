package org.example;

import java.io.File;
import java.io.IOException;

public class CreateFile {

    public static void main(String[] args) {

       String fileName = "File13.txt";

        File myFile = new File(fileName);

        try{

            if (myFile.createNewFile()){
                System.out.println("File created sucessfully at " + myFile.getAbsolutePath());
            }
            else{
                System.out.println("File already exists at " + myFile.getAbsolutePath());
            }
        } catch (IOException e){
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }
    }
}