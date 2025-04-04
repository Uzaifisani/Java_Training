package day_4.file_handling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyingFile {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("..\\LearnJava\\day_4\\file_handling\\sample.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("..\\LearnJava\\day_4\\file_handling\\sample_copy.txt"))) {
       
       String line;
       while ((line = reader.readLine()) != null) {
           writer.write(line + "\n");
       }
       System.out.println("\nFile copied successfully");
   } catch (IOException e) {
       System.out.println("Error copying file: " + e.getMessage());
   }
    }
}
