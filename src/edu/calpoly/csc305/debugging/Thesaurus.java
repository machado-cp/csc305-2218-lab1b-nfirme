package edu.calpoly.csc305.debugging;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Thesaurus {
  private Map<String, List<String>> synonyms;

  public Thesaurus() {
    synonyms = new HashMap<>();
  }

  /**
   * <p>Adds one or more alternative words to a thesaurus word entry.</p>
   *
   * @param word The amount of incoming damage
   * @param alternatives The list of alternative words to add to the thesaurus
   */

  public void addAlternatives(String word, String... alternatives) {
    List<String> altsArray = Arrays.asList(alternatives);
    if (synonyms.get(word) == null) {
      synonyms.put(word, altsArray);
    } else {
      synonyms.get(word).addAll(altsArray);
    }
  }

  public List<String> alternatives(String word) {
    return synonyms.get(word);
  }
}
