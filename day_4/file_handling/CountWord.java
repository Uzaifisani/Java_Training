package day_4.file_handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountWord {
    public static void main(String[] args) {
        System.out.println("Task 5: Counting Words in a File");
        try (BufferedReader reader = new BufferedReader(new FileReader("..\\LearnJava\\day_4\\file_handling\\sample.txt"))) {
            String line;
            int wordCount = 0;
            
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }
            
            System.out.println("\nTotal word count in file: " + wordCount);
        } catch (IOException e) {
            System.out.println("Error counting words: " + e.getMessage());
        }
    }
}
