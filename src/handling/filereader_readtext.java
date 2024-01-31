package handling;

import java.io.*;
public class filereader_readtext {
    public static void main(String[] args) throws Exception
    {
        FileReader fr = new FileReader("/home/sparkout/Desktop/daily task.txt");
        int i;
        while ((i = fr.read()) != -1)
 
             //Print all the content of a file
            System.out.print((char)i);
    }
}



