package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

public class WriteSymptomDataToFile implements ISymptomWriter{

@Override
public void writeSymptoms(Map<String, Integer> symptoms){

    try{ 
	    FileWriter writer = new FileWriter ("result.out");
        for (Map.Entry<String, Integer> entry : symptoms.entrySet()) {
                String symptom = entry.getKey();
                int count = entry.getValue();
                String line = symptom + ": " + count + "\n";
                writer.write(line);

            }
        
    }   catch (IOException e) {
				e.printStackTrace();
			}
}


 }