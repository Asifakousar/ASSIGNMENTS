package largedata;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LargeDataFileProcessing {
    public static void main(String[] args){
        String inputFile = "src/largedata/transactions.txt";
        String outputFile = "src/largerdata/filtered_transaction.txt";
        double thresholdAmount = 1000.0;

        try{
            processTransactions(inputFile, outputFile, thresholdAmount);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public static void processTransactions(String inputFile, String outputFile, double thresholdAmount)throws IOException{
        try(BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))){
            String line;
            while((line = reader.readLine()) !=null){
                
            }
        }
    }
}