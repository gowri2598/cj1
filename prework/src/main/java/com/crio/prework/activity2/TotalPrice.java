package com.crio.prework.activity2;
import java.net.URI;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;
public class TotalPrice {
    //TODO
    // Read all the contents of file using Files.readAllLines
    // create new arraylist for storing lines to be written to file
    // Iterate over lines, Split each line by comma, make calcluations and then add line to the newly created arraylist.
    // Write the calculated output lines present in the arraylist using Files.write in the following format in sample1.csv
    // ITEM, DESCRIPTION,TOTAL_PRICE
    public static void main(String args[]) {
        String fileName = "/home/crio-user/workspace/core-java-i-session-activities/prework/src/main/java/com/crio/prework/activity2/sample.csv";

        try
        {
            
            List<String> lines = Files.readAllLines(Paths.get(fileName), Charset.defaultCharset());
            List<String> writeLines = new ArrayList<>();
                
            
            for (String line : lines) {
                String[] tokens = line.split(",");//csv
                double price=Integer.parseInt(tokens[2])*Integer.parseInt(tokens[3]);
                writeLines.add(tokens[0]+","+tokens[1]+","+price);
            }

            Files.write(Paths.get("/home/crio-user/workspace/core-java-i-session-activities/prework/src/main/java/com/crio/prework/activity2/sample_output.csv"), writeLines);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}