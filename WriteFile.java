import java.io.FileWriter;
import java.io.IOException;
public class WriteFile {
    public static void main(String[] args) {
        try{
            FileWriter myWriter = new FileWriter("filename.txt");
            myWriter.write("file in java might be tricky, but it is fun enough!!!!");
            myWriter.close();
            System.out.println("Successfully wrote file");
        }catch(IOException e){
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
    
}
