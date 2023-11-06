package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * A simple implementation of ISymptomReader that reads symptom data from a file.
 */
public class ReadSymptomDataFromFile implements ISymptomReader {
    private String filepath;

    /**
     * Constructor that initializes the filepath for reading symptoms.
     * 
     * @param filepath A full or partial path to a file with symptom strings in it, one per line.
     */
    public ReadSymptomDataFromFile(String filepath) {
        this.filepath = filepath;
    }

    /**
     * Reads symptoms from the specified file and returns them as a list.
     * 
     * @return A list of all symptoms read from the file. Duplicates are possible/probable.
     */
    @Override
    public List<String> getSymptoms() {
        ArrayList<String> symptoms = new ArrayList<>();
        if (filepath != null) {
            try (BufferedReader reader = new BufferedReader(new FileReader(filepath))) {
                String line = reader.readLine();
                while (line != null) {
                    symptoms.add(line);
                    line = reader.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return symptoms;
    }
}
