package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

/**
 * This class is responsible for writing the symptom counts to an output file.
 */
public class SymptomDataWriter {
    private String filepath;

    /**
     * Constructor that initializes the filepath for writing symptoms.
     * 
     * @param filepath A full or partial path to a file to write the symptom counts.
     */
    public SymptomDataWriter(String filepath) {
        this.filepath = filepath;
    }

    /**
     * Writes the symptom counts to the specified file in alphabetical order.
     * 
     * @param symptomCounts A map with symptoms as keys and their counts as values.
     */
    public void writeSymptoms(Map<String, Integer> symptomCounts) {
        try (FileWriter writer = new FileWriter(filepath)) {
            for (Map.Entry<String, Integer> entry : symptomCounts.entrySet()) {
                writer.write(entry.getKey() + ": " + entry.getValue() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
