package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

public class WriteSymptomDataToFile implements ISymptomWriter{

@Override
public void writeSymptoms(Map<String, Integer> symptoms){
String filePath = "result.out";

    try{ 
	    FileWriter writer = new FileWriter (filePath);
        Iterator<Map.Entry<String, Integer>> iterator = symptoms.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<String, Integer> entry = iterator.next();
                String symptom = entry.getKey();
                int count = entry.getValue();
                String line = symptom + ": " + count + System.lineSeparator();
                writer.write(line);
            }
        
    }   catch (IOException e) {
				e.printStackTrace();
			}
}


 }