package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *La classe ReadSymptomDataFromFile implémente ISymptomReader.
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

  private String filepath;

  /**
   *Crée une nouvelle instance de ReadSymptomDataFromFile avec le chemin du fichier spécifié.
   *
   *@param filepath un chemin complet ou partiel vers un fichier contenant la liste de symptômes
   */
  public ReadSymptomDataFromFile(String filepath) {
    this.filepath = filepath;
  }

  /**
   * Récupère la liste des symptômes à partir du fichier.
   *
   * @return Une liste de chaînes de caractères des symptômes.
   */

  @Override
  public List<String> getSymptoms() {
    ArrayList<String> result = new ArrayList<String>();

    if (filepath != null) {
      try {
        BufferedReader reader = new BufferedReader(new FileReader(filepath));
        String line = reader.readLine();
        while (line != null) {
          result.add(line);
          line = reader.readLine();
        }
        reader.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    return result;
  }

}