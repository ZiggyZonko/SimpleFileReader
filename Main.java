import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Specify the path to your text file
        String filePath = "C:/Users/zacha/OneDrive/Desktop/2024/Java/FileReader/src/read/read.txt";

        try {
            // Read all lines from the file
            List<String> lines = Files.readAllLines(Paths.get(filePath));

            // Print each line
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println(STR."Error reading the file: \{e.getMessage()}");
        }
    }
}
