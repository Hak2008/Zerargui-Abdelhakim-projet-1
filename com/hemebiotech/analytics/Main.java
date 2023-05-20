package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ISymptomReader reader = new ReadSymptomDataFromFile("symptoms.txt");
        ISymptomWriter writer = new WriteSymptomDataToFile();
        AnalyticsCounter counter = new AnalyticsCounter(reader, writer);

        // Récupère la liste des symptômes à partir du fichier
        List<String> symptoms = counter.getSymptoms();

        // Compte les occurrences de chaque symptôme
        Map<String, Integer> symptomCountMap = counter.countSymptoms(symptoms);

        // Trie les symptômes par ordre alphabétique
        Map<String, Integer> sortedSymptoms = counter.sortSymptoms(symptomCountMap);

        // Écrit les symptômes et leurs quantités dans le fichier "result.out"
        counter.writeSymptoms(sortedSymptoms);
    }
}