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

<<<<<<< HEAD
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

=======
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


>>>>>>> 5a7915d75215e2fdaab772213c4d47ce6c2bfe87
 }