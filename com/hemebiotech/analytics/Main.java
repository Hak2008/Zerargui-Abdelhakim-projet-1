package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

<<<<<<< HEAD
public class Main {
    public static void main(String[] args) {
        ISymptomReader reader = new ReadSymptomDataFromFile("symptoms.txt");
        ISymptomWriter writer = new WriteSymptomDataToFile();
        AnalyticsCounter counter = new AnalyticsCounter(reader, writer);

        List<String> symptoms = counter.getSymptoms();

        Map<String, Integer> symptomCountMap = counter.countSymptoms(symptoms);

        Map<String, Integer> sortedSymptoms = counter.sortSymptoms(symptomCountMap);

        counter.writeSymptoms(sortedSymptoms);
    }
}
=======

>>>>>>> 5a7915d75215e2fdaab772213c4d47ce6c2bfe87
