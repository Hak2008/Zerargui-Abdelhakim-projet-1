package com.hemebiotech.analytics;

import java.util.*;

public class AnalyticsCounter {

    private ISymptomReader reader;
    private ISymptomWriter writer;


// Constructeur
 public AnalyticsCounter(ISymptomReader reader, ISymptomWriter writer) {
    this.reader = reader;
    this.writer = writer;

 }

 // Méthode qui récupère la liste des symptômes
 public List<String> getSymptoms() {
    return reader.getSymptoms();
 }
 
 // Méthode qui compte les occurrences de chaque symptôme
 public Map<String, Integer> countSymptoms(List<String> symptoms) {
        
    Map<String, Integer> symptomCountMap = new HashMap<>();

    for (String symptom : symptoms) {
        symptomCountMap.put(symptom, symptomCountMap.getOrDefault(symptom, 0) + 1);
    }
    return symptomCountMap;
 }

 // Méthode qui trie la liste de symptômes et d'occurrences par ordre alphabétique
 public Map<String, Integer> sortSymptoms(Map<String, Integer> symptoms) {
    Map<String, Integer> sortedSymptoms = new TreeMap<>(symptoms);
    return sortedSymptoms;

 }

// Méthode qui écrit le résultat dans le fichier de sortie
 public void writeSymptoms(Map<String, Integer> symptoms) {
    writer.writeSymptoms(symptoms);
 }
}
