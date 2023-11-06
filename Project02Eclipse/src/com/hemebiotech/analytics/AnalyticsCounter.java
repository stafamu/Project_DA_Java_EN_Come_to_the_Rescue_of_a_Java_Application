package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

/**
 * Main class for the analytics application.
 * It orchestrates the reading, counting, and writing of symptom data.
 */
public class AnalyticsCounter {
    public static void main(String[] args) {
        // Read symptoms from a file
        ISymptomReader reader = new ReadSymptomDataFromFile("symptoms.txt");
        List<String> symptoms = reader.getSymptoms();

        // Count occurrences of each symptom
        SymptomCounter counter = new SymptomCounter();
        Map<String, Integer> symptomCounts = counter.countSymptoms(symptoms);

        // Write the symptom counts to an output file
        SymptomDataWriter writer = new SymptomDataWriter("result.out");
        writer.writeSymptoms(symptomCounts);
    }
}

