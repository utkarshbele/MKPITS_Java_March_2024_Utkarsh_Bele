package myio;

import java.io.*;

public class DecryptASCIIFile {
    public static void main(String[] args) throws IOException {

        File file1 = new File("C:\\Users\\Work\\IdeaProjects\\first\\encrypted.txt");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file1));
        String asciiString = bufferedReader.readLine();
            // Create a new File object for the text file to be created
            File file = new File("decrypted.txt");

            // Create a new FileWriter object to write to the text file
            FileWriter writer = new FileWriter(file);

            // Decrypt the ASCII string
            String decryptedString = new String(asciiString.getBytes(), "ASCII");

            // Write the decrypted string to the text file
            writer.write(decryptedString);

            // Close the FileWriter object
            writer.close();

            // Print a message to the console indicating that the text file has been created
            System.out.println("The text file has been created.");
        }
    }