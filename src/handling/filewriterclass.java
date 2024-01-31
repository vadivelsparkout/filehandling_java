package handling;

import java.io.FileWriter;
import java.io.IOException;

public class filewriterclass {
    public static void main(String[] args) {
        // Specify the file path and name
        String filePath = "/home/sparkout/Desktop/daily task.txt";
        try (FileWriter fileWriter = new FileWriter(filePath)) {
            // Write content to the file
            fileWriter.write("Hello, this is some content written to the file.\n");
            fileWriter.write("You can write more lines.\n");
            fileWriter.write("And even more lines.");
            System.out.println("File written successfully at: " + filePath);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}

