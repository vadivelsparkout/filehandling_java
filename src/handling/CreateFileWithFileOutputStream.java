package handling;


	import java.io.FileOutputStream;
	import java.io.IOException;

	public class CreateFileWithFileOutputStream {

	    public static void main(String[] args) {

	        // Specify the file path and name
	        String filePath = "/home/sparkout/Desktop/new task.txt";

	        try {
	            // Create a FileOutputStream object with the specified file path
	            FileOutputStream fos = new FileOutputStream(filePath);
	// You can write data to the file here if needed
	             //For example, fos.write("Hello, World!".getBytes());

	            // Close the stream to release resources
	            fos.close();

	            System.out.println("File created successfully at: " + filePath);

	        } catch (IOException e) {
	            System.out.println("An error occurred while creating the file: " + e.getMessage());
	        }
	    }
	}



