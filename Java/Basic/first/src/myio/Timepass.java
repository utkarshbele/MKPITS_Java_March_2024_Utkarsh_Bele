package myio;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.Key;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
public class Timepass {
    public static void main(String[] args) throws Exception{
            // Get the file to encrypt
            File file = new File("C:\\Users\\Work\\IdeaProjects\\first\\encrypt.txt");

            // Create a key for the encryption
            byte[] key = "mysecretkey".getBytes();

            // Create a MessageDigest object to encrypt the file
            MessageDigest md = MessageDigest.getInstance("SHA-256");

            // Encrypt the file
            FileInputStream fis = new FileInputStream(file);
            byte[] data = new byte[1024];
            int read;
            while ((read = fis.read(data)) != -1) {
                md.update(data, 0, read);
            }
            fis.close();

            // Get the encrypted bytes
            byte[] encryptedBytes = md.digest();

            // Convert the encrypted bytes to ASCII
            String encryptedString = Arrays.toString(encryptedBytes);

            // Write the encrypted string to a file
            FileOutputStream fos = new FileOutputStream("C:\\Users\\Work\\IdeaProjects\\first\\encrypted.txt");
            fos.write(encryptedString.getBytes());
            fos.close();

            System.out.println("File encrypted successfully!");
        }
    }