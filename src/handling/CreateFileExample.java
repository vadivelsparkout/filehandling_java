package handling;


	import java.io.File;
	import java.io.IOException;
	public class CreateFileExample {
	    public static void main(String[] args) {
	        // Specify the file path and name
	        String filePath = "/home/sparkout/Desktop/news.txt";
	        // Create a File object
	        File newFile = new File(filePath);
	        try {
	            // Create a new file
	            boolean fileCreated = newFile.createNewFile();
	            if (fileCreated) {
	                System.out.println("File created successfully at: " + newFile.getAbsolutePath());
	            } else {
	                System.out.println("File already exists or cannot be created.");
	            }
	        } catch (IOException e) {
	            System.out.println("An error occurred while creating the file: " + e.getMessage());
	        }
	    }
	}



