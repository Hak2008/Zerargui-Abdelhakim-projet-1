package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

public class WriteSymptomDataToFile implements ISymptomWriter{
    

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
