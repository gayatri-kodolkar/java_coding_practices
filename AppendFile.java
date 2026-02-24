import java.io.FileWriter;
import java.io.IOException;

public class AppendFile {
    public static void main(String[] args) {
        try (FileWriter myWriter = new FileWriter("filename.txt", true)) {
            myWriter.write("\nAppended Text");
            System.out.println("Successfully appended to file");
        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}