import java.io.*;
public class ExceptionChaining extends Exception {
    public static void main(String[] args) {
        try {
            readFromFile("nonexistent-file.txt");
        } catch (CustomFileReadException e) {
            System.out.println("CustomFileReadException: " + e.getMessage());
            System.out.println("Original cause: " + e.getCause().getMessage());
        }
    }
    static void readFromFile(String filename) throws CustomFileReadException {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            reader.close();
        } catch (FileNotFoundException e) {
            throw new CustomFileReadException("Error reading file: " + filename, e);
        } catch (IOException e) {
            throw new CustomFileReadException("Error occurred while reading file", e);
        }
    }
}

class CustomFileReadException extends Exception {
    public CustomFileReadException(String message, Throwable cause) {
        super(message, cause);
    }
}
