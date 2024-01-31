package handling;
import java.io.File;
import java.util.Scanner;
public class scannerclassread {
    public static void main(String[] args) throws Exception
    {
        //pass the path to the file as a parameter
        File file = new File("/home/sparkout/Desktop/daily task.txt");
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine())
            System.out.println(sc.nextLine());
    }



}
