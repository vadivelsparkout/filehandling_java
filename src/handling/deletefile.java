package handling;

import java.io.*;

public class deletefile {
    public static void main(String[] args)
    {
        File file
            = new File("/home/sparkout/Desktop/daily task.txt");
 
        if (file.delete()) {
            System.out.println("File deleted successfully");
        }
        else {
            System.out.println("Failed to delete the file");
        }
    }
}




