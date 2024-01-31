package handling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class writestring {
    public static void main(String[] args)
        throws IOException{
        // Assigning the content of the file
        String text   = "Welcome to geekforgeeks\nHappy Learning!";
        // Defining the file name of the file
        Path fileName = Path.of("/home/sparkout/Desktop/daily task.txt");
        // Writing into the file
        Files.writeString(fileName, text);
        // Reading the content of the file
        String file_content = Files.readString(fileName);
        // Printing the content inside the file
        System.out.println(file_content);
    }
 
 

}