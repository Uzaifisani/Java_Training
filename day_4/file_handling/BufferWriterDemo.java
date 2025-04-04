package day_4.file_handling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterDemo {
    public static void main(String[] args) {
        System.out.println("Task 2: Appending to a File using BufferedWriter");
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("..\\LearnJava\\day_4\\file_handling\\sample.txt",true))){
            writer.write("\nAppending the Text");
            System.out.println("Text Appended Successfully");
            writer.close();
        }catch(IOException e){
            System.out.println("Error Appending File "+e.getMessage());
        }
    }
}
