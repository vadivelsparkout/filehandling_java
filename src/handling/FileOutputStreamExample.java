package handling;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {
    public static void main(String[] args) {
        // Specify the file path and name
        String filePath = "/home/sparkout/Desktop/daily task.txt";
        try (FileOutputStream fos = new FileOutputStream(filePath)) {
            // Write content to the file as bytes
            String content = "Hello, this is some content written to the file.\n" +"You can write more lines.\n" +"And even more lines.";
            byte[] bytes = content.getBytes();
            fos.write(bytes);
            System.out.println("File written successfully at: " + filePath);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        } 
        
        }
    }
