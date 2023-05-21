package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/** 
 *La classe WriteSymptomDataToFile iplémente ISymptomWriter.
 */
public class WriteSymptomDataToFile implements ISymptomWriter {
    
  /** 
   * Ecrit les symptômes et leurs quantités dans le fichier.
   *
   * @param symptoms la liste des symptômes avec leurs quantités
   */
  @Override
  public void writeSymptoms(Map<String, Integer> symptoms) {
    String filePath = "result.out";

    try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
      for (String symptom : symptoms.keySet()) {
        int count = symptoms.get(symptom);
        String line = symptom + " : " + count;
        writer.write(line);
        writer.newLine();
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
