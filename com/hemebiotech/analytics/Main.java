package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;


public class Main {

  /**
   *Méthode principale qui initialise les objets nécessaires, effectue le comptage des symptômes,
   *les trie par ordre alphabétique et les écrit dans un fichier de sortie.
   *
   *@param args les arguments de ligne de commande
   */
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

