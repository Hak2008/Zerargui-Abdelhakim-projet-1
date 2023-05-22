package com.hemebiotech.analytics;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


public class AnalyticsCounter {

  private ISymptomReader reader;
  private ISymptomWriter writer;


  /**
  *Crée le constructeur AnalyticsCounter avec les objets ISymptomReader et ISymptomWriter spécifiés.
  *
  *@param reader l'objet ISymptomReader utilisé pour lire les symptômes
  *
  *@param writer l'objet ISymptomWriter utilisé pour écrire les résultats
  */
  public AnalyticsCounter(ISymptomReader reader, ISymptomWriter writer) {
    this.reader = reader;
    this.writer = writer;

  }

  /**
  *Crée la méthode qui récupère la liste des symptômes.
  *
  *@return la liste des symptômes
  */
  public List<String> getSymptoms() {
    return reader.getSymptoms();
  }
 
  /**
   *Crée la méthode qui compte les occurences de chaque symptômes existant.
   * 
   *@param symptoms la liste des symptômes à compter
   *
   *@return une map qui contient les symptômes(clés) et le nombre d'occurences(valeurs)
   */
  public Map<String, Integer> countSymptoms(List<String> symptoms) {
    Map<String, Integer> symptomCountMap = new HashMap<>();

    for (String symptom : symptoms) {
      symptomCountMap.put(symptom, symptomCountMap.getOrDefault(symptom, 0) + 1);
    }

    return symptomCountMap;
  }

  /**
   *Crée la methode qui trie la liste de symptômes et d'occurences par ordre alphabétique.
   *
   *@param symptoms la map des symptômes et leurs occurences
   *
   *@return une map qui trie les symptômes avec leurs occurences
   */
  public Map<String, Integer> sortSymptoms(Map<String, Integer> symptoms) {
    Map<String, Integer> sortedSymptoms = new TreeMap<>(symptoms);

    return sortedSymptoms;

  }

  /**
   *Crée une methode qui écrit le résultat dans le fichier de sortie.
   *
   *@param symptoms la map des symptômes avec leurs occurences à écrire
   */
  public void writeSymptoms(Map<String, Integer> symptoms) {
    writer.writeSymptoms(symptoms);
  }
}
