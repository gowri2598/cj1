package com.crio.prework.activity1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileCount {
    //TODO
    // Read the contents of file using Files.newBufferedReader
    // Complete the calculation logic for lineCount, wordCount, characterCount, ParagraphCount.
    // Write the calculate output using Files.newBufferedWriter in the following format in output.txt.
    //Total Lines Count - 10
    //Total Words Count - 10
    //Total Characters Count - 10
    //Total Paragraphs Count - 10
    public static void main(String[] args) {
        int lineCount = 0;
        int wordCount = 0;
        int characterCount = 0;
        int paragraphCount = 0;
        int sentenceCount=0;


        try {
            String line;
            BufferedReader br = Files.newBufferedReader(Paths.get(
                    "/home/crio-user/workspace/core-java-i-session-activities/prework/src/main/java/com/crio/prework/activity1/sample.txt"));
            while ((line = br.readLine()) != null) {
                lineCount++;
                if (line.equals("")) {
                    paragraphCount += 1;
                } else {
                    characterCount += line.length();
                    String words[] = line.split(" ");//multiple space
                    wordCount += words.length;
                    String sentence[] = line.split("[!?.:]+");
                    sentenceCount += sentence.length;
                }
            }
            if (sentenceCount >= 1) {
                paragraphCount++;
            }
        } 
        catch (IOException io) {
            io.printStackTrace();
        }

        BufferedWriter bw;
        try {
            //BufferedWriter bw = Files.newBufferedWriter(Paths.get("/home/crio-user/workspace/core-java-i-session-activities/prework/src/main/java/com/crio/prework/activity1/output.txt"));
            bw = Files.newBufferedWriter(Paths.get(
                    "/home/crio-user/workspace/core-java-i-session-activities/prework/src/main/java/com/crio/prework/activity1/output.txt"));
            bw.write("Total Lines Count -" + lineCount);
            bw.write("\nTotal Words Count -" + wordCount);
            bw.write("\nTotal Characters Count -" + characterCount);
            bw.write("\nTotal Paragraphs Count -" + paragraphCount);
            bw.close();
            
        }

        catch (IOException io) {
            io.printStackTrace();
        }
    }
}
