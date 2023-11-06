package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * This class is responsible for counting the occurrences of each symptom.
 */
public class SymptomCounter {

    /**
     * Counts each symptom's occurrences in the provided list and returns a sorted map.
     * 
     * @param symptoms A list of symptom strings.
     * @return A map with symptoms as keys and their counts as values, sorted alphabetically.
     */
    public Map<String, Integer> countSymptoms(List<String> symptoms) {
        Map<String, Integer> symptomCounts = new TreeMap<>(); // TreeMap will keep keys sorted
        for (String symptom : symptoms) {
            symptomCounts.put(symptom, symptomCounts.getOrDefault(symptom, 0) + 1);
        }
        return symptomCounts;
    }
}
