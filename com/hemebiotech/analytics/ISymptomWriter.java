package com.hemebiotech.analytics;

import java.util.Map;


public interface ISymptomWriter {

  /** 
   * Ecrit les symptômes et leurs quantités dans le fichier.
   *
   * @param symptoms la liste des symptômes avec leurs quantités
   */
  public void writeSymptoms(Map<String, Integer> symptoms);
}
