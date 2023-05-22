package com.hemebiotech.analytics;

import java.util.List;

/**
 *Tout ce qui lira les données de symptômes d'une source.
 *La partie importante est la valeur de retour de l'opération,
 *qui est une liste de chaînes, pouvant contenir de nombreux doublons.
 *L'implémentation n'a pas besoin d'ordonner la liste.
 */
public interface ISymptomReader {
  /**
   *Si aucune donnée n'est disponible, renvoie une liste vide.
   *
   * @return une liste brute de tous les symptômes obtenus à partir d'une source de données.
   */
  List<String> getSymptoms();
}
