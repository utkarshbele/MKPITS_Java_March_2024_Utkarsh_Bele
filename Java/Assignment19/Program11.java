package Assignment19;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;
//Read a text file line by line using the Files.lines() method
// and process each line using a stream.
public class Program11 {
    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\Work\\IdeaProjects\\Java1.8 Features\\src\\Assignment19\\sample.txt";
        // Read and process each line in the file using a stream
        Stream<String> lines = Files.lines(Paths.get(filePath));
        lines.map(String::toUpperCase).forEach(System.out::println);
    }
}