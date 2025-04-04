package day_4.file_handling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) {
        System.out.println("Task 1: Creating and Writing to a File using FileWriter");
        try(FileWriter writer= new FileWriter("..\\LearnJava\\day_4\\file_handling\\sample.txt")) 
        {
            writer.write("Hello this is Uzaif Here");
            System.out.println("Successfully Wrote to File ");   
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

    }
}
