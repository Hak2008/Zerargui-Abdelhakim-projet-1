package com.hemebiotech.analytics;

<<<<<<< HEAD

import java.util.*;

public class AnalyticsCounter {

	private ISymptomReader reader;
    private ISymptomWriter writer;

    // Constructeur
=======
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

public class AnalyticsCounter {
	private static int headacheCount = 0;
	private static int rashCount = 0;
	private static int pupilCount = 0;
	private ISymptomReader reader;
    private ISymptomWriter writer;

// Constructeur
>>>>>>> 5a7915d75215e2fdaab772213c4d47ce6c2bfe87
	public AnalyticsCounter(ISymptomReader reader, ISymptomWriter writer) {
        this.reader = reader;
        this.writer = writer;

    }

<<<<<<< HEAD
	// Méthode qui récupère la liste des symptômes
=======
	// Méthode pour récupérer la liste des symptômes
>>>>>>> 5a7915d75215e2fdaab772213c4d47ce6c2bfe87
    public List<String> getSymptoms() {
        return reader.getSymptoms();
    }
	
<<<<<<< HEAD
	// Méthode qui compte les occurrences de chaque symptôme
=======
	// Méthode pour compter les occurrences de chaque symptôme
>>>>>>> 5a7915d75215e2fdaab772213c4d47ce6c2bfe87
    public Map<String, Integer> countSymptoms(List<String> symptoms) {
        Map<String, Integer> symptomCountMap = new HashMap<>();

        for (String symptom : symptoms) {
            symptomCountMap.put(symptom, symptomCountMap.getOrDefault(symptom, 0) + 1);
        }

        return symptomCountMap;
    }

<<<<<<< HEAD
	 // Méthode qui trie la liste de symptômes et d'occurrences par ordre alphabétique
=======
	 // Méthode pour trier les symptômes et les occurrences par ordre alphabétique
>>>>>>> 5a7915d75215e2fdaab772213c4d47ce6c2bfe87
    public Map<String, Integer> sortSymptoms(Map<String, Integer> symptoms) {
        Map<String, Integer> sortedSymptoms = new TreeMap<>(symptoms);
        return sortedSymptoms;
    }
<<<<<<< HEAD
    // Méthode qui écrit le résultat dans le fichier de sortie
=======
// Méthode pour écrire les symptômes dans le fichier de sortie
>>>>>>> 5a7915d75215e2fdaab772213c4d47ce6c2bfe87
    public void writeSymptoms(Map<String, Integer> symptoms) {
        writer.writeSymptoms(symptoms);
    }


<<<<<<< HEAD
=======
	public static void main(String args[]) throws Exception {
		// first get input
		BufferedReader reader = new BufferedReader (new FileReader("symptoms.txt"));
		String line = reader.readLine();

		int i = 0;
		int headCount = 0;	// counts headaches
		while (line != null) {
			i++;
			System.out.println("symptom from file: " + line);
			if (line.equals("headache")) {
				headCount++;
				System.out.println("number of headaches: " + headCount);
			}
			else if (line.equals("rush")) {
				rashCount++;
            
			}
			else if (line.contains("pupils")) {
				pupilCount++;
            
			}

			line = reader.readLine();	// get another symptom
		}
		
		// next generate output
		FileWriter writer = new FileWriter ("result.out");
		writer.write("headache: " + headacheCount + "\n");
		writer.write("rash: " + rashCount + "\n");
		writer.write("dialated pupils: " + pupilCount + "\n");
		writer.close();
        
	}

>>>>>>> 5a7915d75215e2fdaab772213c4d47ce6c2bfe87


}