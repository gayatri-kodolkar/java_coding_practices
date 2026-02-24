import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReaderExample {
    public static void main(String[] args) {
        // Specify the path to the file you want to read
        String filePath = "filename.txt"; // Assumes 'myFile.txt' is in the project root

        try {
            // Create a File object
            File file = new File(filePath);

            // Create a Scanner object to read from the file
            Scanner scanner = new Scanner(file);

            System.out.println("Reading content from: " + filePath);

            // Read the file line by line
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }

            // Close the scanner to release resources
            scanner.close();

            //System.err.println()--> use only for in try-catch block for showing error
        } catch (FileNotFoundException e) {
            System.err.println("Error: The file '" + filePath + "' was not found.");
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("An unexpected error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}