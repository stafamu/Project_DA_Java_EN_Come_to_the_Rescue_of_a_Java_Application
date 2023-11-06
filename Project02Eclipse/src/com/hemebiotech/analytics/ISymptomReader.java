package com.hemebiotech.analytics;

import java.util.List;

/**
 * The interface for symptom readers.
 * Implementations of this interface are responsible for reading symptom data from a source.
 */
public interface ISymptomReader {
    /**
     * Reads symptoms from a data source and returns them as a list.
     * 
     * @return A list of all symptoms obtained from the data source. Duplicates are possible/probable.
     */
    List<String> getSymptoms();
}
