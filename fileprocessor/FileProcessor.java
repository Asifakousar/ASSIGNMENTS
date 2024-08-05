package fileprocessor;

import java.io.*;
import java.util.List;

public class FileProcessor {
    public void processFiles(List<String> filePaths) {
        for (String filePath : filePaths) {
            try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.print(line + " ");
                }
            } catch (IOException e) {
                System.err.println("Error reading file: " + filePath);
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        List<String> files = List.of("src/FileProcessor/File1.txt", "src/FileProcessor/File2.txt", "src/FileProcessor/File3");
        FileProcessor processor = new FileProcessor();
        processor.processFiles(files);
    }
}