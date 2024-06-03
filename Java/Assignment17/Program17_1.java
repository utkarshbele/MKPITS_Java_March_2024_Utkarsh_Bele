package Assignment17;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

public class Program17_1 {
    public static void main(String[] args) {
            String filePath = "C:/Users/Work/IdeaProjects/COllection/src/Assignment17/text.txt";
            HashSet<String> uniqueWords = new HashSet<>();

            try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                String line = reader.readLine();
                while (line != null) {
                    String[] words = line.split("\\W+");
                    for (String word : words) {
                        if (!word.isEmpty()) {
                            uniqueWords.add(word.toLowerCase());
                        }
                    }
                }
            } catch (IOException e) {
                System.out.println(e);
            }

            System.out.println("Total unique words: " + uniqueWords.size());
    }
}